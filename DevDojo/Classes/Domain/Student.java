package Domain;

public class Student {
	public int age;
	public String name;
	public char sex;
	
	public void studentConstuctor(Student student) {
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.sex);
	}
	
	public void methodConstructor() {
		System.out.println("-------------------");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.sex);
	}
}
