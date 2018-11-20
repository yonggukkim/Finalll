package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class MemberWishArea implements Serializable{
	private String memberNume; // 회원등록번호
	private String continentName; // 대륙이름
	private String countryNum; // 나라번호
	private String cityNum; // 도시번호
	public String getMemberNume() {
		return memberNume;
	}
	public void setMemberNume(String memberNume) {
		this.memberNume = memberNume;
	}
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	public String getCountryNum() {
		return countryNum;
	}
	public void setCountryNum(String countryNum) {
		this.countryNum = countryNum;
	}
	public String getCityNum() {
		return cityNum;
	}
	public void setCityNum(String cityNum) {
		this.cityNum = cityNum;
	}
}
