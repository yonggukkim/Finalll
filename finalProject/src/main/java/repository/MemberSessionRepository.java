package repository;

import java.util.Calendar;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.Member;
import model.Notice;
import model.Qna;

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

	public String idFind(Member member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
//			System.out.println("idFind");
			String statement = namespace + ".idFind";
			return sqlSession.selectOne(statement, member);
		} finally {
			sqlSession.close();
		}
	}
		public String passwordFind(Member member) {
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			try {
//				System.out.println("passwordFind");
				String statement = namespace + ".passwordFind";
				return sqlSession.selectOne(statement, member);
			} finally {
				sqlSession.close();
			}
	}
		public List<Member> memberList(Member member) {
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			try {
				System.out.println("Repository memberList memberNum 1 " + member.getMemberNum());
				String statement = namespace + ".memberList";
				List<Member> list = sqlSession.selectList(statement, member);
				System.out.println("repository memberList 주입성공");
				for (Object o : list) {
					Member member1 = (Member) o;
					System.out.println("Repository memberList memberNum " + member1.getMemberNum());
				}
				return list; 
			} finally {
				sqlSession.close();
			}
		}
		
		public Member memberDetail(String memberNum) {
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			try {
				System.out.println("Repository memberDetail" + memberNum);
				String statement = namespace + ".memberDetail";
				return sqlSession.selectOne(statement, memberNum);
			} finally {
				sqlSession.close();
			}
		}
}
