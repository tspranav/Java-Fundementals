package basic;

import java.util.Scanner;

public class Nov11Fibanocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int n1 =0,n2 =1;
		int n3;
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		
		for(int i=3;i<=n;i++) {
			n3 = n2+n1;
			System.out.print(n3+" ");
			n1 = n2;
			n2= n3;
			
		}

	}

}
