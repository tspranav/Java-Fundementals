package Assignments;

import java.util.Scanner;

public class Nov15Mul2Int {
	int mul(int a,int b) {
		int p = a*b;
		return p;
	}

	public static void main(String[] args) {
		
		Nov15Mul2Int  ob = new Nov15Mul2Int ();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int a = sc.nextInt();
		System.out.println("Enter second integer: ");
		int b = sc.nextInt();
		
		int result = ob.mul(a, b);
		System.out.println("Product is "+result);

	}

}
