package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class PkgGiftOrder implements Serializable{
	private String giftNum; // 특산품등록번호
	private String pkgOrderNum; // 주문번호
	private String memberNum; // 회원등록번호
	public String getGiftNum() {
		return giftNum;
	}
	public void setGiftNum(String giftNum) {
		this.giftNum = giftNum;
	}
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
}
