package service;

import model.Member;
import repository.MemberSessionRepository;

public class MemberService {
	private MemberSessionRepository memberRepository;
	public Integer insertComment(Member member) {
		// 디버깅코드
		System.out.println("service"+ member.getMemberNum());
		System.out.println("service"+ member.getMemberId());
		
		return memberRepository.insertComment(member);
	}
}
