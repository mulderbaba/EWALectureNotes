package tr.edu.hacettepe.bbm490;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

	List<Country> countries = new ArrayList<Country>();
	
	@PostConstruct
	public void setup() {
		countries.add(new Country(1, "Turkey", 75000000l));
		countries.add(new Country(2,"USA", 350000000l));
		countries.add(new Country(3, "Germany", 100000000l));
	}
	
	public List<Country> getCountries() {
		return countries;
	}
}
