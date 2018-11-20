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

	public Qna selectQnaByConditionOne(Qna qna) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository" + qna.getQnaSubject());
			String statement = namespace + ".selectQnaByConditionOne";
			return sqlSession.selectOne(statement, qna);
		} finally {
			sqlSession.close();
		}
	}
	
	public List<Qna> selectQnaByConditionList(Qna qna) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository" + qna.getQnaNum());
			String statement = namespace + ".selectQnaByConditionList";
			List<Qna> list = sqlSession.selectList(statement, qna);
			for(Object o : list) {
				Qna qna1 = (Qna)o;
				System.out.println("count"+qna1.getQnaCount());
				System.out.println("qnanum"+qna1.getQnaNum());
			}
			return list;
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

	public Integer deleteQna(String qnaSubject) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			int result = sqlSession.delete(String.format("%s.deleteQna", namespace), qnaSubject);
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
