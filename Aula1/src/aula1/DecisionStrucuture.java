package aula1;

import java.util.Scanner;

public class DecisionStrucuture {
	public static void main(String[] args) {
		int n1, n2;
		Scanner entry = new Scanner(System.in);
		System.out.println("type an integer: ");

		n1 = entry.nextInt();

		System.out.println("type another integer: ");

		n2 = entry.nextInt();

		entry.close();

		if (n1 > n2) {
			System.out.println(n1 + " bigger than " + n2);
		} else {
			if (n2 > n1) {
				System.out.println(n2 + " bigger than " + n1);
			} else {
				System.out.println("both numbers are equal ");
			}
		}

	}
}
