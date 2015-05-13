package tr.edu.hacettepe.bbm490.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tr.edu.hacettepe.bbm490.domain.School;
import tr.edu.hacettepe.bbm490.domain.Student;

@ManagedBean
@SessionScoped
public class SchoolView implements Serializable {

	private List<School> schools = new ArrayList<School>();

	@PostConstruct
	public void init() {
		schools.add(new School("Happy Days", new Student("John", "Doe"), new Student("Jack", "Reacher")));
	}

	public List<School> getSchools() {
		return schools;
	}
}