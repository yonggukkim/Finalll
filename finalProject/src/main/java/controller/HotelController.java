package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.HotelCommand;
import model.Activitys;
import model.Continent;
import model.Country;
import model.Hotel;
import service.CategoryService;
import service.HotelService;
@Controller
public class HotelController {
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private HotelService hotelService;
	
	@RequestMapping(value = "/hotel_insert", method = RequestMethod.GET)
	public String hotelInsertGet(HotelCommand hotel, Model model, HttpSession session) {
		System.out.println("controller1");
		categoryService.continentSelectHotel(model);
		model.addAttribute("hotel", hotel);
		System.out.println("cntlr hotelInsertGet : " + hotel);
		model.addAttribute("bodyPage","product/hotel_insert.jsp");
		System.out.println("GET INSERT");
		return "main";
	}
	
	@RequestMapping(value="/telcountry", method=RequestMethod.POST)
	public String country(Continent continent, Model model){
		System.out.println("controller2 "+continent.getContinentName());
		categoryService.countrySelectHotel(continent, model);
		return "category/telcountry";
	}
	
	@RequestMapping(value="/telcity", method=RequestMethod.POST)
	public String city(Country country, Model model) {
		System.out.println("controller3 "+country.getCountryNum());
		System.out.println("controller3 "+country.getContinentName());
		categoryService.citySelectHotel(country, model);
		return "category/telcity";
	}
	
	@RequestMapping(value = "/hotel_insert", method = RequestMethod.POST)
	public String hotelInsertPost(HotelCommand hotel, Model model, HttpSession session) {
		System.out.println("POST INSERT");
		Integer result = null;
		System.out.println(hotel.getCityNum());
		System.out.println(hotel.getContinentName());
		System.out.println(hotel.getCountryNum());
		System.out.println(hotel.isHotelBreakfast());
		System.out.println(hotel.getHotelCate());
		System.out.println(hotel.getHotelCheckin());
		System.out.println(hotel.getHotelCheckout());
		System.out.println(hotel.getHotelCompany());
		System.out.println(hotel.getHotelContent());
		System.out.println(hotel.getHotelGrade());
		System.out.println(hotel.getHotelName());
		System.out.println(hotel.getHotelPresident());
		System.out.println(hotel.getHotelTel());
		System.out.println(hotel.getHotelPrice());
		result = hotelService.insertHotel(hotel, model, session);
		if(result != null) {
			System.out.println("result"+result);
			return "redirect:/product";
		}else {
			return "redirect:/hotel_insert";
		}
	}
	
	@RequestMapping(value="hotel_list", method=RequestMethod.GET)
	public String hotelListGet(Hotel hotel, Model model) {
		System.out.println("Get list");
		List<Hotel> list = hotelService.selectHotelList(hotel, model);
		
		if(list != null) {
			model.addAttribute("list",list);
			System.out.println(list.size());
			return "product/hotel_list";
		}else {
			return "product";
		}
	}
	
	@RequestMapping(value="/hotel_detail", method=RequestMethod.GET)
	public String hotelDetailGet(Hotel hotel, Model model) {
		System.out.println("controller detail : "+ hotel.getHotelNum());
		hotelService.selectHotelOne(hotel, model);
		model.addAttribute("bodyPage","product/hotel_detail.jsp");
		return "main";
	}
	
	@RequestMapping(value="/hotel_modify", method=RequestMethod.GET)
	public String hotelModifyGet(Hotel hotel, @RequestParam("hotelNum") String hotelNum, Model model) {
		System.out.println("texteaklsdjfdskldsjklf");
		System.out.println("controller modify : "+ hotelNum);
		hotelService.modifyHotelOne(hotelNum, model);
		model.addAttribute("bodyPage","product/hotel_modify.jsp");
		model.addAttribute("hotel",hotel);
		return "main";
	}
	
	@RequestMapping(value="/hotel_modify", method=RequestMethod.POST)
	public String hotelModifyPost(Hotel hotel, Model model) {
		System.out.println("modify controller post");
		System.out.println("controller modify getHotelNum() : "+ hotel.getHotelNum());
		System.out.println("controller modify getHotelName() : "+ hotel.getHotelName());
		System.out.println("controller modify getHotelCate() : "+ hotel.getHotelCate());
		System.out.println("controller modify getHotelContent() : "+ hotel.getHotelContent());
		String result = hotelService.updateHotel(hotel, model);
		return result;
	}
	
	@RequestMapping(value="/hotel_delete", method=RequestMethod.GET)
	public String hotelDeletePost(@RequestParam("hotelNum") String hotelNum, Model model) {
		System.out.println("controller" + hotelNum);
		String result = hotelService.deleteHotel(hotelNum, model);
		model.addAttribute("result", result);
		return result;
	}
}
