package Patterns;

import java.util.Scanner;

public class Nov12RPNumP1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i =0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print((i+1)+" ");
			}
			System.out.println();
	}

}
}
