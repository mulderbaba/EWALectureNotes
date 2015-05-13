package tr.edu.hacettepe.bbm490;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MyInputBean2 {

	private List<String> countries = new ArrayList<String>();
	private String selectedCountry;

	public MyInputBean2() {
		countries.add("Turkey");
		countries.add("USA");
		countries.add("Germany");
	}
	
	public List<String> getCountries() {
		return countries;
	}
	public void setCountries(List<String> countries) {
		this.countries = countries;
	}

	public String getSelectedCountry() {
		return selectedCountry;
	}

	public void setSelectedCountry(String selectedCountry) {
		this.selectedCountry = selectedCountry;
	}
}
