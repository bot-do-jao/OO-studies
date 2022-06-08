package aula2;

import java.util.Scanner;

public class Quest {
	public static void main (String[] args) {
			
			int number;
			int sum = 0;
			
			Scanner math = new Scanner(System.in);
			
			do{
				number = math.nextInt();
				if (number>0) {
					sum = sum + number;
				}
				
				System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
				
				}while(number >= 0);
			
			math.close();
			
			System.out.println("A soma é: "+ sum);
		
}
}
