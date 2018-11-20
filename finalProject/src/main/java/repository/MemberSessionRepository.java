package repository;

import java.util.Calendar;

import org.apache.ibatis.session.SqlSession;

import model.Member;

public class MemberSessionRepository extends AbstractRepository{
	private final String namespace = "repository.mapper.CommentMapper";
	public Integer insertComment(Member member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".insertComment";
		try {
			System.out.println("Repository" + member.getMemberNum());
			System.out.println("Repository" + member.getMemberId());
			member.setMemberRegDate(Calendar.getInstance().getTime()); // 캘린더라는 클래스에서 객체를 생성해 날짜 값을 저장해준다.
			Integer result = sqlSession.insert(statement, member);
			if(result > 0) sqlSession.commit();
			else sqlSession.rollback();
			return result; 
		}finally {
			sqlSession.close();
		}
	}
}
