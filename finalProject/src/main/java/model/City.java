package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class City implements Serializable{
	private String cityNum; // 도시번호
	private String continentName; // 대륙이름
	private String countryNum; // 나라번호
	private String cityName; // 도시이름
	public String getCityNum() {
		return cityNum;
	}
	public void setCityNum(String cityNum) {
		this.cityNum = cityNum;
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
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}
