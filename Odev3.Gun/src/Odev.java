import Entities.User;
import Operation.UserManager;

public class Odev {

	public static void main(String[] args) {
		
		UserManager userManager=new UserManager();
		userManager.add(new User(1,"Ahmet","Tekçe","ahmettekce@msn.com"));

	}

}
