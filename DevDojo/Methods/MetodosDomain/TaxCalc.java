package MetodosDomain;

public class TaxCalc {
	public static void taxCalc(Product product) {
		double tax = product.calcTaxes();
		
		System.out.println("Tax report:");
		System.out.println("Product name: "+ product.getName());
		System.out.println("Product price: "+ product.getValue());
		System.out.println("Taxes: "+ tax);
		if (product instanceof Tomato) {
			Tomato tomato = (Tomato) product;
			System.out.println(tomato.getExpirationDate());
		}
	}
}
