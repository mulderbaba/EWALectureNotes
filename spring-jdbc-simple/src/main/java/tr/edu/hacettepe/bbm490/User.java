package tr.edu.hacettepe.bbm490;

public class User {

	private String userid;
	private String firstname;
	private String lastname;
	private String password;
	private int type;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", password=" + password
				+ ", type=" + type + "]";
	}
}
