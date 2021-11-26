package Week3.AssignmentsWeek3.Strings;

import java.util.Scanner;

public class Nov24Capitalise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String r ="";
		char[] c = s.toCharArray();
		char f = Character.toUpperCase(s.charAt(0));
		r = r+f;
		for(int i =1;i<c.length;i++) {
			char k = c[i];
			if(c[i-1]==' ') {
				k = Character.toUpperCase(k);
				}
			r +=k;
			}
		System.out.println(r);
		

	}

}
