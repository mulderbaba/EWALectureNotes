package tr.edu.hacettepe.bbm490;

import java.util.List;

public class MyBean {

	private List<String> countries;

	public List<String> getCountries() {
		return countries;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}

	public void printMessage() {
		for (String country : countries) {
			System.out.println(country);
		}
	}
}
