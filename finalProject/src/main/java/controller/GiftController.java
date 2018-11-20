package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GiftController {

	@RequestMapping(value = "/self_gift_list", method = RequestMethod.GET)
	public String handleStep1(Model model) {
		return "gift/self_gift_list";

	}
	@RequestMapping(value = "/self_gift_detail", method = RequestMethod.GET)
	public String handleStep2(Model model) {
		return "gift/self_gift_detail";

	}
	
}
