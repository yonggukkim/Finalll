package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.PkgCommand;
import command.PkgMainListCommand;
import model.Activitys;
import model.City;
import model.Continent;
import model.Country;
import model.Hotel;
import model.Pkg;
import model.PkgTouristInfo;
import service.CategoryService;
import service.PkgService;

@Controller
public class PkgController {
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private PkgService pkgService;
	
	@RequestMapping(value = "/pkg_insert", method = RequestMethod.GET)
	public String pkgInsertGet( Model model, HttpSession session) {
		session.removeAttribute("activitycart");
		session.removeAttribute("hotelcart");
		PkgCommand pkg = new PkgCommand();
		System.out.println("controller1");
		categoryService.continentSelectPkg(model);
		model.addAttribute("pkg", pkg);
		System.out.println("cntlr pkgInsertGet : " + pkg);
		model.addAttribute("bodyPage","product/pkg_insert.jsp");
		System.out.println("GET INSERT");
		return "main";
	}
	
	@RequestMapping(value="/pcountry", method=RequestMethod.POST)
	public String country(Continent continent, Model model){
		System.out.println("controller2 "+continent.getContinentName());
		categoryService.countrySelectPkg(continent, model);
		return "category/pcountry";
	}
	
	@RequestMapping(value="/pcity", method=RequestMethod.POST)
	public String city(Country country, Model model) {
		System.out.println("controller3 "+country.getCountryNum());
		System.out.println("controller3 "+country.getContinentName());
		categoryService.citySelectPkg(country, model);
		return "category/pcity";
	}
	
	@RequestMapping(value="/photel_list", method=RequestMethod.POST)
	public String hotel(City city, Model model) {
		System.out.println("controller3 "+city.getCountryNum());
		System.out.println("controller3 "+city.getContinentName());
		System.out.println("controller3 "+city.getCityNum());
		pkgService.hotelSelectPkg(city, model);
		return "product/pkg_hotel_list";
	}
	
	@RequestMapping(value="/pactivity_list", method=RequestMethod.POST)
	public String activity(City city, Model model) {
		System.out.println("controller3 "+city.getCountryNum());
		System.out.println("controller3 "+city.getContinentName());
		System.out.println("controller3 "+city.getCityNum());
		pkgService.activitySelectPkg(city, model);
		return "product/pkg_activity_list";
	}
	
	@RequestMapping(value="/photel_modify", method=RequestMethod.POST)
	public String hotel(Hotel hotel, Model model, HttpSession session) {
		System.out.println("controller3 "+hotel.getCountryNum());
		System.out.println("controller3 "+hotel.getContinentName());
		System.out.println("controller3 "+hotel.getCityNum());
		System.out.println("controller3 "+hotel.getHotelNum());
		pkgService.hotelSelectOnePkg(hotel, model, session);
		return "product/pkg_hotel_modify";
	}
	
	@RequestMapping(value="/pactivity_modify", method=RequestMethod.POST)
	public String activity(Activitys activity, Model model, HttpSession session) {
		System.out.println("controller3 "+activity.getCountryNum());
		System.out.println("controller3 "+activity.getContinentName());
		System.out.println("controller3 "+activity.getCityNum());
		System.out.println("controller3 "+activity.getActivityNum());
		pkgService.activitySelectOnePkg(activity, model, session);
		return "product/pkg_activity_modify";
	}
	
	@RequestMapping(value = "/pkg_insert", method = RequestMethod.POST)
	public String pkgInsertPost(PkgCommand pkg, Model model, HttpSession session) {
		
		
		System.out.println("POST INSERT");
		Integer result = null;
		System.out.println(pkg.getCityNum());
		System.out.println(pkg.getContinentName());
		System.out.println(pkg.getCountryNum());
		System.out.println(pkg.getGuideNum());
		System.out.println(pkg.getPkgCate());
		System.out.println(pkg.getPkgCaution());
		System.out.println(pkg.getPkgContent());
		System.out.println(pkg.getPkgMeetingPlace());
		System.out.println(pkg.getPkgName());
		System.out.println(pkg.getPkgPeriod());
		System.out.println(pkg.getPkgReference());
		System.out.println(pkg.getPkgReview());
		System.out.println(pkg.getPkgTheme());
		System.out.println(pkg.getPkgWeatherInfo());
		System.out.println(pkg.getPkgMemberCur());
		System.out.println(pkg.getPkgMemberMax());
		System.out.println(pkg.getPkgMemberMin());
		System.out.println(pkg.getPkgPrice());
		result = pkgService.insertPkg(pkg, model, session);
		if(result != null) {
			System.out.println("result"+result);
			
			
			
			return "redirect:/product";
		}else {
			return "redirect:/pkg_insert";
		}
	}
	
	@RequestMapping(value="pkg_list", method=RequestMethod.GET)
	public String pkgListGet(Pkg pkg, Model model) {
		System.out.println("Get list");
		List<Pkg> list = pkgService.selectPkgList(pkg, model);
		if(list != null) {
			model.addAttribute("list",list);
			System.out.println(list.size());
			return "product/pkg_list";
		}else {
			return "product";
		}
	}
	
	@RequestMapping(value="/pkg_detail", method=RequestMethod.GET)
	public String pkgDetailGet(Pkg pkg, Model model) {
		System.out.println("controller detail : "+ pkg.getPkgNum());
		pkgService.selectPkgOne(pkg, model);
		model.addAttribute("bodyPage","product/pkg_detail.jsp");
		return "main";
	}
	
	@RequestMapping(value="/pkgMain", method=RequestMethod.GET)
	public String pkgMainGet(Model model, PkgMainListCommand pkg) {
		System.out.println("controller pkgmain");
		String s = pkgService.selectPkgproduct(model, pkg);
		return s;
	}
	
	@RequestMapping(value="/pkgDeteil", method=RequestMethod.GET)
	public String pkgDeteilGet(@RequestParam("pkg_num") String pkgNum, Model model, HttpSession session) {
		System.out.println("pkgnum : " + pkgNum);
		String s = pkgService.selectPkgProductList(pkgNum, model, session);
		System.out.println("controller pkgdeteil : " + s);
		return s;
	}
	
	@RequestMapping(value="/pkgOrder", method=RequestMethod.GET)
	public String pkgOrderGet(Model model, PkgTouristInfo pkgTouristInfo) {
		model.addAttribute("pkgTouristInfo", pkgTouristInfo);
		model.addAttribute("bodyPage","pkg/pkgorder.jsp");
		return "main";
	}

	@RequestMapping(value="/pkgOrder", method=RequestMethod.POST)
	public String pkgOrderPost(Model model, PkgTouristInfo pkgTouristInfo) {
		
		model.addAttribute("bodyPage","pkg/pkgpay.jsp");
		return "main";
	}
	
	@RequestMapping(value="/pkgPay", method=RequestMethod.GET)
	public String pkgPayGet(Model model) {
		model.addAttribute("bodyPage","pkg/pkgpay.jsp");
		return "main";
	}

	/*@RequestMapping(value="/pkgPay", method=RequestMethod.POST)
	public String pkgPayPost(Model model) {
		model.addAttribute("bodyPage","pkg/pkgpay.jsp");
		return "main";
	}*/
}
