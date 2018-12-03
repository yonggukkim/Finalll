package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Notice;
import model.Qna;
import model.QnaReply;
import model.Review;
import model.ReviewReply;
import repository.BoardSessionRepository;

@Service
public class BoardService {

	@Autowired
	public BoardSessionRepository boardRepository;

	public List<Qna> selectQnaList(Qna qna) {
		System.out.println("Service selectQnaList qnaNum " + qna.getQnaNum());
		return boardRepository.selectQnaByConditionList(qna);
	}

	public List<Review> selectReviewList(Review review) {
		System.out.println("Service selectReviewList reviewNum " + review.getReviewNum());
		return boardRepository.selectReviewByConditionList(review);
	}

	public List<Notice> selectNoticeList(Notice notice) {
		System.out.println("Service selectNoticeList noticeNum " + notice.getNoticeNum());
		return boardRepository.selectNoticeByConditionList(notice);
	}

	public Integer insertQna(Qna qna) {
		System.out.println("Service insertQna qnaNum " + qna.getQnaNum());
		System.out.println("Service insertQna MemberNum " + qna.getMemberNum());
		return boardRepository.insertQna(qna);
	}

	public Integer insertReview(Review review) {
		System.out.println("Service insertReview reviewNum " + review.getReviewNum());
		System.out.println("Service insertReview memberNum " + review.getMemberNum());
		return boardRepository.insertReview(review);
	}

	public Integer insertNotice(Notice notice) {
		System.out.println("Service insertNotice noticeNum " + notice.getNoticeNum());
		System.out.println("Service insertNotice staffNumber " + notice.getStaffNumber());
		return boardRepository.insertNotice(notice);
	}

	public Qna selectQnaOne(Qna qna) {
		System.out.println("Service selectQnaOne qnaNum " + qna.getQnaNum());
		return boardRepository.selectQnaByConditionOne(qna);
	}

	public Review selectReviewOne(Review review) {
		System.out.println("Service selectReviewOne reviewNum " + review.getReviewNum());
		return boardRepository.selectReviewByConditionOne(review);
	}

	public Notice selectNoticeOne(Notice notice) {
		System.out.println("Service selectNoticeOne noticeNum " + notice.getNoticeNum());
		return boardRepository.selectNoticeByConditionOne(notice);
	}

	public Integer deleteQna(String qnaNum) {
		System.out.println("Service deleteQna qnaNum " + qnaNum);
		return boardRepository.deleteQna(qnaNum);
	}

	public Integer deleteReview(String reviewNum) {
		System.out.println("Service deleteReview reviewNum " + reviewNum);
		return boardRepository.deleteReview(reviewNum);
	}

	public Integer deleteNotice(String noticeNum) {
		System.out.println("Service deleteNotice noticeNum " + noticeNum);
		return boardRepository.deleteNotice(noticeNum);
	}

	public Integer updateQna(Qna qna) {
		System.out.println("Service updateQna qna " + qna);
		return boardRepository.updateQna(qna);
	}

	public Integer updateReview(Review review) {
		System.out.println("Service updateReview review " + review);
		return boardRepository.updateReview(review);
	}

	public Integer updateNotice(Notice notice) {
		System.out.println("Service updateNotice notice " + notice);
		return boardRepository.updateNotice(notice);
	}

	public Integer replyQna(QnaReply reply) {
		System.out.println("Service replyQna replyQnaNum " + reply.getReplyQnaNum());
		System.out.println("Service replyQna replyQnaSubject " + reply.getReplyQnaSubject());
		return boardRepository.replyQna(reply);
	}

	public Integer replyReview(ReviewReply reply) {
		System.out.println("Service replyReview replyReviewNum " + reply.getReplyReviewNum());
		System.out.println("Service replyReview replyReviewSubject " + reply.getReplyReviewSubject());
		return boardRepository.replyReview(reply);
	}

	public List<QnaReply> selectQnaReplyList(QnaReply reply) {
		System.out.println("Service selectQnaReplyList replyQnaNum " + reply.getReplyQnaNum());
		return boardRepository.selectQnaReplyByConditionList(reply);
	}

	public List<ReviewReply> selectReviewReplyList(ReviewReply reply) {
		System.out.println("Service selectReviewReplyList replyReviewNum " + reply.getReplyReviewNum());
		return boardRepository.selectReviewReplyByConditionList(reply);
	}
}
