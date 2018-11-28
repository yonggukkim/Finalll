package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.Gift;
import model.GiftRestore;

@Repository
public class GiftRepository extends AbstractRepository {

	private final String namespace = "repository.mapper.GiftMapper";

	public Integer giftInsert(Gift gift) {
		System.out.println("gift repository 진입");
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".giftInsert";
			Integer result = sqlSession.insert(statement, gift);
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

	public List<Gift> giftSelect(Gift gift) {
		System.out.println("gift repository-giftSelect 진입");
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".giftSelect";
			List<Gift> list = sqlSession.selectList(statement, gift);

			return list;

		} finally {
			sqlSession.close();
		}

	}

	public Gift giftSelectByCondition(Gift gift) {
		System.out.println("gift repository-giftSelectByCond 진입");
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".giftSelectByCondition";
			Gift giftDetail = sqlSession.selectOne(statement, gift);
			System.out.println("gift repository-giftSelectByCond 값 주입 성공"  );
			return giftDetail;
		} finally {
			sqlSession.close();
		}

	}

	public Integer giftDelete(Gift gift) {
		System.out.println("gift repository-giftDelete 진입");
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".giftSelectDelete";
			Integer result = sqlSession.delete(statement, gift);
			System.out.println("gift repository-giftDelete 값 주입 성공 gift result=" + result);
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

	public Integer giftModify(Gift gift) {
		System.out.println("gift repostory - giftModify 진입");
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".giftModify";
			Integer result = sqlSession.delete(statement, gift);
			System.out.println("gift repository-giftModify 값 주입 성공 gift result=" + result);
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

	public List<Gift> giftSelectByName(Gift gift) {
		System.out.println("gift repository-giftSelectByName 진입");
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".giftSelectByName";
			List<Gift> searchedList = sqlSession.selectList(statement, gift);
			System.out.println("gift repository-giftSelectByName 값 주입 성공"  );
			return  searchedList;
		} finally {
			sqlSession.close();
		}
		
	}

/*	public Integer grInsert(GiftRestore gr) {
		System.out.println("gift repostory - grInsert 진입");
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".grInsert";
			Integer grResult = sqlSession.insert(statement, gr);
			System.out.println("gift repository-grInsert 값 주입 성공 gr result=" + grResult);
			if (grResult > 0) {
				sqlSession.commit();

			} else {
				sqlSession.rollback();
			}
			return grResult;

		} finally {
			sqlSession.close();
		}

	}*/
}