package command;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

@SuppressWarnings("serial")
public class HotelCommand implements Serializable{
	private String hotelName; // 숙박시설이름
	private Long hotelPrice; // 숙박시설 가격
	private String hotelCheckin; // 숙박시설 입실시간
	private String hotelCheckout; // 숙박시설 퇴실시간
	private boolean hotelBreakfast; // 조식여부
	private String hotelGrade; // 숙박시설 등급
	private String hotelCate; // 객실종류
	private String hotelTel; // 숙박시설업체전화번호
	private String hotelPresident; // 숙박시설대표자이름
	private String hotelContent; // 숙박시설상품설명내용
	private String hotelCompany; // 숙박시설업체이름
	private String continentName; // 대륙이름
	private String countryNum; // 나라번호
	private String cityNum; // 도시번호
	private MultipartFile[] hotelFile; // 호텔 파일 이름
	public MultipartFile[] getHotelFile() {
		return hotelFile;
	}
	public void setHotelFile(MultipartFile[] hotelFile) {
		this.hotelFile = hotelFile;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public Long getHotelPrice() {
		return hotelPrice;
	}
	public void setHotelPrice(Long hotelPrice) {
		this.hotelPrice = hotelPrice;
	}
	public String getHotelCheckin() {
		return hotelCheckin;
	}
	public void setHotelCheckin(String hotelCheckin) {
		this.hotelCheckin = hotelCheckin;
	}
	public String getHotelCheckout() {
		return hotelCheckout;
	}
	public void setHotelCheckout(String hotelCheckout) {
		this.hotelCheckout = hotelCheckout;
	}
	public boolean isHotelBreakfast() {
		return hotelBreakfast;
	}
	public void setHotelBreakfast(boolean hotelBreakfast) {
		this.hotelBreakfast = hotelBreakfast;
	}
	public String getHotelGrade() {
		return hotelGrade;
	}
	public void setHotelGrade(String hotelGrade) {
		this.hotelGrade = hotelGrade;
	}
	public String getHotelCate() {
		return hotelCate;
	}
	public void setHotelCate(String hotelCate) {
		this.hotelCate = hotelCate;
	}
	public String getHotelTel() {
		return hotelTel;
	}
	public void setHotelTel(String hotelTel) {
		this.hotelTel = hotelTel;
	}
	public String getHotelPresident() {
		return hotelPresident;
	}
	public void setHotelPresident(String hotelPresident) {
		this.hotelPresident = hotelPresident;
	}
	public String getHotelContent() {
		return hotelContent;
	}
	public void setHotelContent(String hotelContent) {
		this.hotelContent = hotelContent;
	}
	public String getHotelCompany() {
		return hotelCompany;
	}
	public void setHotelCompany(String hotelCompany) {
		this.hotelCompany = hotelCompany;
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