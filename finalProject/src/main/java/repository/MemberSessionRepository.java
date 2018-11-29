package repository;

import java.util.Calendar;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.Member;

@Repository
public class MemberSessionRepository extends AbstractRepository {
	private final String namespace = "repository.mapper.MemberMapper";

	public Integer insertMember(Member member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".insertMember";
		try {
			/*
			 * System.out.println("Repository insertMember memberNum " +
			 * member.getMemberNum());
			 * System.out.println("Repository insertMember memberId " +
			 * member.getMemberId());
			 */
			member.setMemberRegDate(Calendar.getInstance().getTime());
			Integer result = sqlSession.insert(statement, member);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Integer updateMember(Member member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".updateMember";
			System.out.println("Repository update" + member.getMemberNum());
			System.out.println("Repository update" + member.getMemberId());
			Integer result = sqlSession.update(statement, member);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}
	}// 수정

	/*
	 * public boolean loginCheck(Member member) {
	 * System.out.println("MemberSessionRepository"+member.getMemberId());
	 * SqlSession sqlSession = getSqlSessionFactory().openSession();
	 * 
	 * String name =
	 * sqlSession.selectOne("repository.mapper.MemberMapper.loginCheck",member);
	 * return (name ==null)?false:true; }
	 */


	
	public Integer deleteMember(String memberNum) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository" + memberNum);
			String statement = namespace + ".deleteMember";
			int result = sqlSession.delete(statement, memberNum);
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
