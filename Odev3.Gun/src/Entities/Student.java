package Entities;
public class Student extends Human{
	private String Course;

	public Student(int id, String name, String lastName, String course) {
		super(id, name, lastName);
		Course = course;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}
}
