package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String handleStep2(Model model) {
		model.addAttribute("bodyPage", "member/join.jsp");
		return "main";
	}
}
