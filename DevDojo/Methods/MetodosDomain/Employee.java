package MetodosDomain;

public class Employee {
	public String name;
	public int age;
	public double[] sallary;
	
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
		
		double average = 0;
		
		for(double i: sallary) {
			average += i;
		}
		average /= sallary.length;
		
		System.out.println("Your sallary average is: "+ average);
		
	}
}
