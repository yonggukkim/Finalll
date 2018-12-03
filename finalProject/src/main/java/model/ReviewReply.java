package model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ReviewReply implements Serializable {
	private String memberNum; // 회원등록번호
	private String reviewNum; // 후기게시판글번호
	private String replyReviewNum; // 후기게시판댓글번호
	private String replyReviewSubject; // 후기게시판댓글제목
	private String replyReviewContent; // 후기게시판댓글내용
	private Date replyReviewDate; // 후기게시판댓글작성날짜

	public ReviewReply(String memberNum, String reviewNum, String replyReviewNum, String replyReviewSubject,
			String replyReviewContent, Date replyReviewDate) {
		super();
		this.memberNum = memberNum;
		this.reviewNum = reviewNum;
		this.replyReviewNum = replyReviewNum;
		this.replyReviewSubject = replyReviewSubject;
		this.replyReviewContent = replyReviewContent;
		this.replyReviewDate = replyReviewDate;
	}

	public ReviewReply() {
		super();
	}

	public String getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}

	public String getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(String reviewNum) {
		this.reviewNum = reviewNum;
	}

	public String getReplyReviewNum() {
		return replyReviewNum;
	}

	public void setReplyReviewNum(String replyReviewNum) {
		this.replyReviewNum = replyReviewNum;
	}

	public String getReplyReviewSubject() {
		return replyReviewSubject;
	}

	public void setReplyReviewSubject(String replyReviewSubject) {
		this.replyReviewSubject = replyReviewSubject;
	}

	public String getReplyReviewContent() {
		return replyReviewContent;
	}

	public void setReplyReviewContent(String replyReviewContent) {
		this.replyReviewContent = replyReviewContent;
	}

	public Date getReplyReviewDate() {
		return replyReviewDate;
	}

	public void setReplyReviewDate(Date replyReviewDate) {
		this.replyReviewDate = replyReviewDate;
	}

}
