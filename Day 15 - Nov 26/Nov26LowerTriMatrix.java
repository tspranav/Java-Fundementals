package Week3.AssignmentsWeek3.Arrays.Array2D;

import java.util.Scanner;

public class Nov26LowerTriMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++ ) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++ ) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
