package Assignments;

import java.util.Scanner;

public class Nov17Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s =n+"";
		int l = s.length();
		if(l<6) {
			System.out.println(l+" digits");
		}
		else {
			System.out.println("More than 5 digit");
		}

	}

}
