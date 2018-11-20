package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class SelfHotelOrder implements Serializable{
	private String hotelNum; // 숙박시설 등록번호
	private String selfTotalOrder; // 주문번호
	private String memberNum; // 회원등록번호
	public String getHotelNum() {
		return hotelNum;
	}
	public void setHotelNum(String hotelNum) {
		this.hotelNum = hotelNum;
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
