package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.ActivityCommand;
import model.Activitys;
import model.Continent;
import model.Country;
import service.ActivityService;
import service.CategoryService;

@Controller
public class ActivityController {
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
	public String activityInsertPost(ActivityCommand activity, Model model, HttpSession session) {
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
			return "redirect:/activity_insert";
		}
	}
	
	@RequestMapping(value="/actcountry", method=RequestMethod.POST)
	public String country(Continent continent, Model model){
		System.out.println("controller2 "+continent.getContinentName());
		categoryService.countrySelect(continent, model);
		return "category/actcountry";
	}
	
	@RequestMapping(value="/actcity", method=RequestMethod.POST)
	public String city(Country country, Model model) {
		System.out.println("controller3 "+country.getCountryNum());
		System.out.println("controller3 "+country.getContinentName());
		categoryService.citySelect(country, model);
		return "category/actcity";
	}
	
	@RequestMapping(value="/activity_detail", method=RequestMethod.GET)
	public String activityDetailGet(Activitys activity, Model model) {
		System.out.println("controller detail : "+ activity.getActivityNum());
		activityService.selectActivityOne(activity, model);
		model.addAttribute("bodyPage","product/activity_detail.jsp");
		return "main";
	}
	
	@RequestMapping(value="/activity_modify", method=RequestMethod.GET)
	public String activityModifyGet(Activitys activity, @RequestParam("activityNum") String activityNum, Model model) {
		System.out.println("texteaklsdjfdskldsjklf");
		System.out.println("controller modify : "+ activityNum);
		activityService.modifyActivityOne(activityNum, model);
		model.addAttribute("bodyPage","product/activity_modify.jsp");
		model.addAttribute("activity",activity);
		return "main";
	}
	
	@RequestMapping(value="/activity_modify", method=RequestMethod.POST)
	public String activityModifyPost(Activitys activity, Model model) {
		System.out.println("modify controller post");
		System.out.println("controller modify getActivityNum() : "+ activity.getActivityNum());
		System.out.println("controller modify getActivityName() : "+ activity.getActivityName());
		System.out.println("controller modify getActivityCate() : "+ activity.getActivityCate());
		System.out.println("controller modify getActivityContent() : "+ activity.getActivityContent());
		String result = activityService.updateActivity(activity, model);
		return result;
	}
	
	@RequestMapping(value="activity_list", method=RequestMethod.GET)
	public String activityListGet(Activitys activity, Model model) {
		System.out.println("Get list");
		List<Activitys> list = activityService.selectActivityList(activity, model);
		if(list != null) {
			model.addAttribute("list",list);
			System.out.println(list.size());
			return "product/activity_list";
		}else {
			return "product";
		}
	}
	
	@RequestMapping(value="/activity_delete", method=RequestMethod.GET)
	public String activityDeletePost(@RequestParam("activityNum") String activityNum, Model model) {
		System.out.println("controller" + activityNum);
		String result = activityService.deleteActivity(activityNum, model);
		model.addAttribute("result", result);
		return result;
	}
}
