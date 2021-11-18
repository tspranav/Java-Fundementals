package Assignments;

public class Nov15ArgMax {
	int max(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	int max(int a,int b,int c) {
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}
	public static void main(String[] args) {
		Nov15ArgMax ob = new Nov15ArgMax();
		System.out.println(ob.max(5, 8));
		System.out.println(ob.max(14,29,2));
		

	}

}
