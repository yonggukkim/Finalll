package repository;

import java.util.Calendar;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.Qna;

@Repository
public class BoardSessionRepository extends AbstractRepository {

	private final String namespace = "repository.mapper.BoardMapper";

	public Integer insertQna(Qna qna) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".insertQna";
			System.out.println("Repository" + qna.getQnaNum());
			System.out.println("Repository" + qna.getMemberNum());
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

	public List<Qna> selectQnaByCondition(Qna qna) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository" + qna.getQnaNum());
			String statement = namespace + ".selectQnaByCondition";
			return sqlSession.selectList(statement, qna);
		} finally {
			sqlSession.close();
		}
	}

	public Integer updateQna(Qna qna) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository" + qna.getQnaNum());
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

	public Integer deleteQna(String qnaNum) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			int result = sqlSession.delete(String.format("%s.deleteQna", namespace), qnaNum);
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
