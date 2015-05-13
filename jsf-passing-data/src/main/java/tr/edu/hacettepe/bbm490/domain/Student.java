package tr.edu.hacettepe.bbm490.domain;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;
	private String lastname;

	public Student(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
