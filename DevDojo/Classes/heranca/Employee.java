package heranca;

public class Employee extends Person {
	private double sallary;
	
	public Employee() {
	}

	public Employee(String name, String cpf, double sallary) {
		super(name, cpf);
		this.sallary = sallary;
	}

	public void construct() {
		super.construct();
		System.out.println(this.sallary);
	}
	
	public void paper() {
		System.out.println("my name is: " + this.name);
	}
	
	public double getSallary() {
		return sallary;
	}

	public void setSallary(double sallary) {
		this.sallary = sallary;
	}
	
	
}
