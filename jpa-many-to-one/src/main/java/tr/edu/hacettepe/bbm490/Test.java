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

		Company company = new Company("Happy Days Jumping Castles");
		entityManager.persist(company);

		Employee employee1 = new Employee("John", "Goodman", "dog", 1);
		employee1.setCompany(company);
		entityManager.persist(employee1);

		Employee employee2 = new Employee("Mike", "Turner", "cat", 2);
		employee2.setCompany(company);
		entityManager.persist(employee2);

		transaction.commit();
		entityManager.close();
	}
}

