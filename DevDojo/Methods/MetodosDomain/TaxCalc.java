package MetodosDomain;

public class TaxCalc {
	public static void PcTaxCalculator(Computer computer) {
		double tax = computer.calcTaxes();
		
		System.out.println("Tax report:");
		System.out.println("Pc name: "+ computer.getName());
		System.out.println("Pc value: " + computer.getValue());
		System.out.println("Taxes: "+ tax);
		System.out.println("--------------");
	}
	
	public static void TomatoTaxCalculator(Tomato tomato) {
		double tax = tomato.calcTaxes();
		
		System.out.println("Tax report:");
		System.out.println("tomato name: "+ tomato.getName());
		System.out.println("tomato value: " + tomato.getValue());
		System.out.println("Taxes: "+ tax);
	}
}
