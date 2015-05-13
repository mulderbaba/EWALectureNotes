package tr.edu.hacettepe.bbm490.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class School implements Serializable {

	private String name;
	private List<Student> students = new ArrayList<Student>();
	
	public School(String name, Student... students) {
		this.name = name;
		this.students.addAll(Arrays.asList(students));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
