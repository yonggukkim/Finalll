package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Guide implements Serializable{
	private String guideNum; // 여행상품 담당 가이드 등록번호
	private String guideName; // 여행상품 담당가이드이름
	private String guidePhone; // 여행상품 담당가이드휴대번호
	public String getGuideNum() {
		return guideNum;
	}
	public void setGuideNum(String guideNum) {
		this.guideNum = guideNum;
	}
	public String getGuideName() {
		return guideName;
	}
	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}
	public String getGuidePhone() {
		return guidePhone;
	}
	public void setGuidePhone(String guidePhone) {
		this.guidePhone = guidePhone;
	}
}
