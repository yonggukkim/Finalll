package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.City;
import model.Continent;
import model.Country;

@Repository
public class CategoryRepository extends AbstractRepository{
	
	private final String namespace = "repository.mapper.CategoryMapper";
	
	public List<Continent> continentSelect() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository1");
			String statement = namespace + ".continentSelect";
			
			return sqlSession.selectList(statement);
		} finally {
			sqlSession.close();
		}
	}

	public List<Country> countrySelect(Continent continent) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository2");
			String statement = namespace + ".countrySelect";
			return sqlSession.selectList(statement, continent);
		} finally {
			sqlSession.close();
		}
	}

	public List<City> citySelect(Country country) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository3"+country.getContinentName());
			System.out.println("Repository3"+country.getCountryNum());
			String statement = namespace + ".citySelect";
			List<City> lt = sqlSession.selectList(statement, country);
			for(Object temp : lt) {
				City ct = (City)temp;
				System.out.println("repo citySelect getCountryName : " + ct.getCityName() );
			}
			return lt;
		} finally {
			sqlSession.close();
		}
	}

	public List<Continent> continentSelectHotel() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository1");
			String statement = namespace + ".continentSelectHotel";
			
			return sqlSession.selectList(statement);
		} finally {
			sqlSession.close();
		}
	}

	public List<Country> countrySelectHotel(Continent continent) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository2");
			String statement = namespace + ".countrySelectHotel";
			return sqlSession.selectList(statement, continent);
		} finally {
			sqlSession.close();
		}
	}

	public List<City> citySelectHotel(Country country) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository3"+country.getContinentName());
			System.out.println("Repository3"+country.getCountryNum());
			String statement = namespace + ".citySelectHotel";
			List<City> lt = sqlSession.selectList(statement, country);
			for(Object temp : lt) {
				City ct = (City)temp;
				System.out.println("repo citySelect getCountryName : " + ct.getCityName() );
			}
			return lt;
		} finally {
			sqlSession.close();
		}
	}

	public List<Continent> continentSelectPkg() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository1");
			String statement = namespace + ".continentSelectPkg";
			
			return sqlSession.selectList(statement);
		} finally {
			sqlSession.close();
		}
	}

	public List<Country> countrySelectPkg(Continent continent) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository2");
			String statement = namespace + ".countrySelectPkg";
			return sqlSession.selectList(statement, continent);
		} finally {
			sqlSession.close();
		}
	}

	public List<City> citySelectPkg(Country country) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			System.out.println("Repository3"+country.getContinentName());
			System.out.println("Repository3"+country.getCountryNum());
			String statement = namespace + ".citySelectPkg";
			List<City> lt = sqlSession.selectList(statement, country);
			for(Object temp : lt) {
				City ct = (City)temp;
				System.out.println("repo citySelect getCountryName : " + ct.getCityName() );
			}
			return lt;
		} finally {
			sqlSession.close();
		}
	}
	
}
