package aula2;

import java.util.Arrays;
import java.util.Scanner;

public class Quest6 {
	public static void main(String[] args) {
		int n1, n2, n3, n4, n5;
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		
				n1 = entry.nextInt();
		
		System.out.println("Entre com o segundo numero:");
				
				n2 = entry.nextInt();
				
		System.out.println("Entre com o terceiro numero:");
				
				n3 = entry.nextInt();
				
		System.out.println("Entre com o quarto numero:");
				
				n4 = entry.nextInt();
				
		System.out.println("Entre com o quinto numero:");
				
				n5 = entry.nextInt();
		
		System.out.println(maiorNumero(n1,n2,n3,n4,n5));
		
		
	}
	
	public static int maiorNumero (int n1, int n2, int n3, int n4, int n5) {
		int[] sorter = {n1, n2, n3, n4, n5};
		Arrays.sort(sorter);
		return sorter[4];
	}
}
