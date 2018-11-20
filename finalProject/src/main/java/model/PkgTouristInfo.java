package model;

import java.io.Serializable;
import java.util.Date;
@SuppressWarnings("serial")
public class PkgTouristInfo implements Serializable{
	private String pkgTouristInfoNum; // 여행자 정보 번호
	private String pkgFlightNumber; // 항공권 번호
	private String pkgOrderNum; // 주문번호
	private String memberNum; // 회원등록번호
	private Date pkgTouristBirth; // 여행자 생년월일날짜
	private String pkgPassportNum; // 여행자 여권번호
	private String pkgTouristGender; // 여행자 성별종류
	private String pkgTouristEngName; // 여행자 여권영문이름
	private Date pkgPassportExpDate; // 여행자 여권만료날짜
	private String pkgTouristNationality; // 여행자국적이름
	private String pkgTouristName; // 여행자 이름
	public String getPkgTouristInfoNum() {
		return pkgTouristInfoNum;
	}
	public void setPkgTouristInfoNum(String pkgTouristInfoNum) {
		this.pkgTouristInfoNum = pkgTouristInfoNum;
	}
	public String getPkgFlightNumber() {
		return pkgFlightNumber;
	}
	public void setPkgFlightNumber(String pkgFlightNumber) {
		this.pkgFlightNumber = pkgFlightNumber;
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
	public Date getPkgTouristBirth() {
		return pkgTouristBirth;
	}
	public void setPkgTouristBirth(Date pkgTouristBirth) {
		this.pkgTouristBirth = pkgTouristBirth;
	}
	public String getPkgPassportNum() {
		return pkgPassportNum;
	}
	public void setPkgPassportNum(String pkgPassportNum) {
		this.pkgPassportNum = pkgPassportNum;
	}
	public String getPkgTouristGender() {
		return pkgTouristGender;
	}
	public void setPkgTouristGender(String pkgTouristGender) {
		this.pkgTouristGender = pkgTouristGender;
	}
	public String getPkgTouristEngName() {
		return pkgTouristEngName;
	}
	public void setPkgTouristEngName(String pkgTouristEngName) {
		this.pkgTouristEngName = pkgTouristEngName;
	}
	public Date getPkgPassportExpDate() {
		return pkgPassportExpDate;
	}
	public void setPkgPassportExpDate(Date pkgPassportExpDate) {
		this.pkgPassportExpDate = pkgPassportExpDate;
	}
	public String getPkgTouristNationality() {
		return pkgTouristNationality;
	}
	public void setPkgTouristNationality(String pkgTouristNationality) {
		this.pkgTouristNationality = pkgTouristNationality;
	}
	public String getPkgTouristName() {
		return pkgTouristName;
	}
	public void setPkgTouristName(String pkgTouristName) {
		this.pkgTouristName = pkgTouristName;
	}
}
