package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.Activitys;
import model.City;
import model.Hotel;
import model.Pkg;
import model.Restore;

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

	public Integer insertPkg(Pkg p, List<Restore> list) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".insertPkg";
			String statement1 = namespace + ".selectNum";
			String statement2 = namespace + ".insertRestore";
			System.out.println("Repositorybefor" + p.getContinentName());
			System.out.println("Repositorybefor" + p.getPkgPrice());
//			activity.setActivityRegdate(Calendar.getInstance().getTime());
//			activity.setActivityUptdate(Calendar.getInstance().getTime());
			String s = sqlSession.selectOne(statement1);
			p.setPkgNum(s);
			System.out.println("insertPkg" + s);
			Integer result = sqlSession.insert(statement, p);
			System.out.println(list.size());
			int cnt = 0;
			for(Restore a : list) {
				a.setResNum(s);
				System.out.println("count"+ cnt++);
				System.out.println("a" + a.getFileNo());
				System.out.println("a" + a.getFold());
				System.out.println("a" + a.getStoredFileName());
				System.out.println("a" + a.getFileName());
				System.out.println("a" + a.getEtc());
				sqlSession.insert(statement2, a);
			}
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

	public List<Hotel> hotelSelectPkg(City city) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository3"+city.getContinentName());
			System.out.println("Repository3"+city.getCountryNum());
			System.out.println("Repository3"+city.getCityNum());
			String statement = namespace + ".hotelSelectPkg";
			List<Hotel> lt = sqlSession.selectList(statement, city);
			for(Object temp : lt) {
				Hotel ct = (Hotel)temp;
				System.out.println("repo hotelSelect getHotelNum : " + ct.getHotelNum());
			}
			return lt;
		} finally {
			sqlSession.close();
		}
	}

	public List<Activitys> activitySelectPkg(City city) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository3"+city.getContinentName());
			System.out.println("Repository3"+city.getCountryNum());
			System.out.println("Repository3"+city.getCityNum());
			String statement = namespace + ".activitySelectPkg";
			List<Activitys> lt = sqlSession.selectList(statement, city);
			for(Object temp : lt) {
				Activitys ct = (Activitys)temp;
				System.out.println("repo activitySelect getActivityNum : " + ct.getActivityNum());
			}
			return lt;
		} finally {
			sqlSession.close();
		}
	}

	public Hotel hotelSelectOnePkg(Hotel hotel) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository3"+hotel.getContinentName());
			System.out.println("Repository3"+hotel.getCountryNum());
			System.out.println("Repository3"+hotel.getCityNum());
			String statement = namespace + ".hotelSelectOnePkg";
			Hotel lt = sqlSession.selectOne(statement, hotel);
				System.out.println("repo hotelSelect getHotelNum : " + lt.getHotelPrice());
			return lt;
		} finally {
			sqlSession.close();
		}
	}

	public Activitys activitySelectOnePkg(Activitys activity) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository3"+activity.getContinentName());
			System.out.println("Repository3"+activity.getCountryNum());
			System.out.println("Repository3"+activity.getCityNum());
			String statement = namespace + ".activitySelectOnePkg";
			Activitys lt = sqlSession.selectOne(statement, activity);
				System.out.println("repo activitySelect getActivityNum : " + lt.getActivityNum());
			return lt;
		} finally {
			sqlSession.close();
		}
	}

//	public void insertRestore(Restore res) {
//		SqlSession sqlSession = getSqlSessionFactory().openSession();
//		try {
//			String statement = namespace + ".insertRestore";
//			System.out.println("Repository" + res.getFileNo());
//			System.out.println("Repository" + res.getFileName());
//			/* res.setCreDate(Calendar.getInstance().getTime()); */
//			Integer result = sqlSession.insert(statement, res);
//			if (result > 0)
//				sqlSession.commit();
//			else
//				sqlSession.rollback();
//		} finally {
//			sqlSession.close();
//		}
//	}
	
}
