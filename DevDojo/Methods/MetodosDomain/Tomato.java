package MetodosDomain;

public class Tomato extends Product {
	public static final double TAX_PERCENT = 0.06;
	private String expirationDate;

	public Tomato(String name, double value) {
		super(name, value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcTaxes() {
		System.out.println("Calculating taxes: ");
		return this.value * TAX_PERCENT;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	

}
