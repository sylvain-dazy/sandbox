package fizzbuzz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fizzbuzz.FizzBuzz;

class FizzBuzzTest {

	private static FizzBuzz fizzBuzz;
	@BeforeAll
	public static void init() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void shouldBeEmptyIfSecondNumberIsLesserThanFirstOne() {
		assertEquals("", fizzBuzz.generate(1, 0));
	}
	
	@Test
	public void shouldBe1If1To1() {
		assertEquals("1", fizzBuzz.generate(1, 1));
	}

	@Test
	public void shouldBe2If2To2() {
		assertEquals("2", fizzBuzz.generate(2, 2));
	}
	
	@Test
	public void shouldBeFizzIf3To3() {
		assertEquals("fizz", fizzBuzz.generate(3, 3));
	}
	
	@Test
	public void shouldBeBuzzIf5To5() {
		assertEquals("buzz", fizzBuzz.generate(5, 5));
	}
	
	@Test
	public void shouldBeFizzIf6To6() {
		assertEquals("fizz", fizzBuzz.generate(6, 6));
	}
	
	@Test
	public void shouldBeBuzzIf10To10() {
		assertEquals("buzz", fizzBuzz.generate(10, 10));
	}
	
	@Test
	public void shouldBeFizzBuzzIf15To15() {
		assertEquals("fizzbuzz", fizzBuzz.generate(15, 15));
	}
	
	@Test
	public void shouldBeFizzbuzzIf30To30() {
		assertEquals("fizzbuzz", fizzBuzz.generate(30, 30));
	}
	
	@Test
	public void shouldBe12If1To2() {
		assertEquals("1 | 2", fizzBuzz.generate(1, 2));
	}
	
	@Test
	public void shouldBe12fizzIf1To3() {
		assertEquals("1 | 2 | fizz", fizzBuzz.generate(1, 3));
	}
	
	@Test
	public void completeTest() {

		StringBuilder expected = new StringBuilder();
		
		expected.append("1 | 2 | fizz | 4 | buzz | fizz | 7 | 8 | ");
		expected.append("fizz | buzz | 11 | fizz | 13 | 14 | fizzbuzz | ");
		expected.append("16 | 17 | fizz | 19 | buzz | fizz | 22 | 23 | ");
		expected.append("fizz | buzz | 26 | fizz | 28 | 29 | fizzbuzz");
		
		assertEquals(expected.toString(), fizzBuzz.generate(1, 30));
	}
}
