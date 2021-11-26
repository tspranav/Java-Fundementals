package Week3.AssignmentsWeek3.Strings;

import java.util.Scanner;

public class Nov24Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		String r="";
		for(int i = c.length-1;i>=0;i--) {
			r+=c[i];
		}
		if(r.equals(s)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");

	}

}
