package tr.edu.hacettepe.bbm490;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AjaxBean1 implements Serializable {

	private int counter;
	
	public String increment() {
		counter++;
		return null;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
