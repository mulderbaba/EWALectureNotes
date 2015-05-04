package tr.edu.hacettepe.bbm490.dao;

import org.springframework.stereotype.Repository;
import tr.edu.hacettepe.bbm490.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void create(User user) {
		entityManager.persist(user);
	}

	public User find(int id) {
		return entityManager.find(User.class, id);
	}
}
