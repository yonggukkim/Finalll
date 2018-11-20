package repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import command.LoginSession;

@Repository
public class LoginRepository extends AbstractRepository implements UserDAO{

	private final String namespace = "repository.mapper.LoginMapper";
	
	public LoginSession comparisonLogin(LoginSession loginSession) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".comparisonLogin";
		System.out.println("login repository"+loginSession.getCommandId());
		System.out.println("login repository"+loginSession.getCommandPw());
		try {
			LoginSession s = sqlSession.selectOne(statement, loginSession);
			System.out.println(s + "done");
			return s;
		}finally {
			sqlSession.close();
		}
	}
	public void keepLogin(String uid, String sessionId, Date next) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".KeepLogin";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("commandId", uid);
		map.put("sessionId", sessionId);
		map.put("next", next);
		sqlSession.update(statement, map);
	}
	
	public LoginSession checkUserWithSessionKey(String sessionId) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".checkUserWithSessionKey";
		return sqlSession.selectOne(statement, sessionId);
	}
}
