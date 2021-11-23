package Week3.AssignmentsWeek3.Arrays;

import java.util.Scanner;

public class Nov22ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int sum =0;
		for(int i=0;i<10;i++) {
			System.out.print("Enter the number: ");
			a[i]=sc.nextInt();
			sum += a[i];
			
		}
		System.out.println("Sum of elements of the array is "+sum);

	}

}
