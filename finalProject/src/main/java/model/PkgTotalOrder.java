package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class PkgTotalOrder implements Serializable{
	private String pkgOrderNum; // 주문번호
	private String memberNum; // 회원등록번호
	private Integer totalTouristNumber; // 여행자 총 인원
	private String requestContent; // 요청사항 내용
	private String promotionCode; // 프로모션 코드
	public String getPkgOrderNum() {
		return pkgOrderNum;
	}
	public void setPkgOrderNum(String pkgOrderNum) {
		this.pkgOrderNum = pkgOrderNum;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public Integer getTotalTouristNumber() {
		return totalTouristNumber;
	}
	public void setTotalTouristNumber(Integer totalTouristNumber) {
		this.totalTouristNumber = totalTouristNumber;
	}
	public String getRequestContent() {
		return requestContent;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}
	public String getPromotionCode() {
		return promotionCode;
	}
	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}
}
