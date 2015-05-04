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

		Phone cellPhone = new Phone("5553213435");
		Phone landPhone = new Phone("3124445353");

		Employee employee = new Employee("John", "Goodman", "dog", 1);
		employee.getPhones().put(PhoneType.CELL, cellPhone);
		employee.getPhones().put(PhoneType.LAND, landPhone);

		entityManager.persist(employee);
		
		transaction.commit();
		entityManager.close();
	}
}

