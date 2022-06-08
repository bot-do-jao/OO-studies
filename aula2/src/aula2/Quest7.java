package aula2;

import java.util.Scanner;

public class Quest7 {
	public static void main(String[] args) {
		char input;
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Digite o caracter a ser verificado:");
		
		input = entry.next().charAt(0);
		
		Boolean test = Character.isDigit(input);
		
		System.out.print(test);
	}
	
	
}
