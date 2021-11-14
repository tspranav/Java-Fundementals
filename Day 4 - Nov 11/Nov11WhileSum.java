package basic;

import java.util.Scanner;

public class Nov11WhileSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = sc.nextInt();
		int sum=0;
		while(n>0) {
			sum +=n;
			n--;
		}
		System.out.println(sum);

	}

}
