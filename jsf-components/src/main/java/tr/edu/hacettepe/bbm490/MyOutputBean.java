package tr.edu.hacettepe.bbm490;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MyOutputBean implements Serializable {

	public MyOutputBean() {
		this.value = "johnDoe";
	}	
	
	private String value;
	
	private String save() {
		return null;
	}

	public String getValue() {
		return value;
	}
}


