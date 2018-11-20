package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class PkgOrderList implements Serializable{
	private String pkgOrderNum; //주문번호
	private String memberNum; //회원등록번호
	private String pkgNum; // 여행상품등록번호
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
	public String getPkgNum() {
		return pkgNum;
	}
	public void setPkgNum(String pkgNum) {
		this.pkgNum = pkgNum;
	}
}
