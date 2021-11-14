package basic;

import java.util.Scanner;

public class Nov11WhileTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = sc.nextInt();
		int i =1;
		while(i<=10) {
			int prod = n*i;
			System.out.println(n+" * "+i+" = "+prod);
			i++;
		}

	}

}
