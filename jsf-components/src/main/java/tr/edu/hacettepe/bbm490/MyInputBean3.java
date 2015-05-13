package tr.edu.hacettepe.bbm490;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MyInputBean3 {

	private List<String> countries = new ArrayList<String>();
	private List<String> selectedCountries;

	public MyInputBean3() {
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

	public List<String> getSelectedCountries() {
		return selectedCountries;
	}

	public void setSelectedCountries(List<String> selectedCountries) {
		this.selectedCountries = selectedCountries;
	}
}
