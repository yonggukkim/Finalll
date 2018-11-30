package command;

import java.io.Serializable;
import java.util.List;

import model.Restore;

@SuppressWarnings("serial")
public class PkgMainListCommand implements Serializable{
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
		private String pkgCate; // 여행구분
		private String cityNum; // 도시번호
		private String continentName; // 대륙이름
		private String countryNum; // 나라번호
		private List<Restore> restores;
		public List<Restore> getRestores() {
			return restores;
		}
		public void setRestores(List<Restore> restores) {
			this.restores = restores;
		}
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
		public String getPkgCate() {
			return pkgCate;
		}
		public void setPkgCate(String pkgCate) {
			this.pkgCate = pkgCate;
		}
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
}
