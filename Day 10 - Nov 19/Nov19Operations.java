package Assignments;

import java.util.Scanner;

public class Nov19Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = sc.nextInt();
		System.out.println("Enter an operator aamong ( + - * / ): ");
		char c = sc.next().charAt(0);
		if(c == '+') {
			System.out.println(n1+n2);
		}
		else if(c == '-') {
			System.out.println(n1-n2);
		}
		else if(c == '*') {
			System.out.println(n1*n2);
		}
		else if(c == '/') {
			System.out.println(n1/n2);
		}

	}

}
