package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.Activitys;
import model.Hotel;
import model.Restore;

@Repository
public class HotelRepository extends AbstractRepository {
	private final String namespace = "repository.mapper.HotelMapper";

	public List<Hotel> selectHotelList(Hotel hotel) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectHotelList";
			System.out.println("Repository" + hotel.getHotelNum());
			System.out.println("Repository" + hotel.getHotelName());
			/* res.setCreDate(Calendar.getInstance().getTime()); */
			List<Hotel> list = sqlSession.selectList(statement, hotel);
			for (Object o : list) {
				Hotel tel = (Hotel) o;
				System.out.println("Repositoryafter" + tel.getHotelNum());
				System.out.println("Repositoryafter" + tel.getHotelName());
			}
			return list;
		} finally {
			sqlSession.close();
		}
	}

	public Integer insertHotel(Hotel tel, List<Restore> list) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".insertHotel";
			String statement1 = namespace + ".selectNum";
			String statement2 = namespace + ".insertRestore";
			System.out.println("Repositorybefor" + tel.getContinentName());
			System.out.println("Repositorybefor" + tel.getHotelPrice());
//			activity.setActivityRegdate(Calendar.getInstance().getTime());
//			activity.setActivityUptdate(Calendar.getInstance().getTime());
			String s = sqlSession.selectOne(statement1);
			tel.setHotelNum(s);
			Integer result = sqlSession.insert(statement, tel);
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
			System.out.println("Repositoryafter" + tel.getContinentName());
			System.out.println("Repositoryafter" + tel.getHotelPrice());
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
			/* res.setCreDate(Calendar.getInstance().getTime()); */
			Integer result = sqlSession.insert(statement, res);
			if (result > 0)
				sqlSession.commit();
			else
				sqlSession.rollback();
		} finally {
			sqlSession.close();
		}
	}

	public Hotel selectHotelOne(Hotel hotel) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectHotelOne";
			System.out.println("Repository detail : " + hotel.getHotelNum());
			/* res.setCreDate(Calendar.getInstance().getTime()); */
			Hotel tel = sqlSession.selectOne(statement, hotel);
			return tel;
		} finally {
			sqlSession.close();
		}
	}

	public Hotel modifyHotelOne(String hotelNum) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".modifyHotelOne";
			System.out.println("Repository modify : " + hotelNum);
			/* res.setCreDate(Calendar.getInstance().getTime()); */
			Hotel tel = sqlSession.selectOne(statement, hotelNum);
			return tel;
		} finally {
			sqlSession.close();
		}
	}

	public Integer updateHotel(Hotel hotel) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".updateHotel";
			System.out.println("Repository modify : " + hotel.getHotelNum());
			Integer result = sqlSession.update(statement, hotel);
			System.out.println("Repository modify getHotelNum() : " + hotel.getHotelNum());
			if (result > 0) {
				sqlSession.commit();
			} else {
				sqlSession.rollback();
			}
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Integer deleteHotel(String hotelNum) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".deleteHotel";
			System.out.println("Repository modify : " + hotelNum);
			Integer result = sqlSession.delete(statement, hotelNum);
			System.out.println("dddddd" + result);
			if (result > 0) {
				sqlSession.commit();
			} else {
				sqlSession.rollback();
			}
			return result;
		} finally {
			sqlSession.close();
		}
	}
}
