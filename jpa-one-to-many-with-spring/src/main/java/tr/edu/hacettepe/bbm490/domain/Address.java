package tr.edu.hacettepe.bbm490.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private int id;
	private String addressline1;
	private String addressline2;
	private String county;
	private String city;
	private String country;
	private int zip;
	
	public Address() {
	}
	
	public Address(String addressline1, String addressline2,
			String county, String city, String country, int zip) {
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.county = county;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", addressline1=" + addressline1
				+ ", addressline2=" + addressline2 + ", county=" + county
				+ ", city=" + city + ", country=" + country + ", zip=" + zip
				+ "]";
	}
}
