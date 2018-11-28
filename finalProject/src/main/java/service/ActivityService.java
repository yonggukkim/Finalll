package service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import command.ActivityCommand;
import command.LoginSession;
import model.Activitys;
import model.Restore;
import repository.ActivityRepository;

@Service
public class ActivityService implements ApplicationContextAware {
	private WebApplicationContext context = null;

	@Autowired
	private ActivityRepository activityRepository;

	public Integer insertActivity(ActivityCommand activity, Model model, HttpSession session) {
		Activitys act = new Activitys();
		LoginSession loginSession = (LoginSession)session.getAttribute("info");
		act.setStaffNumber(loginSession.getCommandNum());
		act.setActivityName(activity.getActivityName());
		act.setActivityCate(activity.getActivityCate());
		act.setActivityCompany(activity.getActivityCompany());
		act.setActivityPresident(activity.getActivityPresident());
		act.setActivityTel(activity.getActivityTel());
		act.setCityNum(activity.getCityNum());
		act.setCountryNum(activity.getCountryNum());
		act.setActivityPrice(activity.getActivityPrice());
		act.setActivityContent(activity.getActivityContent());
		act.setContinentName(activity.getContinentName());
		List<Restore> list = upload(activity.getActivityFile(), activity.getActivityName());
		System.out.println("sdads adadsasdsda : "+list.size());
		Integer result = activityRepository.insertActivity(act, list);
		model.addAttribute("activity",act);
		return result;
	}

	private List<Restore> upload(MultipartFile[] a, String b) {
		String path = context.getServletContext().getRealPath("WEB-INF\\view\\files");
		System.out.println("path dddd"+ path);
		File file;
		Restore res;
		String storedFileName;
		String originalFile;
		String originalFileExtension;
		List<Restore> list = new ArrayList<Restore>();
		System.out.println("a size : " +a.length);
		for (MultipartFile mf : a) {	
			originalFile = mf.getOriginalFilename();
			originalFileExtension = originalFile.substring(originalFile.lastIndexOf("."));
			storedFileName = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension;
			file = new File(path, storedFileName);
			res = new Restore( path, mf.getOriginalFilename(), storedFileName, b); // res의 vo객체 만들어짐 (경로, 파일명, 설명)
			// stream 형식의 파일 -> 실제파일로 전환하면 저장
			try {
				mf.transferTo(file);				
				list.add(res);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        
        this.context = (WebApplicationContext) applicationContext;
    }

	public List<Activitys> selectActivityList(Activitys activity, Model model) {
		List<Activitys> list = activityRepository.selectActivityList(activity);
		model.addAttribute("actlist", list);
		return list;
	}

	public void selectActivityOne(Activitys activity, Model model) {
		System.out.println("service detail : " + activity.getActivityNum());
		Activitys acts = activityRepository.selectActivityOne(activity);
		System.out.println("service detail after : " + acts.getActivityNum());
		System.out.println("service detail after : " + acts.getStaffNumber());
		model.addAttribute("activitydetail", acts);
	}

	public void modifyActivityOne(String activityNum, Model model) {
		Activitys act = new Activitys();
		act = activityRepository.modifyActivityOne(activityNum);
		model.addAttribute("modify", act);
	}

	public String updateActivity(Activitys activity, Model model) {
		Integer result = activityRepository.updateActivity(activity);
		String u = null;
		if(result > 0) {
			model.addAttribute("actlist", activity);
			u = "redirect:product";
		}else {
			model.addAttribute("bodyPage","product/activity_modify.jsp");
			u = "main";
		}
		return u;
	}

	public String deleteActivity(String activityNum, Model model) {
		String u = null;
		Integer result = activityRepository.deleteActivity(activityNum);
		if(result > 0) {
			model.addAttribute("result", result);
			u = "redirect:product";
		}else {
			model.addAttribute("bodyPage","product/activity_modify.jsp");
			u = "main";
		}
		return u;
	}
}
