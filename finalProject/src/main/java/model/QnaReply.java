package model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class QnaReply implements Serializable {
	private String memberNum; // 회원등록번호
	private String qnaNum; // 질문게시판글번호
	private String replyQnaNum; // 질문게시판댓글번호 
	private String replyQnaSubject; // 질문게시판댓글제목
	private String replyQnaContent; // 질문게시판댓글내용
	private Date replyQnaDate; // 질문게시판댓글작성날짜

	public QnaReply(String memberNum, String qnaNum, String replyQnaNum, String replyQnaSubject, String replyQnaContent,
			Date replyQnaDate) {
		super();
		this.memberNum = memberNum;
		this.qnaNum = qnaNum;
		this.replyQnaNum = replyQnaNum;
		this.replyQnaSubject = replyQnaSubject;
		this.replyQnaContent = replyQnaContent;
		this.replyQnaDate = replyQnaDate;
	}

	public QnaReply() {
		super();
	}

	public String getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}

	public String getQnaNum() {
		return qnaNum;
	}

	public void setQnaNum(String qnaNum) {
		this.qnaNum = qnaNum;
	}

	public String getReplyQnaNum() {
		return replyQnaNum;
	}

	public void setReplyQnaNum(String replyQnaNum) {
		this.replyQnaNum = replyQnaNum;
	}

	public String getReplyQnaSubject() {
		return replyQnaSubject;
	}

	public void setReplyQnaSubject(String replyQnaSubject) {
		this.replyQnaSubject = replyQnaSubject;
	}

	public String getReplyQnaContent() {
		return replyQnaContent;
	}

	public void setReplyQnaContent(String replyQnaContent) {
		this.replyQnaContent = replyQnaContent;
	}

	public Date getReplyQnaDate() {
		return replyQnaDate;
	}

	public void setReplyQnaDate(Date replyQnaDate) {
		this.replyQnaDate = replyQnaDate;
	}

}
