package MetodosDomain;

public class Computer extends Product {
	
	public static final double TAX_PERCENT = 0.21;

	public Computer(String name, double value) {
		super(name, value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcTaxes() {
		System.out.println("Calculating taxes: ");
		return this.value * TAX_PERCENT;
	}

	
	
}
