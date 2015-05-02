package tr.edu.hacettepe.bbm490;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao dao = context.getBean(UserDao.class);
		dao.create("101", "Ali", "Eren", "dog", 0);
		
		User user101 = dao.find("101");
		System.out.println(user101);
	}
}
