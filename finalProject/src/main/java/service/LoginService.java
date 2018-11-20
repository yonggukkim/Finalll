package service;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import command.LoginSession;
import repository.LoginRepository;

@Service
public class LoginService {
	HttpSession session = null;

	@Autowired
	private LoginRepository loginRepository;
	
	public String comparisonLogin(HttpServletRequest request, LoginSession loginSession, Model model, HttpServletResponse response) {
		String returnURL="";
		session = request.getSession();
		if(session.getAttribute("info") != null) {
			session.removeAttribute("info");
		}
		System.out.println("login service"+loginSession.getCommandId());
		System.out.println("login service"+loginSession.getCommandPw());
		LoginSession ml = loginRepository.comparisonLogin(loginSession);
		System.out.println("ml"+ml);
		System.out.println("test"+ml.getCommandDvice());
		int result = 0;
		if(ml != null) {
			if(!ml.getCommandPw().equals(loginSession.getCommandPw())) {
				result = 2;
			}else {
				session.setAttribute("info", ml);
				result = 4;
				returnURL = "redirect:main";
				if(loginSession.isCommandCookie()) {
					Cookie cookie = new Cookie("loginCookie", session.getId());
					cookie.setPath("/");
					cookie.setMaxAge(60*60*24*7);
					response.addCookie(cookie);
				}
			}
		}else {
			result = 1;
			returnURL = "redirect:login";
		}
		System.out.println("result"+result);
		model.addAttribute("result", result);
		return returnURL;
	}
	public void keepLogin(String uid, String sessionId, Date next) {
		loginRepository.keepLogin(uid, sessionId, next);
	}
	public LoginSession checkUserWithSessionKey(String sessionId) {
		return loginRepository.checkUserWithSessionKey(sessionId);
	}
}
