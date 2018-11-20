package model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Notice implements Serializable {
	private String noticeNum; // 공지사항게시판 글등록번호
	private String staffNumber; // 직원번호
	private Date noticeDate; // 공지사항 게시판 작성날짜
	private String noticeSubject; // 공지사항 게시판 글제목
	private String noticeContent; // 공지사항 게시판 글내용
	private String noticeFile; // 공지사항 게시판 첨부이미지파일이름
	private String noticePw; // 공지사항 게시판 글 비밀번호
	private Long noticeCount; // 공지사항 게시판 조회수

	public Notice(String noticeNum, String staffNumber, Date noticeDate, String noticeSubject, String noticeContent,
			String noticeFile, String noticePw, Long noticeCount) {
		this.noticeNum = noticeNum;
		this.staffNumber = staffNumber;
		this.noticeDate = noticeDate;
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
		this.noticeFile = noticeFile;
		this.noticePw = noticePw;
		this.noticeCount = noticeCount;
	}

	public Notice() {
	}

	public String getNoticeNum() {
		return noticeNum;
	}

	public void setNoticeNum(String noticeNum) {
		this.noticeNum = noticeNum;
	}

	public String getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getNoticeSubject() {
		return noticeSubject;
	}

	public void setNoticeSubject(String noticeSubject) {
		this.noticeSubject = noticeSubject;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeFile() {
		return noticeFile;
	}

	public void setNoticeFile(String noticeFile) {
		this.noticeFile = noticeFile;
	}

	public String getNoticePw() {
		return noticePw;
	}

	public void setNoticePw(String noticePw) {
		this.noticePw = noticePw;
	}

	public Long getNoticeCount() {
		return noticeCount;
	}

	public void setNoticeCount(Long noticeCount) {
		this.noticeCount = noticeCount;
	}
}
