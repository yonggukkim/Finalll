package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Member;
import repository.MemberSessionRepository;

@Service
public class MemberService {
	@Autowired
	private MemberSessionRepository memberRepository;

	public Integer insertMember(Member member) {
		System.out.println("Service insertMember memberNum " + member.getMemberNum());
		System.out.println("Service insertMember memberId " + member.getMemberId());
		return memberRepository.insertMember(member);
	}
	
	
	public Integer updateMember(Member member) {
		System.out.println("Service updateMember member " + member);
		System.out.println("service"+ member.getMemberNum());
		System.out.println("service"+ member.getMemberId());
		
		return memberRepository.updateMember(member);
	}
	
	public Integer deleteMember(String memberNum) {
		System.out.println("Service deleteMember memberNum " + memberNum);
		return memberRepository.deleteMember(memberNum);
	}
	
	
/*	public boolean loginCheck(Member member,HttpSession session ) {
	      
	      boolean result = memberRepository.loginCheck(member);
	      System.out.println("memberService"+member.getMemberId());
	      if(result) {
	         Member member2 = new Member();
	         session.setAttribute("memberId",member2.getMemberId());
	   
	      }
	      System.out.println(result);
	      return result;
	   }*/
	

}

