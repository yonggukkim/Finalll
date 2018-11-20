package model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Qna implements Serializable {
	private String qnaNum; // 질문게시판글등록번호
	private String memberNum; // 회원등록번호
	private String staffNumber; // 직원번호
	private Date qnaDate; // 질문게시판 작성날짜
	private String qnaSubject; // 질문게시판 글제목
	private String qnaContent; // 질문게시판 글내용
	private String qnaFile; // 질문게시판 첨부이미지파일이름
	private String qnaPw; // 질문게시판 글 비밀번호
	private Long qnaCount; // 질문게시판조회수

	public Qna(String qnaNum, String memberNum, String staffNumber, Date qnaDate, String qnaSubject, String qnaContent,
			String qnaFile, String qnaPw, Long qnaCount) {
		this.qnaNum = qnaNum;
		this.memberNum = memberNum;
		this.staffNumber = staffNumber;
		this.qnaDate = qnaDate;
		this.qnaSubject = qnaSubject;
		this.qnaContent = qnaContent;
		this.qnaFile = qnaFile;
		this.qnaPw = qnaPw;
		this.qnaCount = qnaCount;
	}

	public Qna() {
	}

	public String getQnaNum() {
		return qnaNum;
	}

	public void setQnaNum(String qnaNum) {
		this.qnaNum = qnaNum;
	}

	public String getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}

	public String getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}

	public Date getQnaDate() {
		return qnaDate;
	}

	public void setQnaDate(Date qnaDate) {
		this.qnaDate = qnaDate;
	}

	public String getQnaSubject() {
		return qnaSubject;
	}

	public void setQnaSubject(String qnaSubject) {
		this.qnaSubject = qnaSubject;
	}

	public String getQnaContent() {
		return qnaContent;
	}

	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}

	public String getQnaFile() {
		return qnaFile;
	}

	public void setQnaFile(String qnaFile) {
		this.qnaFile = qnaFile;
	}

	public String getQnaPw() {
		return qnaPw;
	}

	public void setQnaPw(String qnaPw) {
		this.qnaPw = qnaPw;
	}

	public Long getQnaCount() {
		return qnaCount;
	}

	public void setQnaCount(Long qnaCount) {
		this.qnaCount = qnaCount;
	}
}
