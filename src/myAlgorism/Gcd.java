package myAlgorism;

public class Gcd {
	static int GCD(int x, int y) {
		if (y == 0)
			return x;
		else if (x == 0)
			return y;
		else
			if (x > y)
				return GCD(y, x % y);
			else
				return GCD(x, y % x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCD(14, 24));
	}

}
