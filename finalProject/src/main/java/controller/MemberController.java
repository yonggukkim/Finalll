package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Member;
import model.Notice;
import service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/memberTerms", method = RequestMethod.GET)
	public String memberTermsGet(Member member, Model model) {
		System.out.println("Controller memberTermsGet");
		model.addAttribute("bodyPage", "member/terms.jsp");
		return "main";
	}

//	@RequestMapping(value = "/memberTerms", method = RequestMethod.POST)
//	public String memberTermsPost(Member member, Model model) {
//		System.out.println("Controller memberTermsPost");
//		model.addAttribute("member", member);
//		return "member/join";
//	}

	@RequestMapping(value = "/memberJoin", method = RequestMethod.GET)
	public String memberJoinGet(Member member, Model model) {
		System.out.println("Controller memberJoinGet");
		model.addAttribute("bodyPage", "member/join.jsp");
		return "main";
	}

//	@RequestMapping(value = "/memberJoin", method = RequestMethod.POST)
//	public String memberJoinPost(Member member, Model model) {
//		System.out.println("Controller memberJoinPost");
//		model.addAttribute("member", member);
//		memberService.insertMember(member);
//		return "member/join";
//	}

	@RequestMapping(value = "/memberJoin", method = RequestMethod.POST)
	public String memberJoinPost(Member member, Model model) {
		/*
		 * System.out.println("Controller memberJoinPost");
		 * System.out.println("Controller memberJoinPost memberNum " +
		 * member.getMemberNum());
		 * System.out.println("Controller memberJoinPost memberId " +
		 * member.getMemberId());
		 * System.out.println("Controller memberJoinPost memberPw " +
		 * member.getMemberPw());
		 * System.out.println("Controller memberJoinPost memberName "+member.
		 * getMemberName());
		 * System.out.println("Controller memberJoinPost memberBirth "+member.
		 * getMemberBirth());
		 * System.out.println("Controller memberJoinPost memberGender "+member.
		 * getMemberGender());
		 * System.out.println("Controller memberJoinPost memberCountryNum "+member.
		 * getMemberCountryNum());
		 * System.out.println("Controller memberJoinPost memberPhone "+member.
		 * getMemberPhone());
		 * System.out.println("Controller memberJoinPost memberEmail "+member.
		 * getMemberEmail());
		 * System.out.println("Controller memberJoinPost memberPostcode "+member.
		 * getMemberPostcode());
		 * System.out.println("Controller memberJoinPost memberAddr1 "+member.
		 * getMemberAddr1());
		 * System.out.println("Controller memberJoinPost memberAddr2 "+member.
		 * getMemberAddr2());
		 * System.out.println("Controller memberJoinPost memberTel "+member.getMemberTel
		 * ()); System.out.println("Controller memberJoinPost memberMarrige "+member.
		 * getMemberMarrige());
		 * System.out.println("Controller memberJoinPost memberJob "+member.getMemberJob
		 * ());
		 * System.out.println("Controller memberJoinPost memberAgreeMailing "+member.
		 * getMemberAgreeMailing());
		 * System.out.println("Controller memberJoinPost memberAgreeSms "+member.
		 * getMemberAgreeSms());
		 * System.out.println("Controller memberJoinPost memberAgreeTel "+member.
		 * getMemberAgreeTel());
		 * System.out.println("Controller memberJoinPost memberAgreePost "+member.
		 * getMemberAgreePost());
		 * System.out.println("Controller memberJoinPost memberRegDate "+member.
		 * getMemberRegDate());
		 * System.out.println("Controller memberJoinPost memberMileage "+member.
		 * getMemberMileage());
		 * System.out.println("Controller memberJoinPost memberDvice "+member.
		 * getMemberDvice());
		 */
		Integer result = null;
		result = memberService.insertMember(member);
		if (result > 0) {
			model.addAttribute("member", member);
			System.out.println("Controller memberJoinPost memberNum " + member.getMemberNum());
			return "redirect:login";
		} else {
			return "member/terms";
		}
	}

	/*
	 * @RequestMapping("loginCheck.com") public ModelAndView
	 * loginCheck(@ModelAttribute Member member ,HttpSession session) { boolean
	 * result = memberService.loginCheck(member,session); ModelAndView mav = new
	 * ModelAndView(); if(result== true) { mav.setViewName("main/main"); }else {
	 * mav.setViewName("main/login"); mav.addObject("msg","failure"); } return mav;
	 * }
	 */

	@RequestMapping(value = "/memberModify", method = RequestMethod.GET)
	public String memberModifiyGet(Member member,
			@RequestParam(value = "memberNum", defaultValue = "false") String memberNum, Model model) {
		System.out.println("Controller memberModfiyGet memberNum " + member.getMemberNum());
		model.addAttribute("memberNum", memberNum);
		return "member/member_Modify";
	}

	@RequestMapping(value = "/memberModify", method = RequestMethod.POST)
	public String memberModify(Member member, Model model) {
		System.out.println("Controller memberModifyPost memberNum " + member.getMemberNum());
		System.out.println("Controller memberModifyPost memberId " + member.getMemberId());
		Integer result = memberService.updateMember(member);
		if (result > 0) {
			model.addAttribute("member", member);
			return "redirect:/main";
		} else {
			return "member/member_Modify";
		}
	}

	@RequestMapping(value = "/memberDelete", method = RequestMethod.GET)
	public String memberDeleteGet(Member member,
			@RequestParam(value = "memberNum", defaultValue = "false") String memberNum, Model model) {
		System.out.println("Controller memberDeleteGet memberNum " + memberNum);
		model.addAttribute("memberNum", memberNum);
		return "member/memberDelete";
	}

	@RequestMapping(value = "/memberDelete", method = RequestMethod.POST)
	public String memberDeletePost(String memberNum, Member member, Model model) {
		System.out.println("Controller memberDeletePost");
		System.out.println("Controller memberDeletePost memberNum " + member.getMemberNum());
		Integer result = memberService.deleteMember(member.getMemberNum());
		if (result > 0) {
			model.addAttribute("result", result);
			return "redirect:/main";
		} else {
			return "member/memberDelete";
		}
	}

	@RequestMapping(value = "/memberPage", method = RequestMethod.GET)
	public String memberPageGet(Member member, Model model) {
		System.out.println("Controller memberPageGet getmemberNum " + member.getMemberNum());
		model.addAttribute("bodyPage", "member/memberPage.jsp");
		return "main";
	}
	
	/*@RequestMapping(value = "/idFind", method = RequestMethod.GET)
	public String idFindGet(Member member,
			@RequestParam(value = "memberNum", defaultValue = "false") String memberNum, Model model) {
		System.out.println("Controller idFindGet memberNum " + memberNum);
		model.addAttribute("memberNum", memberNum);
		return "member/idfind";
	}

	@RequestMapping(value = "/idFind", method = RequestMethod.POST)
	public String idFindPost(String memberNum, Member member, Model model) {
		System.out.println("Controller idFindPost");
		System.out.println("Controller idFindPost memberNum " + member.getMemberNum());
		Integer result = memberService.deleteMember(member.getMemberNum());
		if (result > 0) {
			model.addAttribute("result", result);
			return "redirect:/main";
		} else {
			return "member/idfind";
		}
	}*/
	
	@RequestMapping(value = "/idfind", method = RequestMethod.GET)
	public String idFindGet(Member member, Model model) {
		//System.out.println("Controller idFindGet");
		model.addAttribute("bodyPage", "member/idfind.jsp");
		return "main";
	}
	@RequestMapping(value = "/idfind", method = RequestMethod.POST)
	public String idFindPost(Member member, Model model) {
		//System.out.println("Controller idFindPost");
		String result = memberService.idFind(member);
		if (result != null) {
			model.addAttribute("result", result);
			return "member/idfindresult";
		} else {
			return "member/idfind";
		}
	}
	
	@RequestMapping(value = "/passwordfind", method = RequestMethod.GET)
	public String passwordFindGet(Member member, Model model) {
		//System.out.println("Controller pwFindGet");
		model.addAttribute("bodyPage", "member/passwordfind.jsp");
		return "main";
	}
	@RequestMapping(value = "/passwordfind", method = RequestMethod.POST)
	public String passwordFindPost(Member member, Model model) {
		//System.out.println("Controller idFindPost");
		String result = memberService.passwordFind(member);
		if (result != null) {
			model.addAttribute("result", result);
			return "member/passwordfindresult";
		} else {
			return "member/passwordfind";
		}
		
	}
	@RequestMapping(value = "/memberList", method = RequestMethod.GET)
	public String memberListGet(Member member, Model model) {
		//System.out.println("Controller memberListGet");
		List<Member> list = memberService.selectMemberList(member);
		if (list != null) {
			model.addAttribute("member", member);
			model.addAttribute("list", list);
			System.out.println("Controller memberListGet listSize " + list.size());
			model.addAttribute("bodyPage","member/memberList.jsp");
			return "main";
		} else {
			return "main";
		}
	}
	
/*	@RequestMapping(value = "/memberList", method = RequestMethod.POST)
	public String memberListPost(Member member, Model model, HttpSession session) {
		System.out.println("Controller memberListPost");
		List<Member> list = memberService.selectMemberList(member);
		if (list != null) {
			model.addAttribute("list", list);
			System.out.println("Controller memberListPost listSize " + list.size());
			return "member/member_list";
		} else {
			return "member/member_list";
		}
	}*/

	
/*	@RequestMapping(value = "/memberDetail", method = RequestMethod.GET)
	public String memberDetailGet(Member member, Model model) {
		System.out.println("Controller memberDetailGet");
		model.addAttribute("bodyPage", "member/memberdetail.jsp");
		return "main";
	}*/
	@RequestMapping(value = "/memberDetail", method = RequestMethod.GET)
	public String memberDetailGet(Member member,
			@RequestParam(value = "memberNum", defaultValue = "false") String memberNum, Model model) {
		System.out.println("Controller memberDetailGet");
//		model.addAttribute("member", member);
		Member mb = memberService.memberDetail(memberNum);
		model.addAttribute("member", mb);
		return "member/memberdetail";

	}

	
	

}