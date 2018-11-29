package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Notice;
import model.Qna;
import model.Review;
import service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/notice_board", method = RequestMethod.GET)
	public String handleStep1(Qna qna, Review review, Notice notice, Model model) {
		List<Qna> list = boardService.selectQnaList(qna);
		List<Review> list2 = boardService.selectReviewList(review);
		List<Notice> list3 = boardService.selectNoticeList(notice);
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		model.addAttribute("list3", list3);
		model.addAttribute("bodyPage", "notice_board.jsp");
		return "main";
	}

	@RequestMapping(value = "/qna_list", method = RequestMethod.GET)
	public String qnaListGet(Qna qna, Model model) {
		System.out.println("Controller qnaListGet");
		List<Qna> list = boardService.selectQnaList(qna);
		if (list != null) {
			model.addAttribute("list", list);
			System.out.println("Controller qnaListGet listSize " + list.size());
			return "redirect:notice_board";
		} else {
			return "qnaBoard/qna_list";
		}
	}

	@RequestMapping(value = "/review_list", method = RequestMethod.GET)
	public String reviewListGet(Review review, Model model) {
		System.out.println("Controller reviewListGet");
		List<Review> list = boardService.selectReviewList(review);
		if (list != null) {
			model.addAttribute("list2", list);
			System.out.println("Controller reviewListGet listSize " + list.size());
			return "redirect:notice_board";
		} else {
			return "reviewBoard/review_list";
		}

	}

	@RequestMapping(value = "/notice_list", method = RequestMethod.GET)
	public String noticeListGet(Notice notice, Model model) {
		System.out.println("Controller noticeListGet");
		List<Notice> list = boardService.selectNoticeList(notice);
		if (list != null) {
			model.addAttribute("list3", list);
			System.out.println("Controller noticeListGet lis" + "" + "tSize " + list.size());
			return "redirect:notice_board";
		} else {
			return "noticeBoard/notice_list";
		}
	}

	@RequestMapping(value = "/qna_list", method = RequestMethod.POST)
	public String qnaListPost(Qna qna, Model model, HttpSession session) {
		System.out.println("Controller qnaListPost");
		List<Qna> list = boardService.selectQnaList(qna);
		if (list != null) {
			model.addAttribute("list", list);
			System.out.println("Controller qnaListPost listSize " + list.size());
			return "qnaBoard/qna_list";
		} else {
			return "qnaBoard/qna_list";
		}
	}

	@RequestMapping(value = "/qna_insert", method = RequestMethod.GET)
	public String qnaInsertGet(Qna qna, Model model) {
		System.out.println("Controller qnaInsertGet");
		model.addAttribute("bodyPage", "qnaBoard/qna_insert.jsp");
		return "main";
	}

	@RequestMapping(value = "/review_insert", method = RequestMethod.GET)
	public String reviewInsertGet(Review review, Model model) {
		System.out.println("Controller reviewInsertGet");
		return "reviewBoard/review_insert";
	}

	@RequestMapping(value = "/notice_insert", method = RequestMethod.GET)
	public String noticeInsertGet(Notice notice, Model model) {
		System.out.println("Controller noticeInsertGet");
		return "noticeBoard/notice_insert";
	}

	@RequestMapping(value = "/qna_insert", method = RequestMethod.POST)
	public String qnaInsertPost(Qna qna, Model model) {
		System.out.println("Controller qnaInsertPost");
		Integer result = null;
		result = boardService.insertQna(qna);
		List<Qna> list = boardService.selectQnaList(qna);
		if (result > 0) {
			model.addAttribute("qna", qna);
			model.addAttribute("list", list);
			System.out.println("Controller qnaInsertPost qnaNum " + qna.getQnaNum());
			System.out.println("Controller qnaInsertPost listSize " + list.size());
			return "redirect:notice_board";
		} else {
			return "redirect:main";
		}
	}

	@RequestMapping(value = "/review_insert", method = RequestMethod.POST)
	public String reviewInsertPost(Review review, Model model) {
		System.out.println("Controller reviewInsertPost");
		Integer result = null;
		result = boardService.insertReview(review);
		List<Review> list = boardService.selectReviewList(review);
		if (result > 0) {
			model.addAttribute("review", review);
			model.addAttribute("list", list);
			System.out.println("Controller reviewInsertPost reviewNum " + review.getReviewNum());
			System.out.println("Controller reviewInsertPost listSize " + list.size());
			return "redirect:notice_board";
		} else {
			return "redirect:main";
		}
	}

	@RequestMapping(value = "/notice_insert", method = RequestMethod.POST)
	public String noticeInsertPost(Notice notice, Model model) {
		System.out.println("Controller noticeInsertPost");
		Integer result = null;
		result = boardService.insertNotice(notice);
		List<Notice> list = boardService.selectNoticeList(notice);
		if (result > 0) {
			model.addAttribute("notice", notice);
			model.addAttribute("list", list);
			System.out.println("Controller noticeInsertPost noticeNum " + notice.getNoticeNum());
			System.out.println("Controller noticeInsertPost listSize " + list.size());
			return "redirect:notice_board";
		} else {
			return "redirect:main";
		}
	}

	@RequestMapping(value = "/qna_detail", method = RequestMethod.GET)
	public String qnaDetailGet(Qna qna, @RequestParam(value = "qnaNum", defaultValue = "false") String qnaNum,
			Model model) {
		System.out.println("Controller qnaDetailGet");
		model.addAttribute("qna", qna);
		Qna list = boardService.selectQnaOne(qna);
		model.addAttribute("qna", list);
		return "qnaBoard/qna_detail";
	}

	@RequestMapping(value = "/review_detail", method = RequestMethod.GET)
	public String reviewDetailGet(Review review,
			@RequestParam(value = "reviewNum", defaultValue = "false") String reviewNum, Model model) {
		System.out.println("Controller reviewDetailGet");
		model.addAttribute("review", review);
		Review list = boardService.selectReviewOne(review);
		model.addAttribute("review", list);
		return "reviewBoard/review_detail";
	}

	@RequestMapping(value = "/notice_detail", method = RequestMethod.GET)
	public String noticeDetailGet(Notice notice,
			@RequestParam(value = "noticeNum", defaultValue = "false") String noticeNum, Model model) {
		System.out.println("Controller noticeDetailGet");
		model.addAttribute("notice", notice);
		Notice list = boardService.selectNoticeOne(notice);
		model.addAttribute("notice", list);
		return "noticeBoard/notice_detail";

	}

	@RequestMapping(value = "/qna_delete", method = RequestMethod.GET)
	public String qnaDeleteGet(Qna qna, @RequestParam(value = "qnaNum", defaultValue = "false") String qnaNum,
			Model model) {
		System.out.println("Controller qnaDeleteGet qnaNum " + qnaNum);
		model.addAttribute("qnaNum", qnaNum);
		return "qnaBoard/qna_delete";
	}

	@RequestMapping(value = "/review_delete", method = RequestMethod.GET)
	public String reviewDeleteGet(Review review,
			@RequestParam(value = "reviewNum", defaultValue = "false") String reviewNum, Model model) {
		System.out.println("Controller reviewDeleteGet reviewNum " + reviewNum);
		model.addAttribute("reviewNum", reviewNum);
		return "reviewBoard/review_delete";
	}

	@RequestMapping(value = "/notice_delete", method = RequestMethod.GET)
	public String noticeDeleteGet(Notice notice,
			@RequestParam(value = "noticeNum", defaultValue = "false") String noticeNum, Model model) {
		System.out.println("Controller noticeDeleteGet noticeNum " + noticeNum);
		model.addAttribute("noticeNum", noticeNum);
		return "noticeBoard/notice_delete";
	}

	@RequestMapping(value = "/qna_delete", method = RequestMethod.POST)
	public String qnaDeletePost(String qnaNum, Qna qna, Model model) {
		System.out.println("Controller qnaDeletePost");
		System.out.println("Controller qnaDeletePost qnaNum " + qnaNum);
		Integer result = boardService.deleteQna(qna.getQnaNum());
		if (result > 0) {
			model.addAttribute("result", result);
			return "redirect:qna_list";
		} else {
			return "redirect:qna_detail";
		}
	}

	@RequestMapping(value = "/review_delete", method = RequestMethod.POST)
	public String reviewDeletePost(String reviewNum, Review review, Model model) {
		System.out.println("Controller reviewDeletePost");
		System.out.println("Controller reviewDeletePost reviewNum " + reviewNum);
		Integer result = boardService.deleteReview(review.getReviewNum());
		if (result > 0) {
			model.addAttribute("result", result);
			return "redirect:review_list";
		} else {
			return "redirect:review_detail";
		}
	}

	@RequestMapping(value = "/notice_delete", method = RequestMethod.POST)
	public String noticeDeletePost(String noticeNum, Notice notice, Model model) {
		System.out.println("Controller noticeDeletePost");
		System.out.println("Controller noticeDeletePost noticeNum " + noticeNum);
		Integer result = boardService.deleteNotice(notice.getNoticeNum());
		if (result > 0) {
			model.addAttribute("result", result);
			return "redirect:notice_list";
		} else {
			return "redirect:notice_detail";
		}
	}

	@RequestMapping(value = "/qna_modify", method = RequestMethod.GET)
	public String qnaModifyGet(Qna qna, @RequestParam(value = "qnaNum", defaultValue = "false") String qnaNum,
			Model model) {
		System.out.println("Controller qnaModifyGet qnaNum " + qnaNum);
		model.addAttribute("qnaNum", qnaNum);
		return "qnaBoard/qna_modify";
	}

	@RequestMapping(value = "/review_modify", method = RequestMethod.GET)
	public String reviewModifyGet(Review review,
			@RequestParam(value = "reviewNum", defaultValue = "false") String reviewNum, Model model) {
		System.out.println("Controller reviewModifyGet reviewNum " + reviewNum);
		model.addAttribute("reviewNum", reviewNum);
		return "reviewBoard/review_modify";
	}

	@RequestMapping(value = "/notice_modify", method = RequestMethod.GET)
	public String noticeModifyGet(Notice notice,
			@RequestParam(value = "noticeNum", defaultValue = "false") String noticeNum, Model model) {
		System.out.println("Controller noticeModifyGet noticeNum " + noticeNum);
		model.addAttribute("noticeNum", noticeNum);
		return "noticeBoard/notice_modify";
	}

	@RequestMapping(value = "/qna_modify", method = RequestMethod.POST)
	public String qnaModifyPost(Qna qna, Model model) {
		System.out.println("Controller qnaModifyPost");
		System.out.println("Controller qnaModifyPost qnaNum " + qna.getQnaNum());
		Integer result = boardService.updateQna(qna);
		if (result > 0) {
			model.addAttribute("result", result);
			return "redirect:qna_list";
		} else {
			return "redirect:qna_modify";
		}
	}

	@RequestMapping(value = "/review_modify", method = RequestMethod.POST)
	public String reviewModifyPost(Review review, Model model) {
		System.out.println("Controller reviewModifyPost");
		System.out.println("Controller reviewModifyPost reviewNum " + review.getReviewNum());
		Integer result = boardService.updateReview(review);
		if (result > 0) {
			model.addAttribute("result", result);
			return "redirect:review_list";
		} else {
			return "redirect:review_modify";
		}
	}

	@RequestMapping(value = "/notice_modify", method = RequestMethod.POST)
	public String noticeModifyPost(Notice notice, Model model) {
		System.out.println("Controller noticeModifyPost");
		System.out.println("Controller noticeModifyPost noticeNum " + notice.getNoticeNum());
		Integer result = boardService.updateNotice(notice);
		if (result > 0) {
			model.addAttribute("result", result);
			return "redirect:notice_list";
		} else {
			return "redirect:notice_modify";
		}
	}

}
