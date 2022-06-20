package MetodosTest;

import MetodosDomain.Person;

public class PersonTest {
public static void main(String[] args) {
	Person person = new Person();
	
	person.setName("Kirito");
	person.setAge(16);
	
	System.out.println(person.getName());
	System.out.println(person.getAge());
}
}
