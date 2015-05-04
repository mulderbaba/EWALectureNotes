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

		Employee employee1 = new Employee("John", "Goodman", "dog", 1);
		entityManager.persist(employee1);

		Employee employee2 = new Employee("Mike", "Turner", "cat", 2);
		entityManager.persist(employee2);

		Employee employee3 = new Employee("Jack", "London", "bird", 2);
		entityManager.persist(employee3);

		Department department1 = new Department("Engineering Department", employee1, employee2);
		entityManager.persist(department1);

		Department department2 = new Department("R&D Department", employee1, employee3);
		entityManager.persist(department2);

		transaction.commit();
		entityManager.close();
	}
}

