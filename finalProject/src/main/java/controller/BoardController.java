package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Qna;
import service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/qna_insert", method = RequestMethod.GET)
	public String qnaInsertGet(Qna qna, Model model) {
		System.out.println("GET INSERT");
		return "qnaBoard/qna_insert";
	}

	@RequestMapping(value = "/qna_insert", method = RequestMethod.POST)
	public String qnaInsertPost(Qna qna, Model model, HttpServletRequest request) {
		Integer result = null;
		System.out.println("post");
		result = boardService.insertQna(qna);
		List<Qna> list = boardService.selectQna(qna);
		if (result > 0) {

			model.addAttribute("qna", qna);
			model.addAttribute("list", list);
			System.out.println(qna.getQnaNum());
			System.out.println(list.size());
			return "qnaBoard/qna_list";
		} else {
			return "qnaBoard/qna_insert";
		}
	}

	@RequestMapping(value = "/qna_list", method = RequestMethod.GET)
	public String qnaListGet(Qna qna,Model model) {
		System.out.println("GET LIST");
		return "qnaBoard/qna_list";
	}
//	@RequestMapping(value = "/qna_list", method = RequestMethod.GET)
//	public String qnaListGet(Qna qna, Model model) {
//		System.out.println("GET LIST");
//		if(result!=null) {
//			model.addAttribute("qna", qna);
//			System.out.println(qna.getMemberNum());
//			return "qnaBoard/qna_list";
//		}
//		return "qnaBoard/qna_list";
//	}

//	@RequestMapping(value = "/qna_list", method = RequestMethod.POST)
//	public String qnaListPost(Qna qna, Model model) {
//		Integer result = null;
//		System.out.println("post");
//		result = boardService.insertQna(qna);
//		if (result > 0) {
//			model.addAttribute("qna", qna);
//			System.out.println(qna);
//			return "redirect:qna_list";
//		} else {
//			return "qnaBoard/qna_insert";
//		}
//	}

//	@RequestMapping(value = "/qna_modify", method = RequestMethod.GET)
//	public String qnaModify(Model model) {
//		return "qnaBoard/qna_modify";
//	}
//
//	@RequestMapping(value = "/qna_detail", method = RequestMethod.GET)
//	public String qnaDetail(Model model) {
//		return "reviewBoard/qna_detail";
//	}
//
//	@RequestMapping(value = "/qna_delete", method = RequestMethod.GET)
//	public String qnaDelete(Model model) {
//		return "qnaBoard/qna_delete";
//	}
//
//	// 공지사항 게시판
//	@RequestMapping(value = "/notice_insert", method = RequestMethod.GET)
//	public String noticeInsert(Model model) {
//		return "noticeBoard/notice_insert";
//	}
//
//	@RequestMapping(value = "/notice_modify", method = RequestMethod.GET)
//	public String noticeModify(Model model) {
//		return "noticeBoard/notice_modify";
//	}
//
//	@RequestMapping(value = "/notice_list", method = RequestMethod.GET)
//	public String noticeList(Model model) {
//		return "noticeBoard/notice_list";
//	}
//
//	@RequestMapping(value = "/notice_detail", method = RequestMethod.GET)
//	public String noticeDetail(Model model) {
//		return "noticeBoard/notice_detail";
//	}
//
//	@RequestMapping(value = "/notice_delete", method = RequestMethod.GET)
//	public String noticeDelete(Model model) {
//		return "noticeBoard/notice_delete";
//	}
//
//	// 후기게시판
//	@RequestMapping(value = "/review_insert", method = RequestMethod.GET)
//	public String reviewInsert(Model model) {
//		return "reviewBoard/review_insert";
//	}
//
//	@RequestMapping(value = "/review_modify", method = RequestMethod.GET)
//	public String reviewModify(Model model) {
//		return "reviewBoard/review_modify";
//	}
//
//	@RequestMapping(value = "/review_list", method = RequestMethod.GET)
//	public String reviewList(Model model) {
//		return "reviewBoard/review_list";
//	}
//
//	@RequestMapping(value = "/review_detail", method = RequestMethod.GET)
//	public String reviewDetail(Model model) {
//		return "reviewBoard/review_detail";
//	}
//
//	@RequestMapping(value = "/review_delete", method = RequestMethod.GET)
//	public String reviewDelete(Model model) {
//		return "reviewBoard/review_delete";
//	}
//
//	// 자유여행플랜게시판
//	@RequestMapping(value = "/selfPlan_insert", method = RequestMethod.GET)
//	public String selfPlanInsert(Model model) {
//		return "selfPlanBoard/selfPlan_insert";
//	}
//
//	@RequestMapping(value = "/selfPlan_modify", method = RequestMethod.GET)
//	public String selfPlanModify(Model model) {
//		return "selfPlanBoard/selfPlan_modify";
//	}
//
//	@RequestMapping(value = "/selfPlan_list", method = RequestMethod.GET)
//	public String selfPlanList(Model model) {
//		return "selfPlanBoard/selfPlan_list";
//	}
//
//	@RequestMapping(value = "/selfPlan_detail", method = RequestMethod.GET)
//	public String selfPlanDetail(Model model) {
//		return "selfPlanBoard/selfPlan_detail";
//	}
//
//	@RequestMapping(value = "/selfPlan_delete", method = RequestMethod.GET)
//	public String selfPlanDelete(Model model) {
//		return "selfPlanBoard/selfPlan_delete";
//	}
}
