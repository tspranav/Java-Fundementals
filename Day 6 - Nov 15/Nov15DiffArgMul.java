package Assignments;

public class Nov15DiffArgMul {

	int mul(int a, int b) {
		int p =a*b;
		return p;
	}
	float mul(float a, float b) {
		float p =a*b;
		return p;
	}
	double mul(double a, double b) {
		double p =a*b;
		return p;
	}

	public static void main(String[] args) {
		Nov15DiffArgMul ob = new Nov15DiffArgMul();

		System.out.println(ob.mul(3, 2));
		System.out.println(ob.mul(6.1f, 3.9f));
		System.out.println(ob.mul(5.1, 3.2));
		

	}

}
