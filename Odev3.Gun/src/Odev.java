import Entities.User;
import Operation.UserManager;

public class Odev {

	public static void main(String[] args) {
		
		UserManager userManager=new UserManager();
		userManager.add(new User(1,"Ahmet","Tek�e","ahmettekce@msn.com"));

	}

}
