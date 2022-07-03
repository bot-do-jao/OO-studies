package Domain;

public class Developer extends Employee{

	public Developer(String name, double sallary) {
		super(name, sallary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", sallary=" + sallary + "]";
	}

	@Override
	public void CalculateBonus() {
		// TODO Auto-generated method stub
		this.sallary *= 1.05;
	}

	
	
}
