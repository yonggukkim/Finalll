package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.Activitys;
import model.Qna;
import model.Restore;

@Repository
public class ActivityRepository extends AbstractRepository{
	private final String namespace = "repository.mapper.ActivityMapper";
	
	public Integer insertActivity(Activitys activity) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".insertActivity";
			System.out.println("Repositorybefor" + activity.getActivityContent());
			System.out.println("Repositorybefor" + activity.getActivityName());
//			activity.setActivityRegdate(Calendar.getInstance().getTime());
//			activity.setActivityUptdate(Calendar.getInstance().getTime());
			Integer result = sqlSession.insert(statement, activity);
			System.out.println("Repositoryafter" + activity.getActivityNum());
			System.out.println("Repositoryafter" + activity.getActivityName());
			if (result > 0)
				sqlSession.commit();
			else 
				sqlSession.rollback();	
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public void insertRestore(Restore res) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".insertRestore";
			System.out.println("Repository" + res.getFileNo());
			System.out.println("Repository" + res.getFileName());
			/*res.setCreDate(Calendar.getInstance().getTime());*/
			Integer result = sqlSession.insert(statement, res);
			if (result > 0)
				sqlSession.commit();
			else 
				sqlSession.rollback();	
		} finally {
			sqlSession.close();
		}
	}

	public List<Activitys> selectActivityList(Activitys activity) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectActivityList";
			System.out.println("Repository" + activity.getActivityNum());
			System.out.println("Repository" + activity.getActivityName());
			/*res.setCreDate(Calendar.getInstance().getTime());*/
			List<Activitys> list = sqlSession.selectList(statement, activity);
			for(Object o : list) {
				Activitys act = (Activitys)o;
				System.out.println("Repositoryafter"+act.getActivityNum());
				System.out.println("Repositoryafter"+act.getActivityName());
			}
			return list;
		} finally {
			sqlSession.close();
		}
	}

	public Activitys selectActivityOne(Activitys activity) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectActivityOne";
			System.out.println("Repository detail : " + activity.getActivityNum());
			/*res.setCreDate(Calendar.getInstance().getTime());*/
			Activitys act = sqlSession.selectOne(statement, activity);
			return act;
		} finally {
			sqlSession.close();
		}
	}

	public Activitys modifyActivityOne(String activityNum) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".modifyActivityOne";
			System.out.println("Repository modify : " + activityNum);
			/*res.setCreDate(Calendar.getInstance().getTime());*/
			Activitys actm = sqlSession.selectOne(statement, activityNum);
			return actm;
		} finally {
			sqlSession.close();
		}
	}

	public Integer updateActivity(Activitys activity) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".updateActivity";
			System.out.println("Repository modify : " + activity.getActivityNum());
			Integer result = sqlSession.update(statement, activity);
			System.out.println("Repository modify getActivityNum() : " + activity.getActivityNum());
			if (result > 0) {
				sqlSession.commit();
			}else { 
				sqlSession.rollback();
			}
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Integer deleteActivity(String activityNum) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".deleteActivity";
			System.out.println("Repository modify : " + activityNum);
			Integer result = sqlSession.delete(statement, activityNum);
			System.out.println("dddddd" + result);
			if (result > 0) {
				sqlSession.commit();
			}else { 
				sqlSession.rollback();
			}
			return result;
		} finally {
			sqlSession.close();
		}
	}

}
