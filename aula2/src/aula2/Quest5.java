package aula2;

import java.util.Scanner;

public class Quest5 {
	public static void main(String[] args) {
		int number;
	
		Scanner entry = new Scanner(System.in);
		System.out.println("Digite o numero:");
		number = entry.nextInt();
		
		entry.close();
		
		System.out.println(ePar(number));
		
	}
	
	public static boolean ePar(int n) {
		
		if (n%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
}
