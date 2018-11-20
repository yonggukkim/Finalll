package model;

import java.io.Serializable;
import java.util.Date;
@SuppressWarnings("serial")
public class SelfTouristInfo implements Serializable{
	private String selfTouristInfoNum; // 여행자 정보 번호
	private String selfFlightNum; // 항공권 번호
	private String selfTotalOrder; // 주문번호
	private String memberNum; // 회원등록번호
	private Date selfTouristBirth; // 여행자 생년월일날짜
	private String selfTouristPasNum; // 여행자 여권번호
	private String selfTouristGender; // 여행자 성별종류
	private String selfTouristEngName; // 여행자 여권영문이름
	private Date selfTouristPassExp; // 여행자 여권만료날짜
	private String selfTouristNationality; // 여행자국적이름
	private String selfTouristName; // 여행자 이름
	public String getSelfTouristInfoNum() {
		return selfTouristInfoNum;
	}
	public void setSelfTouristInfoNum(String selfTouristInfoNum) {
		this.selfTouristInfoNum = selfTouristInfoNum;
	}
	public String getSelfFlightNum() {
		return selfFlightNum;
	}
	public void setSelfFlightNum(String selfFlightNum) {
		this.selfFlightNum = selfFlightNum;
	}
	public String getSelfTotalOrder() {
		return selfTotalOrder;
	}
	public void setSelfTotalOrder(String selfTotalOrder) {
		this.selfTotalOrder = selfTotalOrder;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public Date getSelfTouristBirth() {
		return selfTouristBirth;
	}
	public void setSelfTouristBirth(Date selfTouristBirth) {
		this.selfTouristBirth = selfTouristBirth;
	}
	public String getSelfTouristPasNum() {
		return selfTouristPasNum;
	}
	public void setSelfTouristPasNum(String selfTouristPasNum) {
		this.selfTouristPasNum = selfTouristPasNum;
	}
	public String getSelfTouristGender() {
		return selfTouristGender;
	}
	public void setSelfTouristGender(String selfTouristGender) {
		this.selfTouristGender = selfTouristGender;
	}
	public String getSelfTouristEngName() {
		return selfTouristEngName;
	}
	public void setSelfTouristEngName(String selfTouristEngName) {
		this.selfTouristEngName = selfTouristEngName;
	}
	public Date getSelfTouristPassExp() {
		return selfTouristPassExp;
	}
	public void setSelfTouristPassExp(Date selfTouristPassExp) {
		this.selfTouristPassExp = selfTouristPassExp;
	}
	public String getSelfTouristNationality() {
		return selfTouristNationality;
	}
	public void setSelfTouristNationality(String selfTouristNationality) {
		this.selfTouristNationality = selfTouristNationality;
	}
	public String getSelfTouristName() {
		return selfTouristName;
	}
	public void setSelfTouristName(String selfTouristName) {
		this.selfTouristName = selfTouristName;
	}
}
