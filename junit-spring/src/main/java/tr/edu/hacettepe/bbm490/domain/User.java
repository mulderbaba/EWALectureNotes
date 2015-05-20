package tr.edu.hacettepe.bbm490.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Users")
public class User extends BaseEntity {

	private String firstname;
	private String lastname;
	private String password;
	private int type;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Address> addresses = new ArrayList<Address>();
	
	public User() {
	}
	
	public User(String firstname, String lastname, String password, int type) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.type = type;
	}

	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", password=" + password
				+ ", type=" + type + ", addresses=" + addresses + "]";
	}
}