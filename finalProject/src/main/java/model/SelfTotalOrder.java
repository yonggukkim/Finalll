package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class SelfTotalOrder implements Serializable{
	private String selfTotalOrder; // 주문번호
	private String memberNum; // 회원등록번호
	private Integer selfTouristTotalNumber; // 여행자 총 인원
	private String selfRequestContent; // 요청사항 내용
	private String selfPromotionCode; // 프로모션 코드
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
	public Integer getSelfTouristTotalNumber() {
		return selfTouristTotalNumber;
	}
	public void setSelfTouristTotalNumber(Integer selfTouristTotalNumber) {
		this.selfTouristTotalNumber = selfTouristTotalNumber;
	}
	public String getSelfRequestContent() {
		return selfRequestContent;
	}
	public void setSelfRequestContent(String selfRequestContent) {
		this.selfRequestContent = selfRequestContent;
	}
	public String getSelfPromotionCode() {
		return selfPromotionCode;
	}
	public void setSelfPromotionCode(String selfPromotionCode) {
		this.selfPromotionCode = selfPromotionCode;
	}
}
