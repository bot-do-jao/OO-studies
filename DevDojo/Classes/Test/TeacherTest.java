package Test;

import Domain.Teacher;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		
		teacher.age = 140;
		teacher.name = "Mestre Kami";
		teacher.sex = 'G';
		
		System.out.println(teacher.name + " " + teacher.age + " " + teacher.sex);
		
	}

}
