package heranca;

public class HerancaTest {
	public static void main(String[] args) {
		Address address = new Address();
		Person person = new Person();
		
		address.setCep("81712544");
		address.setStreet("814 sul");
		person.setName("Luffy");
		person.setCpf("0015548");
		person.setAddress(address);
		person.construct();
		
		Employee employee = new Employee();
		
		employee.setName("Oda");
		employee.setCpf("007315548");
		employee.setAddress(address);
		employee.setSallary(20000);
		System.out.println();
		employee.construct();
	}
}
