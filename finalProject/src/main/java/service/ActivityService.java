package service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import command.LoginSession;
import model.Activitys;
import model.Restore;
import repository.ActivityRepository;

@Service
public class ActivityService implements ApplicationContextAware {
	private WebApplicationContext context = null;

	@Autowired
	private ActivityRepository activityRepository;

	public Integer insertActivity(Activitys activity, Model model, HttpSession session) {
		LoginSession loginSession = (LoginSession)session.getAttribute("info");
		activity.setStaffNumber(loginSession.getCommandNum());
		System.out.println("service"+ activity.getStaffNumber());
		System.out.println("service"+ activity.getActivityName());
		System.out.println("service"+ activity.getActivityContent());
		Integer result = activityRepository.insertActivity(activity);

		upload(activity);
		model.addAttribute("activity",activity);
		return result;
	}

	private void upload(Activitys activity) {
		String cpath = "C:/a01_prg/workspace/javaexp/springboard/WebContent/z01_upload";
		String path = context.getServletContext().getRealPath("z01_upload");
		File file;
		Restore res;

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
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        
        this.context = (WebApplicationContext) applicationContext;
    }
}
