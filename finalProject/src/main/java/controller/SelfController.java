package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SelfController {

	// 자유여행 메인페이지로 이동
	@RequestMapping(value = "/self_main", method = RequestMethod.GET)
	public String selfMain(Model model) {
		return "self/selfMain";
	}
	// 자유여행 상세페이지로 이동
	@RequestMapping(value = "/self_detail", method = RequestMethod.GET)
	public String self_detail(Model model) {
		return "self/selfDetail";
	}
	
	
}
