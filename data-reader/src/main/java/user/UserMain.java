package user;

public class UserMain {
	
	private String username ;
	private String password ;
	public String getUsername() {
		return username;
	}
	
	
	public UserMain(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}




