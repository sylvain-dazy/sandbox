package fizzbuzz;

public class FizzBuzz {

	public String generate(Integer first, Integer last) {

		if (last < first) {
			return "";
		}

		StringBuilder result = new StringBuilder("");
		
		while (first < last) {

			result.append(transform(first++)).append(" | ");
		}

		return result.append(transform(last)).toString();
	}
	
	private String transform(Integer n) {

		if (n % 15 == 0) {
			return "fizzbuzz";
		}
		
		if (n % 5 == 0) {
			return "buzz";
		}
		
		if (n % 3 == 0) {
			return "fizz";
		}

		return n.toString();
	}

}
