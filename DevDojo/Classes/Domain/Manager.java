package Domain;

public class Manager extends Employee {

	public Manager(String name, double sallary) {
		super(name, sallary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", sallary=" + sallary + "]";
	}

	@Override
	public void CalculateBonus() {
		this.sallary *= 1.2;
		
	}
	
	

}
