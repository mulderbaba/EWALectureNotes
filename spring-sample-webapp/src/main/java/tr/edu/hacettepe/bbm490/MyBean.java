package tr.edu.hacettepe.bbm490;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBean {

	public MyBean() {
		System.out.println("Constructed");
	}

	@PostConstruct
	public void setup() {
		System.out.println("My Bean is constructed, now in post construction");
	}
}
