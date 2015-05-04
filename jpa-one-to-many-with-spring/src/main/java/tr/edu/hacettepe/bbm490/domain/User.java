package tr.edu.hacettepe.bbm490.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

	private int userid;
	private String firstname;
	private String lastname;
	private String password;
	private int type;
	private List<Address> addresses = new ArrayList<Address>();
	
	public User() {
	}
	
	public User(String firstname, String lastname, String password, int type) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.type = type;
	}

	@Id
	@GeneratedValue
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="userid")
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", password=" + password
				+ ", type=" + type + ", addresses=" + addresses + "]";
	}
}