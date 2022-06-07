package aula1;

import java.util.Scanner;

public class Sequence {
	public static void main (String[] args) {
		double n1, n2, n3;
		Scanner entry = new Scanner(System.in);
		System.out.println("Write the first height:");
		n1 = entry.nextDouble();
		System.out.println("Write the second height:");
		n2 = entry.nextDouble();
		System.out.println("Write the third height: ");
		n3 = entry.nextDouble();
		
		System.out.println("The heights are: " + n1 + ", "+ n2 + " and "+ n3);
		
		double sum, average;
		int quantity = 3;
		sum = n1 + n2 + n3;
		average = sum/quantity;
		
		System.out.println("The average height is: " + average );
	}
}
