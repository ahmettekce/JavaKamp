package oopIntro;

public class CourseManager {
	public Course Add(Course course) {
		System.out.println("kurs: "+course.name+ " eklendi.");
		return course;
	}
	public int Delete(Course course) {
		System.out.println("kurs: "+course.name+ " silindi.");
		return course.id-1;
	}
}
