package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Member;
import model.Qna;
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
	
	public String idFind(Member member) {
		System.out.println("Service idfind" + member);
		return memberRepository.idFind(member);
	}
	
	public String passwordFind(Member member) {
		System.out.println("Service passwordfind" + member);
		return memberRepository.passwordFind(member);
	}
	
	public List<Member> selectMemberList(Member member) {
		System.out.println("Service selectMemberList memberNum " + member.getMemberNum());
		return memberRepository.memberList(member);
	}
	
	public Member memberDetail(String memberNum) {
		System.out.println("Service memberDetail memberNum " + memberNum);
		return memberRepository.memberDetail(memberNum);
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

