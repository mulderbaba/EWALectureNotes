package tr.edu.hacettepe.bbm490;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

	@Transactional
	public void create(String userid, String firstname, String lastname,
			String password, int type) {

		String sql = "insert into Users "
				+ "(userid, firstname, lastname, password, type) values (?, ?, ?, ?, ?)";

		getJdbcTemplate().update(sql,
				new Object[] { userid, firstname, lastname, password, type });

		throw new RuntimeException();
	}

	public User find(String userid) {
		String sql = "select * from Users where userid = ?";
		User user = getJdbcTemplate().queryForObject(sql,
		          BeanPropertyRowMapper.newInstance(User.class), userid);
		 
			return user;
	}
}
