package model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;
@SuppressWarnings("serial")
public class Activitys implements Serializable{
	private String activityNum; // 액티비티 등록번호
	private String guideNum; // 가이드번호
	private String staffNumber; // 직원번호
	private String activityName; // 액티비티 이름
	private Long activityPrice; // 액티비티 가격
	private String activityCate; // 액티비티 종류
	private String activityContent; // 액티비티 상품설명내용
	private String activityCompany; // 액티비티 업체이름
	private String activityTel; // 액티비티 업체전화번호
	private String activityPresident; // 액티비티 대표자 이름
	private Date activityRegdate;
	private Date activityUptdate;
	private String continentName; // 대륙이름
	private String countryNum; // 나라번호
	private String cityNum; // 도시번호
//	public Activitys(String activityNum,String guideNum, String staffNumber, String activityName, Long activityPrice,
//			String activityCate, String activityContent, String activityCompany, String activityTel,
//			String activityPresident, Date activityRegdate, Date activityUptdate, String continentName,
//			String countryNum, String cityNum) {
//		super();
//		this.activityNum = activityNum;
//		this.guideNum = guideNum;
//		this.staffNumber = staffNumber;
//		this.activityName = activityName;
//		this.activityPrice = activityPrice;
//		this.activityCate = activityCate;
//		this.activityContent = activityContent;
//		this.activityCompany = activityCompany;
//		this.activityTel = activityTel;
//		this.activityPresident = activityPresident;
//		this.activityRegdate = activityRegdate;
//		this.activityUptdate = activityUptdate;
//		this.continentName = continentName;
//		this.countryNum = countryNum;
//		this.cityNum = cityNum;
//	}
	public Activitys() {
		super();
	}
	public String getActivityNum() {
		return activityNum;
	}
	public void setActivityNum(String activityNum) {
		this.activityNum = activityNum;
	}
	public String getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public Long getActivityPrice() {
		return activityPrice;
	}
	public void setActivityPrice(Long activityPrice) {
		this.activityPrice = activityPrice;
	}
	public String getActivityCate() {
		return activityCate;
	}
	public void setActivityCate(String activityCate) {
		this.activityCate = activityCate;
	}
	public String getActivityContent() {
		return activityContent;
	}
	public void setActivityContent(String activityContent) {
		this.activityContent = activityContent;
	}
	public String getActivityCompany() {
		return activityCompany;
	}
	public void setActivityCompany(String activityCompany) {
		this.activityCompany = activityCompany;
	}
	public String getActivityTel() {
		return activityTel;
	}
	public void setActivityTel(String activityTel) {
		this.activityTel = activityTel;
	}
	public String getActivityPresident() {
		return activityPresident;
	}
	public void setActivityPresident(String activityPresident) {
		this.activityPresident = activityPresident;
	}
	public Date getActivityRegdate() {
		return activityRegdate;
	}
	public void setActivityRegdate(Date activityRegdate) {
		this.activityRegdate = activityRegdate;
	}
	public Date getActivityUptdate() {
		return activityUptdate;
	}
	public void setActivityUptdate(Date activityUptdate) {
		this.activityUptdate = activityUptdate;
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
