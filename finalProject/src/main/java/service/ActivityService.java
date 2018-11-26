package service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

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
		Integer result = activityRepository.insertActivity(act);
		
//		upload(act);
		model.addAttribute("activity",act);
		return result;
	}

//	private void upload(Activitys activity) {
//		String cpath = "C:/Users/HKEDU/eclipse-workspace2/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/finalProject/WEB-INF/view/files";
//		String path = context.getServletContext().getRealPath("files");
//		File file;
//		Restore res;
//
//		for (MultipartFile mf : activity.getActivityFile()) {
//
//			file = new File(path, mf.getOriginalFilename());
//			res = new Restore(path, mf.getOriginalFilename(), activity.getActivityName()); // res의 vo객체 만들어짐 (경로, 파일명, 설명)
//
//			// stream 형식의 파일 -> 실제파일로 전환하면 저장
//			try {
//				mf.transferTo(file);
//				// 파일 정보 입력
//				 Files.copy(Paths.get( path+"/"+mf.getOriginalFilename()),
//	                        Paths.get(cpath+"/"+mf.getOriginalFilename()),
//	                        StandardCopyOption.REPLACE_EXISTING);
//				 activityRepository.insertRestore(res);
//
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		}
//	}
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
