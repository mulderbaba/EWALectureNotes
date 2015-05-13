package tr.edu.hacettepe.bbm490;

import java.io.Serializable;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SecondPage implements Serializable {

	public String navigate() {
		boolean result = new Random().nextBoolean();
		if (result) {
			return "true";
		}
		else {
			return "false";
		}
	}
}
