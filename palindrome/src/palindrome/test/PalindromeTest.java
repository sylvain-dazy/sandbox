package palindrome.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import palindrome.Palindrome;

class PalindromeTest {

	private static Palindrome p;
	
	@BeforeAll
	private static void init() {
		p = new Palindrome();
	}
	
	@Test
	public void emptyStringShouldBeTrue() {
		assertTrue(p.isPalindrome(""));
	}
	
	@Test
	public void oneCharIsAPalindrome() {
		assertTrue(p.isPalindrome("a"));
	}
	
	@Test
	public void oneDigitIsAPalindrome() {
		assertTrue(p.isPalindrome("1"));
	}
	
	@Test
	public void aaIsAPalindrome() {
		assertTrue(p.isPalindrome("aa"));
	}
	
	@Test
	public void bBIsAPalindrome() {
		assertTrue(p.isPalindrome("bB"));
	}
	
	@Test
	public void c1IsNotAPalindrome() {
		assertFalse(p.isPalindrome("c1"));
	}
	
	@Test
	public void deIsNotAPalindrome() {
		assertFalse(p.isPalindrome("de"));
	}
	
	@Test
	public void f9fIsAPalindrome() {
		assertTrue(p.isPalindrome("f9f"));
	}
	
	@Test
	public void defIsNotAPalindrome() {
		assertFalse(p.isPalindrome("def"));
	}
	
	@Test
	public void a99AIsAPalindrome() {
		assertTrue(p.isPalindrome("a99A"));
	}
	
	@Test
	public void BdfbIsNotAPalindrome() {
		assertFalse(p.isPalindrome("Bdfb"));
	}
	
	@Test
	public void azertIsNotAPalindrome() {
		assertFalse(p.isPalindrome("azert"));
	}
	
	@Test
	public void abcbaIsAPalindrome() {
		assertTrue(p.isPalindrome("abcba"));
	}
}
