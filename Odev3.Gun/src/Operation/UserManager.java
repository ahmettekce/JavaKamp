package Operation;

import Entities.Human;
import Entities.IEntiti;
import Entities.User;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getName()+" "+user.getLastName()+" kullanýcý eklendi!");
	}

		
}
