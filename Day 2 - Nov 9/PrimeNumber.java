package basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number: ");
		  int n = sc.nextInt();
		  int count =0;
		  if(n<2)
			  System.out.println("Not prime");
		  else if(n==2)
			  System.out.println("Prime");
		  
		  else {
			  for(int i=2;i<n;i++)
			  {
				  if(n%i ==0)
				  {
					  count++;
				  }
			  }
			  if (count==0)
				  System.out.println("Prime");
			  else
				  System.out.println("Not prime");
		  }
		  
	}

}
