package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Pkg implements Serializable{
	private String pkgNum; // 여행상품 등록번호
	private String guideNum; // 여행상품 담당가이드 등록번호
	private String staffNumber; // 직원번호
	private String pkgName; // 여행상품이름
	private String pkgTheme; // 여행상품테마종류
	private Long pkgPrice; // 여행상품가격
	private String pkgPeriod; // 상품여행기간
	private String pkgContent; // 여행상품설명
	private Integer pkgMemberMin; // 여행상품 최소신청인원
	private Integer pkgMemberCur; // 여행상품 현재신청인원
	private Integer pkgMemberMax; // 여행상품 마감인원
	private String pkgReview; // 여행상품 후기내용
	private String pkgFile; // 여행상품 이미지파일이름
	private String pkgCaution; // 여행상품 유의사항내용
	private String pkgReference; // 여행상품 참고전달사항내용
	private String pkgWeatherInfo; // 여행상품 날씨정보내용
	private String pkgMeetingPlace; // 여행상품 집합장소
	private String pkgCate; // 여행구분
	public String getPkgNum() {
		return pkgNum;
	}
	public void setPkgNum(String pkgNum) {
		this.pkgNum = pkgNum;
	}
	public String getGuideNum() {
		return guideNum;
	}
	public void setGuideNum(String guideNum) {
		this.guideNum = guideNum;
	}
	public String getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}
	public String getPkgName() {
		return pkgName;
	}
	public void setPkgName(String pkgName) {
		this.pkgName = pkgName;
	}
	public String getPkgTheme() {
		return pkgTheme;
	}
	public void setPkgTheme(String pkgTheme) {
		this.pkgTheme = pkgTheme;
	}
	public Long getPkgPrice() {
		return pkgPrice;
	}
	public void setPkgPrice(Long pkgPrice) {
		this.pkgPrice = pkgPrice;
	}
	public String getPkgPeriod() {
		return pkgPeriod;
	}
	public void setPkgPeriod(String pkgPeriod) {
		this.pkgPeriod = pkgPeriod;
	}
	public String getPkgContent() {
		return pkgContent;
	}
	public void setPkgContent(String pkgContent) {
		this.pkgContent = pkgContent;
	}
	public Integer getPkgMemberMin() {
		return pkgMemberMin;
	}
	public void setPkgMemberMin(Integer pkgMemberMin) {
		this.pkgMemberMin = pkgMemberMin;
	}
	public Integer getPkgMemberCur() {
		return pkgMemberCur;
	}
	public void setPkgMemberCur(Integer pkgMemberCur) {
		this.pkgMemberCur = pkgMemberCur;
	}
	public Integer getPkgMemberMax() {
		return pkgMemberMax;
	}
	public void setPkgMemberMax(Integer pkgMemberMax) {
		this.pkgMemberMax = pkgMemberMax;
	}
	public String getPkgReview() {
		return pkgReview;
	}
	public void setPkgReview(String pkgReview) {
		this.pkgReview = pkgReview;
	}
	public String getPkgFile() {
		return pkgFile;
	}
	public void setPkgFile(String pkgFile) {
		this.pkgFile = pkgFile;
	}
	public String getPkgCaution() {
		return pkgCaution;
	}
	public void setPkgCaution(String pkgCaution) {
		this.pkgCaution = pkgCaution;
	}
	public String getPkgReference() {
		return pkgReference;
	}
	public void setPkgReference(String pkgReference) {
		this.pkgReference = pkgReference;
	}
	public String getPkgWeatherInfo() {
		return pkgWeatherInfo;
	}
	public void setPkgWeatherInfo(String pkgWeatherInfo) {
		this.pkgWeatherInfo = pkgWeatherInfo;
	}
	public String getPkgMeetingPlace() {
		return pkgMeetingPlace;
	}
	public void setPkgMeetingPlace(String pkgMeetingPlace) {
		this.pkgMeetingPlace = pkgMeetingPlace;
	}
	public String getPkgCate() {
		return pkgCate;
	}
	public void setPkgCate(String pkgCate) {
		this.pkgCate = pkgCate;
	}
}
