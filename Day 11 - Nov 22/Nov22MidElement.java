package Week3.AssignmentsWeek3.Arrays;

import java.util.Scanner;

public class Nov22MidElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		for(int i=0;i<10;i++) {
			System.out.print("Enter the number: ");
			a[i]=sc.nextInt();	
		}
		
		System.out.println("Middle elements of the array are "+a[4]+","+a[5]);

	}

}
