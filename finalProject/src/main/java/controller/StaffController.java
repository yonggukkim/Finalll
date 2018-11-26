package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Activitys;
import model.Hotel;
import model.Pkg;
import service.ActivityService;
import service.HotelService;
import service.PkgService;

@Controller
public class StaffController {
	@Autowired
	private ActivityService activityService;
	@Autowired
	private HotelService hotelService;
	@Autowired
	private PkgService pkgService;
	
	@RequestMapping(value="/product", method = RequestMethod.GET)
	public String handleStep1(Activitys activity, Hotel hotel, Pkg pkg, Model model) {
		List<Activitys> list = activityService.selectActivityList(activity, model);
		List<Hotel> hotellist = hotelService.selectHotelList(hotel, model);
		List<Pkg> pkglist = pkgService.selectPkgList(pkg, model);
		model.addAttribute("bodyPage", "product/product_list.jsp");
		return "main";
	}
}
