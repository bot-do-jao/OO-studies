package MetodosDomain;

public class Calculator {
	
	
	
	public void sum(double x, double y) {
		
		System.out.println(x + y);
	}
	
	public void subtract (double x, double y) {
		
		System.out.println(x - y);
	}
	
	public double divide (double x, double y) {
		
		if(y == 0) {
			return 0;
		}
		
		return x/y;
	}
	
	public void changeNumbers(int x, int y) {
		x = 99;
		y = 33;
		
		System.out.println("Inside the method");
		System.out.println("x " + x);
		System.out.println("y " + y);
	}
	
	public void sumArray(int[] num) {
		int sum =0;
		
		for (int i : num) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	public void sumVarArgs(int... num) {
		int sum =0;
		
		for (int i : num) {
			sum += i;
		}
		System.out.println(sum);
	}
}
