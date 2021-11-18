package Assignments;

import java.util.Scanner;

public class Nov17Courses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b =sc.next();
		int y =sc.nextInt();
		if(y==1) {
			System.out.println("English, Math, Science");
		}
		else if(y==2)
		{
			if(b.equals("CSE"))
			{
				System.out.println("Operating System,Java,Data Structures");
			}
			else if(b.equals("ECE"))
			{
				System.out.println("Micro Processors, Logic switching theory");
			}
			else if(b.equals("MEC"))
			{
				System.out.println("Drawing, Manufacturing Machines");
			}
		}
		else if(y==3)
		{
			if(b.equals("CSE"))
			{
				System.out.println("Computer organisation, Multimedia");
			}
			else if(b.equals("ECE"))
			{
				System.out.println("Fundamentals of logic design, Micro electronics");
			}
			else if(b.equals("MEC"))
			{
				System.out.println("Internal combution engines, Mechanical Vibration");
			}
		}
		else if(y==4)
		{
			if(b.equals("CSE"))
			{
				System.out.println("Data communication and networks, Multimedia");
			}
			else if(b.equals("ECE"))
			{
				System.out.println("Embedded System, Image processing");
			}
			else if(b.equals("MEC"))
			{
				System.out.println("Production Technology, Thermal Engineering");
			}
		}

	}

}
