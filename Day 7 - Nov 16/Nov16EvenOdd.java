package Assignments;

import java.util.Scanner;

public class Nov16EvenOdd {
	void eo(int n) {
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}

	public static void main(String[] args) {
		Nov16EvenOdd ob = new Nov16EvenOdd();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ob.eo(n);
		
		

	}

}
