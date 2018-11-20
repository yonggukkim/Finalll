package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Gift implements Serializable{
	private String giftNum; // 특산품 등록번호
	private String giftName; // 특산품 이름
	private Long giftPrice; // 특산품 가격
	private String giftFile; // 특산품 상품이미지파일이름
	private String giftCate; // 특산품 종류
	private String giftContent; // 특산품 상품설명내용
	private String giftCompany; // 특산품 업체이름
	private String giftTel; // 특산품 업체전화번호
	private String giftPresident; // 특산품 대표자이름
	private String continentName; // 대륙이름
	private String countryNum; // 나라번호
	private String cityNume; // 도시번호
	public String getGiftNum() {
		return giftNum;
	}
	public void setGiftNum(String giftNum) {
		this.giftNum = giftNum;
	}
	public String getGiftName() {
		return giftName;
	}
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}
	public Long getGiftPrice() {
		return giftPrice;
	}
	public void setGiftPrice(Long giftPrice) {
		this.giftPrice = giftPrice;
	}
	public String getGiftFile() {
		return giftFile;
	}
	public void setGiftFile(String giftFile) {
		this.giftFile = giftFile;
	}
	public String getGiftCate() {
		return giftCate;
	}
	public void setGiftCate(String giftCate) {
		this.giftCate = giftCate;
	}
	public String getGiftContent() {
		return giftContent;
	}
	public void setGiftContent(String giftContent) {
		this.giftContent = giftContent;
	}
	public String getGiftCompany() {
		return giftCompany;
	}
	public void setGiftCompany(String giftCompany) {
		this.giftCompany = giftCompany;
	}
	public String getGiftTel() {
		return giftTel;
	}
	public void setGiftTel(String giftTel) {
		this.giftTel = giftTel;
	}
	public String getGiftPresident() {
		return giftPresident;
	}
	public void setGiftPresident(String giftPresident) {
		this.giftPresident = giftPresident;
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
	public String getCityNume() {
		return cityNume;
	}
	public void setCityNume(String cityNume) {
		this.cityNume = cityNume;
	}
}
