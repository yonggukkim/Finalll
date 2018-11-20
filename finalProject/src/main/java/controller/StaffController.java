package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Activity;

@Controller
public class StaffController {
	
	@RequestMapping(value="/product", method = RequestMethod.GET)
	public String handleStep1(Model model) {
		model.addAttribute("bodyPage", "product/product_list.jsp");
		return "main";
	}
}
