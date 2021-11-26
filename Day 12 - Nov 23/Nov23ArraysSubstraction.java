package Week3.AssignmentsWeek3.Arrays;

import java.util.Scanner;

public class Nov23ArraysSubstraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a  = new int[n];
		int[] b =new int[n];
		int[] r =new int[n];
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i] =sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			r[i] = a[i]-b[i];
			System.out.print(r[i]+" ");
		}
	}

}
