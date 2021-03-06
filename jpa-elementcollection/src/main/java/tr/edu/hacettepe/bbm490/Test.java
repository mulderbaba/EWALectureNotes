package tr.edu.hacettepe.bbm490;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String... args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bbm490-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		Employee employee = new Employee("John", "Goodman", "dog", 1);
		employee.getNicknames().add("The Ripper");
		employee.getNicknames().add("The Jackal");
		employee.getNicknames().add("The Dude");

		entityManager.persist(employee);
		
		transaction.commit();
		entityManager.close();
	}
}

