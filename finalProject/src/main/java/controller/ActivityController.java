package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Activitys;
import model.Continent;
import model.Country;
import service.ActivityService;
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
	@Autowired
	private ActivityService activityService;
	
	@RequestMapping(value = "/activity_insert", method = RequestMethod.GET)
	public String activityInsertGet(Activitys activity, Model model, HttpSession session) {
		System.out.println("controller1");
		categoryService.continentSelect(model);
		model.addAttribute("activity", activity);
		System.out.println("cntlr activityInsertGet activity : " + activity);
		model.addAttribute("bodyPage","product/activity_insert.jsp");
		System.out.println("GET INSERT");
		return "main";
	}
	
	
	@RequestMapping(value = "/activity_insert", method = RequestMethod.POST)
	public String activityInsertPost(Activitys activity, Model model, HttpSession session) {
		System.out.println("POST INSERT");
		Integer result = null;
		System.out.println("controller getActivityName"+ activity.getActivityName());
		System.out.println("controller getActivityCate"+ activity.getActivityCate());
		System.out.println("controller getActivityCompany"+ activity.getActivityCompany());
		System.out.println("controller getActivityPresident"+ activity.getActivityPresident());
		System.out.println("controller getActivityTel"+ activity.getActivityTel());
		System.out.println("controller getCityNum"+ activity.getCityNum());
		System.out.println("controller getCountryNum"+ activity.getCountryNum());
		System.out.println("controller getActivityPrice"+ activity.getActivityPrice());
		System.out.println("controller"+ activity.getActivityContent());
		System.out.println("controller getContinentName"+ activity.getContinentName());
		result = activityService.insertActivity(activity, model, session);
		if(result != null) {
			System.out.println("result"+result);
			return "redirect:/product";
		}else {
			return "redirect:/insert";
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
