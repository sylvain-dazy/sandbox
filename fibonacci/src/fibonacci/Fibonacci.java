package fibonacci;

public class Fibonacci {

	public static String fibonacci(Integer n) {

		StringBuilder result = new StringBuilder("");

		int previous = 0;
		int previousPrevious = 0;
		int fibonacci = 1;

		for (int i = 1; i <= n; i++) {

			result.append(Integer.toString(fibonacci));

			if (i < n) {
				result.append(" ");
			}

			previousPrevious = previous;
			previous = fibonacci;
			fibonacci = previous + previousPrevious;
		}

		return result.toString();
	}

}
