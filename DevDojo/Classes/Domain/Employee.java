package Domain;

public abstract class Employee {
	protected String name;
	protected double sallary;
	
	
	public Employee(String name, double sallary) {
		this.name = name;
		this.sallary = sallary;
		CalculateBonus();
	}
	
	public abstract void CalculateBonus();
	
}
