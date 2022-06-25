package MetodosDomain;

public class Employee {
	private String name;
	private int age;
	private double[] sallary;
	private double average =0;
	
	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double[] getSallary() {
		return sallary;
	}

	public void setSallary(double[] sallary) {
		this.sallary = sallary;
	}

	public double getAverage() {
		return average;
	}

	public void employConstruct() {
		System.out.println("------------");
		System.out.println(this.name);
		System.out.println(this.age);
		if(sallary != null) {
			for (double i : sallary) {
				System.out.print(i + " ");
			};
		}
		System.out.println("");
		sallaryAvr();
	}
	
	public void sallaryAvr() {
		if(sallary == null) {
			return;
		}
		
		for(double i: sallary) {
			average += i;
		}
		average /= sallary.length;
		
		System.out.println("Your sallary average is: "+ average);
		
	}
	
	
}
