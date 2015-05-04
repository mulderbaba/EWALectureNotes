package tr.edu.hacettepe.bbm490.dao;

import tr.edu.hacettepe.bbm490.domain.User;

public interface UserDao {
	
	void create(User user);

	User find(int id);
}
