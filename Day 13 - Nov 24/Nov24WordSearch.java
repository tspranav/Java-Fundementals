package Week3.AssignmentsWeek3.Strings;

import java.util.Scanner;

public class Nov24WordSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "The word will be searched in this string";
		String w = sc.next();
		System.out.println(s.contains(w));
	}

}
