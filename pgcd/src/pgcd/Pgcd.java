package pgcd;

public class Pgcd {

	public static int computePgcd(int a, int b) {
		
		if (b < a) {
			return computePgcd(b, a);
		}
		
		if (b % a == 0) {
			return a;
		}

		return computePgcd(a, b - a);
	}

}
