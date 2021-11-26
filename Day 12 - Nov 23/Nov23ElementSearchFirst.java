package Week3.AssignmentsWeek3.Arrays;

import java.util.Scanner;

public class Nov23ElementSearchFirst {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = {12,13,14,15,18,12,15};
		boolean is_found = false;
		int index = -1;
		System.out.println("Enter the number to search in the array: ");
		int d = sc.nextInt();
		for(int i =0;i<a.length;i++){
			if(a[i]==d) {
				is_found = true;
				index =i;
				break;
				}
			}	
		System.out.println(is_found);
		System.out.println(index);

	}

}
