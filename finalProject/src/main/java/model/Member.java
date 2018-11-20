package model;

import java.io.Serializable;
import java.util.Date;
@SuppressWarnings("serial")
public class Member implements Serializable{
	private String memberNum; // 회원등록번호
	private String memberId; // 회원아이디
	private String memberPw; // 회원비밀번호
	private String memberName; // 회원이름
	private Date memberBirth; // 회원생년월일날짜
	private String memberGender; // 회원성별
	private String memberCountryNum; // 회원휴대폰국가번호 이건 빼는건가?
	private String memberPhone; // 회원휴대번호
	private String memberEmail; // 회원이메일주소
	private String memberPostcode; // 회원우편번호
	private String memberAddr1; // 회원주소
	private String memberAddr2; // 회원상세주소
	private String memberTel; // 회원유선전화번호
	private String memberMarrige; // 결혼여부
	private String memberJob; //직업종류
	private String memberAgreeMailing; // 이벤트메일링서비스수신동의여부
	private String memberAgreeSms; // 이벤트문자메시지서비스수신동의여부
	private String memberAgreeTel; // 이벤트유선전화번호수신동의여부
	private String memberAgreePost; //이벤트 우편물 수신동의여부
	private Date memberRegDate; // 회원가입날짜
	private Long memberMileage; // 누적마일리지
	private String memberDvice; // 회원 구분
	public String getMemberAgreePost() {
		return memberAgreePost;
	}
	public void setMemberAgreePost(String memberAgreePost) {
		this.memberAgreePost = memberAgreePost;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Date getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(Date memberBirth) {
		this.memberBirth = memberBirth;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberCountryNum() {
		return memberCountryNum;
	}
	public void setMemberCountryNum(String memberCountryNum) {
		this.memberCountryNum = memberCountryNum;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPostcode() {
		return memberPostcode;
	}
	public void setMemberPostcode(String memberPostcode) {
		this.memberPostcode = memberPostcode;
	}
	public String getMemberAddr1() {
		return memberAddr1;
	}
	public void setMemberAddr1(String memberAddr1) {
		this.memberAddr1 = memberAddr1;
	}
	public String getMemberAddr2() {
		return memberAddr2;
	}
	public void setMemberAddr2(String memberAddr2) {
		this.memberAddr2 = memberAddr2;
	}
	public String getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}
	public String getMemberMarrige() {
		return memberMarrige;
	}
	public void setMemberMarrige(String memberMarrige) {
		this.memberMarrige = memberMarrige;
	}
	public String getMemberJob() {
		return memberJob;
	}
	public void setMemberJob(String memberJob) {
		this.memberJob = memberJob;
	}
	public String getMemberAgreeMailing() {
		return memberAgreeMailing;
	}
	public void setMemberAgreeMailing(String memberAgreeMailing) {
		this.memberAgreeMailing = memberAgreeMailing;
	}
	public String getMemberAgreeSms() {
		return memberAgreeSms;
	}
	public void setMemberAgreeSms(String memberAgreeSms) {
		this.memberAgreeSms = memberAgreeSms;
	}
	public String getMemberAgreeTel() {
		return memberAgreeTel;
	}
	public void setMemberAgreeTel(String memberAgreeTel) {
		this.memberAgreeTel = memberAgreeTel;
	}
	public Date getMemberRegDate() {
		return memberRegDate;
	}
	public void setMemberRegDate(Date memberRegDate) {
		this.memberRegDate = memberRegDate;
	}
	public Long getMemberMileage() {
		return memberMileage;
	}
	public void setMemberMileage(Long memberMileage) {
		this.memberMileage = memberMileage;
	}
	public String getMemberDvice() {
		return memberDvice;
	}
	public void setMemberDvice(String memberDvice) {
		this.memberDvice = memberDvice;
	}
}
