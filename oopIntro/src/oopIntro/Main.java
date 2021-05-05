package oopIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//kamp();
	
		List<Integer>list=new ArrayList<>();
		list.add(73);
		list.add(67);
		list.add(38);
		list.add(33);
		System.out.println(gradingStudents(list));
		
    }
    
	public static List<Integer> gradingStudents(List<Integer> grades) {
		
		List<Integer>result=new ArrayList<>();
		for(int i=0;i<grades.size();i++) {
			if(grades.get(i)>35) {
				int value=((grades.get(i)/5)+1)*5;
				if(value-grades.get(i)<3) {
					result.add(value);
				}else {
					result.add(grades.get(i));
				}
			}else {
				result.add(grades.get(i));
			}
			
		}
		
	    return result;

	}

	private static void kamp() {
		Course course1=new Course(1,"Csharp","Engin Demiroğ",100);
		Course course2=new Course(2,"Java","Engin Demiroğ",32);
		Course course3=new Course(3,"Programla temelleri","Engin Demiroğ",100);
		
		ArrayList<Course> courses=new ArrayList<Course>();
		
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		
		for(Course course:courses) {
			System.out.println("Kursun adı: "+ course.name+" Eğitmen: "+course.instructor);
		}
		
		
		CourseManager courseManager=new CourseManager();
		Course course4=new Course(4,"Python","Engin Demiroğ",0);
		courses.add(courseManager.Add(course4));
		courses.remove(courseManager.Delete(course3));
		
		for(Course course:courses) {
			System.out.println("Kursun adı: "+ course.name+" Eğitmen: "+course.instructor);
		}
	}

}
