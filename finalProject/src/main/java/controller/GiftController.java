package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import model.Gift;
import model.GiftRestore;
import service.CategoryService;
import service.GiftService;

@Controller
public class GiftController {

	@Autowired
	public GiftService giftService;
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/self_gift_list", method = RequestMethod.GET)
	public String handleStep1(Model model) {
		return "gift/self_gift_list";

	}

	@RequestMapping(value = "/self_gift_detail", method = RequestMethod.GET)
	public String handleStep2(Model model) {
		return "gift/self_gift_detail";

	}

	@RequestMapping(value = "/gift_insert", method = RequestMethod.GET)
	public String giftInsert1(Gift gift, Model model) {
		model.addAttribute("bodyPage", "gift/gift_insert.jsp");
		categoryService.continentSelect(model);
		return "main";
	}

	@RequestMapping(value = "/gift_insert", method = RequestMethod.POST)
	public String giftInsert2(Gift gift, Model model/* , GiftRestore gr */) {
		System.out.println("gift_insert Post 진입");
		System.out.println("POST" + gift.getGiftNum());
		// 일반 특산품 등록
		Integer result = giftService.giftInsert(gift);
		// 특산품 파일 업로드
		/* Integer grResult = giftService.grInsert(gr); */
		for (MultipartFile s : gift.getFiles()) {
			System.out.println("테스트세트스ㅌ세트스티발");
			System.out.println(s.toString());
		}

		if (result > 0) {
			return "redirect:gift_list";
		} else {
			return "gift_insert";
		}

	}

	@RequestMapping(value = "/gift_list", method = RequestMethod.GET)
	public String giftList1(Gift gift, Model model) {
		System.out.println("gift_list post 진입");
		model.addAttribute("bodyPage", "gift/gift_list.jsp");
		List<Gift> list = giftService.giftSelect(gift);
		System.out.println("list null 여부확인" + list);
		model.addAttribute("list", list);

		return "main";
	}

	@RequestMapping(value = "/gift_detail", method = RequestMethod.GET)
	public String giftDetail(@RequestParam(value = "giftNum", defaultValue = "false") String giftNum, Gift gift,
			Model model) {
		System.out.println("gift_detail get 진입");
		System.out.println("giftNum 접수확인 " + giftNum);
		model.addAttribute("bodyPage", "gift/gift_detail.jsp");

		Gift giftDetail = giftService.giftSelectByCondition(gift);
		model.addAttribute("giftDetail", giftDetail);
		/*for (MultipartFile s : gift.getFiles()) {
			System.out.println("테스트세트스ㅌ세트스티발");
			System.out.println(s);
		}*/

		return "main";
	}

	// 미완성
	@RequestMapping(value = "/gift_modify", method = RequestMethod.GET)
	public String giftModify(@RequestParam(value = "giftNum", defaultValue = "false") String giftNum, Gift gift,
			Model model, Gift giftDetail) {
		System.out.println("gift_modify get 진입");
		System.out.println("gift_modify " + giftDetail.getGiftNum());
		System.out.println("gift_modify " + giftDetail.getCityNum());
		System.out.println("gift_modify " + giftNum);
		model.addAttribute("bodyPage", "gift/gift_modify.jsp");

//		giftDetail = giftService.giftSelectByCondition(giftDetail);
		Gift listDetail = giftService.giftSelectByCondition(gift);
		model.addAttribute("listDetail", listDetail);

		System.out.println();
		return "main";

	}

	@RequestMapping(value = "/gift_modify", method = RequestMethod.POST)
	public String giftModifyP(Model model, Gift gift, Gift listDetail) {
		System.out.println("gift_modify_post 진입");
		System.out.println("gift_modify_post giftNum = " + listDetail.getGiftNum());
		System.out.println("gift_modify_post giftNum = " + gift.getGiftNum());
		System.out.println("gift_modify_post ContName = " + gift.getContinentName());
		System.out.println("gift_modify_post giftName = " + listDetail.getGiftName());
		System.out.println("gift_modify_post cityNum = " + listDetail.getCityNum());

		Integer result = giftService.giftModify(gift);
		System.out.println("수정완료쓰!");
		if (result > 0) {
//			return "redirect:gift_detail?giftNum="+gift.getGiftNum();   
			return "redirect:gift_list";
		} else {
			return "redirect:gift_list";
		}

	}

	@RequestMapping(value = "/gift_delete", method = RequestMethod.GET)
	public String giftDeleteG(@RequestParam(value = "giftNum", defaultValue = "false") String giftNum, Gift gift,
			Model model) {
		System.out.println("gift_delete get 진입");
		System.out.println("gift_delete get giftNum " + giftNum);
		model.addAttribute("bodyPage", "gift/gift_delete.jsp");
		model.addAttribute("giftNum", giftNum);

		return "main";
	}

	@RequestMapping(value = "/gift_delete", method = RequestMethod.POST)
	public String giftDeleteP(Gift gift, Model model) {
		System.out.println("gift_delete post 진입");
		System.out.println("gift_delete post giftNum " + gift.getGiftNum());
		Integer result = giftService.giftDelete(gift);

		if (result > 0) {
			return "redirect:gift_list";
		}

		return "gift_list";
	}

	@RequestMapping(value="/gift_list_byName", method = RequestMethod.POST)
	public String giftSearchByName( Gift gift,  Model model) {
		System.out.println("gift Controller Get 진입");
		model.addAttribute("bodyPage", "gift/gift_list.jsp");
		List<Gift> searchedList = giftService.giftSelectByName(gift);
		System.out.println("searchedList null 여부 확인"+ searchedList);
		model.addAttribute("list", searchedList);
		return "main";
	}
	
	@RequestMapping(value="/gift_sale_page", method=RequestMethod.GET)
	public String giftTest(Gift gift, Model model) {
		System.out.println("giftTest 진입");
		model.addAttribute("bodyPage","gift/gift_sale_page.jsp");
		List<Gift> list = giftService.giftSelect(gift);
		System.out.println("list null 여부확인" + list);
		model.addAttribute("list", list);

		return "main";
	}
	
}
