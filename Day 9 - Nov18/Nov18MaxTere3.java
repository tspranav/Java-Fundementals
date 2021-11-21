package Assignments;

import java.util.Scanner;

public class Nov18MaxTere3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = sc.nextInt();
		System.out.println("Enter the third number: ");
		int n3 = sc.nextInt();
		int max;
		max = (n1>n2)?(n1>n3? n1:n3):(n2>n3? n2:n3);
		System.out.println(max);
		

	}

}
