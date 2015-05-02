package tr.edu.hacettepe.bbm490;

public interface UserDao {
	void create(String userid, String firstname, String lastname, String password, int type);
	User find(String userid);
}
