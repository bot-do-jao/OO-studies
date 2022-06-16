package MetodosTest;

import MetodosDomain.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee seuMadruga = new Employee();
		Employee saitama = new Employee();
		
		seuMadruga.name = "Seu Madruga";
		seuMadruga.age = 34;
		seuMadruga.sallary = new double[] {1245,4578,54858};
		
		saitama.name = "One Punch Man";
		saitama.age = 26;
		saitama.sallary = new double[] {1245.45, 145.54, 548.59};
		
		seuMadruga.employConstruct();
		saitama.employConstruct();
		
		
		
	}
}
