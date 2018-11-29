package repository;

import java.util.Calendar;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.Notice;
import model.Qna;
import model.Review;

@Repository
public class BoardSessionRepository extends AbstractRepository {

	private final String namespace = "repository.mapper.BoardMapper";

	public List<Qna> selectQnaByConditionList(Qna qna) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository selectQnaByConditionList qnaNum " + qna.getQnaNum());
			String statement = namespace + ".selectQnaByConditionList";
			List<Qna> list = sqlSession.selectList(statement, qna);
			for (Object o : list) {
				Qna qna1 = (Qna) o;
				System.out.println("Repository selectQnaByConditionList qnaCount " + qna1.getQnaCount());
				System.out.println("Repository selectQnaByConditionList qnaNum " + qna1.getQnaNum());
			}
			return list;
		} finally {
			sqlSession.close();
		}
	}

	public List<Review> selectReviewByConditionList(Review review) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository selectReviewByConditionList reviewNum " + review.getReviewNum());
			String statement = namespace + ".selectReviewByConditionList";
			List<Review> list = sqlSession.selectList(statement, review);
			for (Object o : list) {
				Review review1 = (Review) o;
				System.out.println("Repository selectReviewByConditionList reviewCount " + review1.getReviewCount());
				System.out.println("Repository selectReviewByConditionList reviewNum " + review1.getReviewNum());
			}
			return list;
		} finally {
			sqlSession.close();
		}
	}

	public List<Notice> selectNoticeByConditionList(Notice notice) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository selectNoticeByConditionList noticeNum " + notice.getNoticeNum());
			String statement = namespace + ".selectNoticeByConditionList";
			List<Notice> list = sqlSession.selectList(statement, notice);
			for (Object o : list) {
				Notice notice1 = (Notice) o;
				System.out.println("Repository selectNoticeByConditionList noticeCount " + notice1.getNoticeCount());
				System.out.println("Repository selectNoticeByConditionList noticeNum " + notice1.getNoticeNum());
			}
			return list;
		} finally {
			sqlSession.close();
		}
	}

	public Integer insertQna(Qna qna) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".insertQna";
			System.out.println("Repository insertQna qnaNum " + qna.getQnaNum());
			System.out.println("Repository insertQna memberNum " + qna.getMemberNum());
			qna.setQnaDate(Calendar.getInstance().getTime());
			Integer result = sqlSession.insert(statement, qna);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}

	}

	public Integer insertReview(Review review) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".insertReview";
			System.out.println("Repository insertReview reviewNum " + review.getReviewNum());
			System.out.println("Repository insertReview memberNum " + review.getMemberNum());
			review.setReviewDate(Calendar.getInstance().getTime());
			Integer result = sqlSession.insert(statement, review);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Integer insertNotice(Notice notice) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".insertNotice";
			System.out.println("Repository insertNotice noticeNum " + notice.getNoticeNum());
			System.out.println("Repository insertNotice staffNumber " + notice.getStaffNumber());
			notice.setNoticeDate(Calendar.getInstance().getTime());
			Integer result = sqlSession.insert(statement, notice);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Qna selectQnaByConditionOne(Qna qna) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository selectQnaByConditionOne qnaSubject " + qna.getQnaSubject());
			String statement = namespace + ".selectQnaByConditionOne";
			return sqlSession.selectOne(statement, qna);
		} finally {
			sqlSession.close();
		}
	}

	public Review selectReviewByConditionOne(Review review) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository selectReviewByConditionOne reviewContent " + review.getReviewContent());
			String statement = namespace + ".selectReviewByConditionOne";
			return sqlSession.selectOne(statement, review);
		} finally {
			sqlSession.close();
		}
	}

	public Notice selectNoticeByConditionOne(Notice notice) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository selectNoticeByConditionOne noticeSubject " + notice.getNoticeSubject());
			String statement = namespace + ".selectNoticeByConditionOne";
			return sqlSession.selectOne(statement, notice);
		} finally {
			sqlSession.close();
		}
	}

	public Integer deleteQna(String qnaNum) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".deleteQna";
			int result = sqlSession.delete(statement, qnaNum);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Integer deleteReview(String reviewNum) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".deleteReview";
			int result = sqlSession.delete(statement, reviewNum);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Integer deleteNotice(String noticeNum) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".deleteNotice";
			int result = sqlSession.delete(statement, noticeNum);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Integer updateQna(Qna qna) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository updateQna qnaNum " + qna.getQnaNum());
			String statement = namespace + ".updateQna";
			Integer result = sqlSession.update(statement, qna);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Integer updateReview(Review review) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository updateReview reviewNum " + review.getReviewNum());
			String statement = namespace + ".updateReview";
			Integer result = sqlSession.update(statement, review);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Integer updateNotice(Notice notice) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository updateNotice noticeNum " + notice.getNoticeNum());
			String statement = namespace + ".updateNotice";
			Integer result = sqlSession.update(statement, notice);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}
	}

}
