package tr.edu.hacettepe.bbm490;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class MyActionBean2 implements Serializable {

	private List<Country> countries = new ArrayList<Country>();
	private Country newCountry = new Country();

	public MyActionBean2() {
		countries.add(new Country(1, "Turkey", 75000000l));
		countries.add(new Country(2,"USA", 350000000l));
		countries.add(new Country(3, "Germany", 100000000l));
	}

	public String addCountry() {
		countries.add(newCountry);
		newCountry = new Country();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Country added successfully"));
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
