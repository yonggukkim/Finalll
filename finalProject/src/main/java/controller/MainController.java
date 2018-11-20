package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.LoginSession;
import service.LoginService;

@Controller
public class MainController {
	@Autowired
	private LoginService loginService;
	// 자유여행 메인페이지로 이동
	@RequestMapping(value = "/selfMain", method = RequestMethod.GET)
	public String selfMain(@ModelAttribute("SpringWeb")LoginSession loginSession, Model model) {
		return "self/selfMain";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(LoginSession loginSession, Model model) {
		System.out.println("login controller");
		model.addAttribute("loginSession", loginSession);
		model.addAttribute("bodyPage", "login.jsp");
		return "main";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login1(HttpServletRequest request, LoginSession loginSession, Model model, HttpServletResponse response) {
		System.out.println("login controller"+loginSession.getCommandId());
		System.out.println("login controller"+loginSession.getCommandPw());
		return loginService.comparisonLogin(request, loginSession, model, response);
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		Object obj = session.getAttribute("info");
		if(obj != null) {
			LoginSession dto = (LoginSession)obj;
			session.removeAttribute("info");
			session.invalidate();
			
		}
		return "redirect:main";
	}
}
