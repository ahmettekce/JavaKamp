package Operation;

import Entities.Student;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getName()+" "+student.getLastName()+" kullanıcı eklendi!");
	}
}
