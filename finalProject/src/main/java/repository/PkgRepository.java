package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.Hotel;
import model.Pkg;

@Repository
public class PkgRepository extends AbstractRepository{
	private final String namespace = "repository.mapper.PkgMapper";

	public List<Pkg> selectPkgList(Pkg pkg) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectPkgList";
			System.out.println("Repository" + pkg.getPkgNum());
			System.out.println("Repository" + pkg.getPkgName());
			/* res.setCreDate(Calendar.getInstance().getTime()); */
			List<Pkg> list = sqlSession.selectList(statement, pkg);
			for (Object o : list) {
				Pkg p = (Pkg) o;
				System.out.println("Repositoryafter" + p.getPkgNum());
				System.out.println("Repositoryafter" + p.getPkgName());
			}
			return list;
		} finally {
			sqlSession.close();
		}
	}

	public Integer insertPkg(Pkg p) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".insertPkg";
			System.out.println("Repositorybefor" + p.getContinentName());
			System.out.println("Repositorybefor" + p.getPkgPrice());
//			activity.setActivityRegdate(Calendar.getInstance().getTime());
//			activity.setActivityUptdate(Calendar.getInstance().getTime());
			Integer result = sqlSession.insert(statement, p);
			System.out.println("Repositoryafter" + p.getContinentName());
			System.out.println("Repositoryafter" + p.getPkgPrice());
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Pkg selectPkgOne(Pkg pkg) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectPkgOne";
			System.out.println("Repository detail : " + pkg.getPkgNum());
			/* res.setCreDate(Calendar.getInstance().getTime()); */
			Pkg p = sqlSession.selectOne(statement, pkg);
			return p;
		} finally {
			sqlSession.close();
		}
	}
	
}
