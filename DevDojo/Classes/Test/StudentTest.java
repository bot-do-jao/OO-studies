package Test;

import Domain.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		Student student = new Student();
		Student otherStudent = new Student();
		
		
		student.name = "Goku";
		student.age = 45;
		student.sex = 'M';
		
		otherStudent.name = "Midoriya";
		otherStudent.age = 15;
		otherStudent.sex = 'M';
		
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.sex);
		System.out.println("-------------------");
		
		student.studentConstuctor(otherStudent);
		student.methodConstructor();
		otherStudent.methodConstructor();
		
	}
}
