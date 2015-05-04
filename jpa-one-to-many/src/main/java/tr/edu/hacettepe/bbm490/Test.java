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

		ActionItem item1 = new ActionItem("Write the Code");
		ActionItem item2 = new ActionItem("Run the Test");
		entityManager.persist(item1);
		entityManager.persist(item2);

		Employee employee = new Employee("John", "Goodman", "dog", 1);
		employee.getItems().add(item1);
		employee.getItems().add(item2);

		entityManager.persist(employee);
		
		transaction.commit();
		entityManager.close();
	}
}

