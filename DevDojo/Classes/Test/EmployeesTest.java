package Test;

import Domain.Developer;
import Domain.Manager;

public class EmployeesTest {
	public static void main(String[] args) {
		Manager manager = new Manager("Nami", 5000);
		Developer dev = new Developer("Kirito", 8000);
		
		System.out.println(manager);
		System.out.println(dev);
	}
}
