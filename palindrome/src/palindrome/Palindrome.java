package palindrome;

public class Palindrome {

	public boolean isPalindrome(final String word) {

		String wordInLowerCase = word.toLowerCase();

		final int last = wordInLowerCase.length() - 1;

		for (int i = 0; i <= last; i++) {

			char charAtPositionI = wordInLowerCase.charAt(i);
			char charAtMirrorPosition = wordInLowerCase.charAt(last - i);

			if (charAtPositionI != charAtMirrorPosition) {
				return false;
			}
		}

		return true;
	}
}
