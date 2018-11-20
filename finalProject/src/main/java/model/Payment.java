package model;

import java.io.Serializable;
import java.util.Date;
@SuppressWarnings("serial")
public class Payment implements Serializable{
	private String paymentNum; // 결제번호
	private String pkgOrderNum; // 주문번호
	private String memberNum; // 회원등록번호
	private Long pkgPaymentPrice; // 결제금액가격
	private String pkgPaymentMethod; // 결제수단종류
	private String pkgPaymentInstallment; // 할부기간
	private String pkgAccountNum; // 계좌번호
	private String pkgCreditCardNum; // 카드번호
	private String pkgCreditCardCompany; // 카드사이름
	private String pkgBankName; // 은행이름
	private Date pkgPaymentDate; // 결제날짜
	private String pkgPaymentTime; // 결제시간
	public String getPaymentNum() {
		return paymentNum;
	}
	public void setPaymentNum(String paymentNum) {
		this.paymentNum = paymentNum;
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
	public Long getPkgPaymentPrice() {
		return pkgPaymentPrice;
	}
	public void setPkgPaymentPrice(Long pkgPaymentPrice) {
		this.pkgPaymentPrice = pkgPaymentPrice;
	}
	public String getPkgPaymentMethod() {
		return pkgPaymentMethod;
	}
	public void setPkgPaymentMethod(String pkgPaymentMethod) {
		this.pkgPaymentMethod = pkgPaymentMethod;
	}
	public String getPkgPaymentInstallment() {
		return pkgPaymentInstallment;
	}
	public void setPkgPaymentInstallment(String pkgPaymentInstallment) {
		this.pkgPaymentInstallment = pkgPaymentInstallment;
	}
	public String getPkgAccountNum() {
		return pkgAccountNum;
	}
	public void setPkgAccountNum(String pkgAccountNum) {
		this.pkgAccountNum = pkgAccountNum;
	}
	public String getPkgCreditCardNum() {
		return pkgCreditCardNum;
	}
	public void setPkgCreditCardNum(String pkgCreditCardNum) {
		this.pkgCreditCardNum = pkgCreditCardNum;
	}
	public String getPkgCreditCardCompany() {
		return pkgCreditCardCompany;
	}
	public void setPkgCreditCardCompany(String pkgCreditCardCompany) {
		this.pkgCreditCardCompany = pkgCreditCardCompany;
	}
	public String getPkgBankName() {
		return pkgBankName;
	}
	public void setPkgBankName(String pkgBankName) {
		this.pkgBankName = pkgBankName;
	}
	public Date getPkgPaymentDate() {
		return pkgPaymentDate;
	}
	public void setPkgPaymentDate(Date pkgPaymentDate) {
		this.pkgPaymentDate = pkgPaymentDate;
	}
	public String getPkgPaymentTime() {
		return pkgPaymentTime;
	}
	public void setPkgPaymentTime(String pkgPaymentTime) {
		this.pkgPaymentTime = pkgPaymentTime;
	}
}
