package Week3.AssignmentsWeek3.Arrays.Array2D;

public class Nov25Array2DAddition {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = {{10,11,12},{13,14,15},{16,17,18}};   
		int[][] r = new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				r[i][j] = a[i][j] + b[i][j];
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}

	}

}
