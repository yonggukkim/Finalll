package model;

import java.io.Serializable;
import java.util.Date;
@SuppressWarnings("serial")
public class SelfPaymentNumber implements Serializable{
	private String selfPaymentNumber; // 자유여행 결제번호
	private String selfTotalOrder; // 주문번호
	private String memberNum; // 회원등록번호
	private String selfPaymentMethod; // 결제수단종류
	private String selfPaymentInstallment; // 할부기간
	private String selfPaymentAccountNum; // 계좌번호
	private String selfPaymentCreditCardNum; // 카드번호
	private String selfPaymentCardCompany; // 카드사이름
	private String selfBankName; // 은행이름
	private Date selfPaymentDate; // 결제날짜
	private String selfPaymentTime; // 결제시간
	private Long selfPaymentPrice; // 결제금액가격
	public String getSelfPaymentNumber() {
		return selfPaymentNumber;
	}
	public void setSelfPaymentNumber(String selfPaymentNumber) {
		this.selfPaymentNumber = selfPaymentNumber;
	}
	public String getSelfTotalOrder() {
		return selfTotalOrder;
	}
	public void setSelfTotalOrder(String selfTotalOrder) {
		this.selfTotalOrder = selfTotalOrder;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getSelfPaymentMethod() {
		return selfPaymentMethod;
	}
	public void setSelfPaymentMethod(String selfPaymentMethod) {
		this.selfPaymentMethod = selfPaymentMethod;
	}
	public String getSelfPaymentInstallment() {
		return selfPaymentInstallment;
	}
	public void setSelfPaymentInstallment(String selfPaymentInstallment) {
		this.selfPaymentInstallment = selfPaymentInstallment;
	}
	public String getSelfPaymentAccountNum() {
		return selfPaymentAccountNum;
	}
	public void setSelfPaymentAccountNum(String selfPaymentAccountNum) {
		this.selfPaymentAccountNum = selfPaymentAccountNum;
	}
	public String getSelfPaymentCreditCardNum() {
		return selfPaymentCreditCardNum;
	}
	public void setSelfPaymentCreditCardNum(String selfPaymentCreditCardNum) {
		this.selfPaymentCreditCardNum = selfPaymentCreditCardNum;
	}
	public String getSelfPaymentCardCompany() {
		return selfPaymentCardCompany;
	}
	public void setSelfPaymentCardCompany(String selfPaymentCardCompany) {
		this.selfPaymentCardCompany = selfPaymentCardCompany;
	}
	public String getSelfBankName() {
		return selfBankName;
	}
	public void setSelfBankName(String selfBankName) {
		this.selfBankName = selfBankName;
	}
	public Date getSelfPaymentDate() {
		return selfPaymentDate;
	}
	public void setSelfPaymentDate(Date selfPaymentDate) {
		this.selfPaymentDate = selfPaymentDate;
	}
	public String getSelfPaymentTime() {
		return selfPaymentTime;
	}
	public void setSelfPaymentTime(String selfPaymentTime) {
		this.selfPaymentTime = selfPaymentTime;
	}
	public Long getSelfPaymentPrice() {
		return selfPaymentPrice;
	}
	public void setSelfPaymentPrice(Long selfPaymentPrice) {
		this.selfPaymentPrice = selfPaymentPrice;
	}
}
