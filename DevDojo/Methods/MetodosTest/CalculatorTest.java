package MetodosTest;

import MetodosDomain.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		
		double num1 = 10, num2 = 3;
		int[] nums = {1,25,3,40,5,6};
		
		Calculator calculator = new Calculator();
		
		calculator.sum(num1, num2);
		
		calculator.subtract(30, 5);
		
		System.out.println(calculator.divide(30, 2));
		
		calculator.changeNumbers((int) num1, (int) num2);
		System.out.println("Outside the method");
		System.out.println((int) num1 + " " +(int) num2);
		System.out.println("--------------------");
		
		calculator.sumArray(nums);
		System.out.println("--------------------");
		calculator.sumVarArgs(1,2,3,4,5,78);
	}
}
