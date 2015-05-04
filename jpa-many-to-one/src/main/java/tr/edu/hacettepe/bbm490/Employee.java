package tr.edu.hacettepe.bbm490;

import javax.persistence.*;

@Entity
public class Employee {

	private int employeeid;
	private String firstname;
	private String lastname;
	private String password;
	private int type;
	private Company company;

	public Employee() {
	}

	public Employee(String firstname, String lastname, String password, int type) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.type = type;
	}

	@Id
	@GeneratedValue
	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
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

	@ManyToOne
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
