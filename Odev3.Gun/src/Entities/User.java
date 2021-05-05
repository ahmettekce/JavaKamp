package Entities;
public class User extends Human{
	private String Email;

	public User(int id,String name,String lastName,String email) {
		super(id,name,lastName);
		Email = email;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
}
