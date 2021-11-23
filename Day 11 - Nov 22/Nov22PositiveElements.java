package Week3.AssignmentsWeek3.Arrays;

import java.util.Scanner;

public class Nov22PositiveElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter the numbers of the array: ");

		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();	
		}
		for(int i=0;i<10;i++) {
			if(a[i]>0)
				System.out.print(a[i]+" ");
		}
		
		

	}

}
