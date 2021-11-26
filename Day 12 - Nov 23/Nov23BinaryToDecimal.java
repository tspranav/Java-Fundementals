  package Week3.AssignmentsWeek3;

import java.util.Scanner;

public class Nov23BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		int n =sc.nextInt();
		int b =1;
		int temp =n;
		int d=0;
		while(temp>0) {
			int l = temp%10;
			d += l*b;
			temp= temp/10;
			b = b*2;
		}
		System.out.println("Decimal number is "+d);
		

	}

}
