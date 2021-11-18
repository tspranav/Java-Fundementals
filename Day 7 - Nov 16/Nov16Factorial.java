package Assignments;

import java.util.Scanner;

public class Nov16Factorial {
	void fact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n =sc.nextInt();
		int fact =1;
		
		do {
			fact *= n;
			n--;
			
		}while(n>0);
		System.out.println(fact);

		
	}
	public static void main(String[] args) {
		Nov16Factorial ob = new Nov16Factorial();
	String k;
	do {
		ob.fact();
		Scanner sc = new Scanner(System.in);
		System.out.println("Want to run again Yes/No");
		k =sc.next();
	} while(k.equals("Yes"));

	}

}
