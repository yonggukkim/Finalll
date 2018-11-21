package repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.Activitys;
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

}
