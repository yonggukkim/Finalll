package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Country implements Serializable{
	private String countryNum; // 나라번호
	private String continentName; // 대륙이름
	private String countryName; // 나라이름
	public String getCountryNum() {
		return countryNum;
	}
	public void setCountryNum(String countryNum) {
		this.countryNum = countryNum;
	}
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}
