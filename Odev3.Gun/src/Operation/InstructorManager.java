package Operation;

import Entities.Instructor;
import Entities.User;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+" "+instructor.getLastName()+" kullan�c� eklendi!");
	}
}
