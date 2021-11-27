package Week3.AssignmentsWeek3.Arrays.Array2D;

import java.util.Scanner;

public class Nov26SparseMatrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		int non=0;
		int z =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
				if(a[i][j]==0) {
					z++;
				}
				else {
					non++;
				}
			}
		}
		if(z>non)
			System.out.println("Sparse matrix");
		else
			System.out.println("Not a sparse matrix");

	}

}
