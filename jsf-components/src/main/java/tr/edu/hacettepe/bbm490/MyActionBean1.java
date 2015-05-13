package tr.edu.hacettepe.bbm490;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MyActionBean1 implements Serializable {

	private List<Country> countries = new ArrayList<Country>();
	private Country newCountry = new Country();

	public MyActionBean1() {
		countries.add(new Country(1, "Turkey", 75000000l));
		countries.add(new Country(2,"USA", 350000000l));
		countries.add(new Country(3, "Germany", 100000000l));
	}

	public String addCountry() {
		countries.add(newCountry);
		newCountry = new Country();
		return null;
	}
	
	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public Country getNewCountry() {
		return newCountry;
	}

	public void setNewCountry(Country newCountry) {
		this.newCountry = newCountry;
	}
}
