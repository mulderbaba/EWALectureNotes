package tr.edu.hacettepe.bbm490;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static tr.edu.hacettepe.bbm490.DateUtil.tomorrow;
import static tr.edu.hacettepe.bbm490.DateUtil.yesterday;

public class Test {

	public static void main(String... args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bbm490-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		Employee employee = new Employee("John", "Goodman", "dog", 1);
		employee.setWorkingPeriod(new Period(yesterday(), tomorrow()));

		entityManager.persist(employee);
		
		transaction.commit();
		entityManager.close();
	}
}

