package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Qna;
import service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value="/notice_board", method = RequestMethod.GET)
	public String handleStep1(Qna qna, Model model) {
		List<Qna> list = boardService.selectQnaList(qna);
		model.addAttribute("list",list);
		model.addAttribute("bodyPage", "notice_board.jsp");
		return "main";
	}
	
	@RequestMapping(value = "/qna_insert", method = RequestMethod.GET)
	public String qnaInsertGet(Qna qna, Model model) {
		System.out.println("GET INSERT");
		model.addAttribute("bodyPage", "qnaBoard/qna_insert.jsp");
		return "main";
	}

	@RequestMapping(value = "/qna_insert", method = RequestMethod.POST)
	public String qnaInsertPost(Qna qna, Model model) {
		Integer result = null;
		System.out.println("post");
		result = boardService.insertQna(qna);
		List<Qna> list = boardService.selectQnaList(qna);
		if (result > 0) {
			model.addAttribute("qna", qna);
			model.addAttribute("list", list);
			System.out.println(qna.getQnaNum());
			System.out.println(list.size());
			return "redirect:notice_board";
		} else {
			return "redirect:main";
		}
	}

	/*@RequestMapping(value = "qna_list", method = RequestMethod.GET)
	public String qnaListGet(Qna qna, Model model) {
		System.out.println("Get list");
		List<Qna> list = boardService.selectQnaList(qna);
		if(list != null) {
			model.addAttribute("list",list);
			System.out.println(list.size());
			return "qnaBoard/qna_list";
		}else {
			return "qnaBoard/qna_list";
		}
	}*/
	/*
	@RequestMapping(value = "qna_list", method = RequestMethod.POST)
	public String qnaListPost(Qna qna, Model model) {
		System.out.println("Get list");
		List<Qna> list = boardService.selectQnaList(qna);
		if(list != null) {
			model.addAttribute("list",list);
			System.out.println(list.size());
			return "qnaBoard/qna_list";
		}else {
			return "qnaBoard/qna_list";
		}
	}*/
	
	@RequestMapping(value = "qna_detail", method = RequestMethod.GET)
	public String qnaDetailGet(@RequestParam(value = "qnaSubject", defaultValue = "false") String qnaSubject, Qna qna, Model model) {
		model.addAttribute("qna",qna);
		System.out.println("Get detail");
		Qna list = boardService.selectQnaOne(qna);
		model.addAttribute("qna",list);
		return "qnaBoard/qna_detail";
	}
}
