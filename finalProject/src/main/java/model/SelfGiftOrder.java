package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class SelfGiftOrder implements Serializable{
	private String giftNum; // 특산품 등록번호
	private String selfTotalOrder; // 주문번호
	private String memberNum; // 회원등록번호
	public String getGiftNum() {
		return giftNum;
	}
	public void setGiftNum(String giftNum) {
		this.giftNum = giftNum;
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
}
