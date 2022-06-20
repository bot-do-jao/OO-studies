package MetodosTest;

import MetodosDomain.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee seuMadruga = new Employee();
		Employee saitama = new Employee();
		
		seuMadruga.setName("Seu Madruga");
		seuMadruga.setAge(34);
		seuMadruga.setSallary( new double[] {1245,4578,54858});
		
		saitama.setName( "One Punch Man");
		saitama.setAge( 26);
		saitama.setSallary(new double[] {1245.45, 145.54, 548.59});
		
		seuMadruga.employConstruct();
		saitama.employConstruct();
		
		
		
	}
}
