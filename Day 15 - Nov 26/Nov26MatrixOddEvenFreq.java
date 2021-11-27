package Week3.AssignmentsWeek3.Arrays.Array2D;

import java.util.Scanner;

public class Nov26MatrixOddEvenFreq {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		int e=0;
		int o =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
				if(a[i][j]%2==0) {
					e++;
				}
				else {
					o++;
				}
			}
		}
		System.out.println("No. of even numbers in the matrix is: "+e);
		System.out.println("No. of odd numbers in the matrix is: "+o);

	}

}
