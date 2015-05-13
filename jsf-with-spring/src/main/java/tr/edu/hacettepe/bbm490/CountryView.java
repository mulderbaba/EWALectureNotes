package tr.edu.hacettepe.bbm490;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("session")
public class CountryView implements Serializable {

	@Autowired
	private CountryService countryService;
	
	public List<Country> getCountries() {
		return countryService.getCountries();
	}
}
