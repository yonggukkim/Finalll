package model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Review implements Serializable {
	private String reviewNum; // 후기게시판 등록번호
	private String pkgNum; // 여행상품 등록번호
	private String memberNum; // 회원등록번호
	private Date reviewDate; // 후기작성날짜
	private String reviewContent; // 후기내용
	private String reviewFile; // 후기 이미지파일이름
	private String reviewPw; // 후기 글비밀번호
	private Long reviewCount; // 후기 게시판조회수
	private Long reviewRating; // 후기게시판별점

	public Review(String reviewNum, String pkgNum, String memberNum, Date reviewDate, String reviewContent,
			String reviewFile, String reviewPw, Long reviewCount, Long reviewRating) {
		this.reviewNum = reviewNum;
		this.pkgNum = pkgNum;
		this.memberNum = memberNum;
		this.reviewDate = reviewDate;
		this.reviewContent = reviewContent;
		this.reviewFile = reviewContent;
		this.reviewPw = reviewPw;
		this.reviewCount = reviewCount;
		this.reviewRating = reviewRating;
	}

	public Review() {
	}

	public String getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(String reviewNum) {
		this.reviewNum = reviewNum;
	}

	public String getPkgNum() {
		return pkgNum;
	}

	public void setPkgNum(String pkgNum) {
		this.pkgNum = pkgNum;
	}

	public String getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public String getReviewFile() {
		return reviewFile;
	}

	public void setReviewFile(String reviewFile) {
		this.reviewFile = reviewFile;
	}

	public String getReviewPw() {
		return reviewPw;
	}

	public void setReviewPw(String reviewPw) {
		this.reviewPw = reviewPw;
	}

	public Long getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(Long reviewCount) {
		this.reviewCount = reviewCount;
	}

	public Long getReviewRating() {
		return reviewRating;
	}

	public void setReviewRating(Long reviewRating) {
		this.reviewRating = reviewRating;
	}
}
