package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Activity;
import model.Continent;
import model.Country;
import service.CategoryService;

@Controller
public class ActivityController {
	/*@RequestMapping(value = "/activity_list", method = RequestMethod.GET)
	public String activityListGet(Activity activity, Model model) {
		model.addAttribute("activity", activity);
		System.out.println("GET INSERT");
		return "product/activity_list";
	}*/
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/activity_insert", method = RequestMethod.GET)
	public String activityInsertGet(Activity activity, Model model) {
		System.out.println("controller1");
		categoryService.continentSelect(model);
		model.addAttribute("activity", activity);
		model.addAttribute("bodyPage","product/activity_insert.jsp");
		System.out.println("GET INSERT");
		return "main";
	}
	
	
	@RequestMapping(value = "/activity_insert", method = RequestMethod.POST)
	public String activityInsertPost(Activity activity, Model model) {
		Integer result = null;
		System.out.println("POST INSERT");
		/*result = activityService.insertActivity(activity);*/
		if (result > 0) {
			model.addAttribute("activity", activity);
			System.out.println(activity.getActivityNum());
			return "redirect:product";
		} else {
			return "redirect:main";
		}
	}
	@RequestMapping(value="/country", method=RequestMethod.POST)
	public String country(Continent continent, Model model){
		System.out.println("controller2 "+continent.getContinentName());
		categoryService.countrySelect(continent, model);
		return "category/country";
	}
	
	@RequestMapping(value="/city", method=RequestMethod.POST)
	public String city(Country country, Model model) {
		System.out.println("controller3 "+country.getCountryNum());
		System.out.println("controller3 "+country.getContinentName());
		categoryService.citySelect(country, model);
		return "category/city";
	}
}
