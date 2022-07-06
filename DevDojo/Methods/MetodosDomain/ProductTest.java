package MetodosDomain;

public class ProductTest {
	public static void main(String[] args) {
		Computer computer = new Computer("Acer nitro 5", 10000);
		Tomato tomato = new Tomato("Cereja", 5);
		tomato.setExpirationDate("11/12/2025");
		
		TaxCalc.taxCalc(computer);
		System.out.println("--------------");
		TaxCalc.taxCalc(tomato);	
		
		Product pc = new Computer("Lenovo", 15000);
		Product tv = new Television("Samsung 50\" ", 5000);
		
		System.out.println("----------------");
		TaxCalc.taxCalc(pc);
		System.out.println("----------------");
		TaxCalc.taxCalc(tv);
		//polimorfismo me deixa pegar os atributos da classe pai direto, mas nao o contrario
	}
}
