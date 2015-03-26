package tr.edu.hacettepe.bbm490;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration1 {
	@Bean
	public Foo foo() {
		Foo foo = new Foo();
		foo.setName("my foo");
		return foo;
	}
}
