package MetodosDomain;

public class ProductTest {
	public static void main(String[] args) {
		Computer computer = new Computer("Acer nitro 5", 10000);
		Tomato tomato = new Tomato("Cereja", 5);
		
		
		TaxCalc.PcTaxCalculator(computer);
		System.out.println("--------------");
		TaxCalc.TomatoTaxCalculator(tomato);	
		
		Product pc = new Computer("Lenovo", 15000);
		
		System.out.println(pc);
		System.out.println(pc.calcTaxes());
		//polimorfismo me deixa pegar os atributos da classe pai direto, mas nao o contrario
	}
}
