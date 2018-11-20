package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import model.City;
import model.Continent;
import model.Country;
import repository.CategoryRepository;
@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public void continentSelect(Model model) {
		System.out.println("service1 ");
		List<Continent> list = categoryRepository.continentSelect();
		model.addAttribute("list", list);
	}

	public void countrySelect(Continent continent, Model model) {
		System.out.println("service2 " + continent.getContinentName());
		List<Country> list = categoryRepository.countrySelect(continent);
		model.addAttribute("list", list);
	}

	public void citySelect(Country country, Model model) {
		System.out.println("service3 " + country.getCountryNum());
		System.out.println("service3 " + country.getContinentName());
		List<City> list = categoryRepository.citySelect(country);
		System.out.println("test"+list);
		model.addAttribute("list", list);
	}

}
