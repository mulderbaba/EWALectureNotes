package tr.edu.hacettepe.bbm490;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import tr.edu.hacettepe.bbm490.dao.UserDao;
import tr.edu.hacettepe.bbm490.domain.Address;
import tr.edu.hacettepe.bbm490.domain.User;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao dao = context.getBean(UserDao.class);

		User user = new User("John", "Goodman", "dog", 1);
		Address address1 = new Address("Guncicekleri Sok", null, "Cankaya", "Ankara", "TR", 33333);
		Address address2 = new Address("Lale Sok", null, "Balgat", "Ankara", "TR", 44444);
		user.getAddresses().add(address1);
		user.getAddresses().add(address2);

		dao.create(user);
	}
}
