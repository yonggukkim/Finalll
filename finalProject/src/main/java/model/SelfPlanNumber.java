package model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class SelfPlanNumber implements Serializable {
	private String selfPlanNumber; // 자유여행플랜 글번호
	private String selfTotalOrder; // 주문번호
	private String memberNum; // 회원등록번호

	public SelfPlanNumber(String selfPlanNumber, String selfTotalOrder, String memberNum) {
		this.selfPlanNumber = selfPlanNumber;
		this.selfTotalOrder = selfTotalOrder;
		this.memberNum = memberNum;
	}

	public SelfPlanNumber() {
	}

	public String getSelfPlanNumber() {
		return selfPlanNumber;
	}

	public void setSelfPlanNumber(String selfPlanNumber) {
		this.selfPlanNumber = selfPlanNumber;
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
