package command;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

@SuppressWarnings("serial")
public class GiftCommand implements Serializable {
	private String giftNum; // 특산품 등록번호
	private String giftName; // 특산품 이름
	private Long giftPrice; // 특산품 가격
	private String giftCate; // 특산품 종류
	private String giftContent; // 특산품 상품설명내용
	private String giftCompany; // 특산품 업체이름
	private String giftTel; // 특산품 업체전화번호
	private String giftPresident; // 특산품 대표자이름
	private String continentName; // 대륙이름
	private String countryNum; // 나라번호
	private String cityNum; // 도시번호
	private MultipartFile[] files;
	
	
	/*public Gift() {
	}*/
	// for 파일 등록


	
	
	
	

/*	public Gift(String giftNum, String giftName, Long giftPrice, String giftFile, String giftCate, String giftContent,
			String giftCompany, String giftTel, String giftPresident, String continentName, String countryNum,
			String cityNum, MultipartFile[] files) {
		super();
		this.giftNum = giftNum;
		this.giftName = giftName;
		this.giftPrice = giftPrice;
//		this.giftFile = giftFile;
		this.giftCate = giftCate;
		this.giftContent = giftContent;
		this.giftCompany = giftCompany;
		this.giftTel = giftTel;
		this.giftPresident = giftPresident;
		this.continentName = continentName;
		this.countryNum = countryNum;
		this.cityNum = cityNum;
		this.files = files;
	}*/
//
	public MultipartFile[] getFiles() {
		return files;
	}

	public void setFiles(MultipartFile[] files) {
		this.files = files;
	}
//
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

	public String getCityNum() {
		return cityNum;
	}

	public void setCityNum(String cityNum) {
		this.cityNum = cityNum;
	}
}
