package MetodosTest;

import MetodosDomain.Professor;
import MetodosDomain.University;

public class UniTest {
	public static void main(String[] args) {
		Professor sensei1 = new Professor("Jiraya-sensei");
		Professor sensei2 = new Professor("Kakashi-sensei");
		Professor[] professors = {sensei1,sensei2};
		University uni = new University("Konoha", professors);
		
		
		uni.construct();
	}
}
