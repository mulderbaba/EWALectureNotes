package tr.edu.hacettepe.bbm490.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tr.edu.hacettepe.bbm490.domain.School;

@ManagedBean
@SessionScoped
public class StudentView implements Serializable {

	private School school;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
}


