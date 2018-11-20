package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Staff implements Serializable{
	private String staffNumber; // 직원번호
	private String staffId; // 직원아이디
	private String staffPw; // 직원비밀번호
	private String staffName; // 직원이름
	private String staffEmail; // 직원이메일주소
	private String staffPhone; // 직원핸드폰번호
	private String staffDpt; // 부서이름
	private String staffPhotoFile; // 직원 사진파일이름
	private String staffDvice; // 회원구분
	public String getStaffDvice() {
		return staffDvice;
	}
	public void setStaffDvice(String staffDvice) {
		this.staffDvice = staffDvice;
	}
	public String getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getStaffPw() {
		return staffPw;
	}
	public void setStaffPw(String staffPw) {
		this.staffPw = staffPw;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	public String getStaffPhone() {
		return staffPhone;
	}
	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}
	public String getStaffDpt() {
		return staffDpt;
	}
	public void setStaffDpt(String staffDpt) {
		this.staffDpt = staffDpt;
	}
	public String getStaffPhotoFile() {
		return staffPhotoFile;
	}
	public void setStaffPhotoFile(String staffPhotoFile) {
		this.staffPhotoFile = staffPhotoFile;
	}
}
