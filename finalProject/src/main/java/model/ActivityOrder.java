package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class ActivityOrder implements Serializable{
	private String activityNum; // 액티비티 등록번호
	private String selfTotalOrder; // 주문번호
	private String memberNum; // 회원등록번호
	public String getActivityNum() {
		return activityNum;
	}
	public void setActivityNum(String activityNum) {
		this.activityNum = activityNum;
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
