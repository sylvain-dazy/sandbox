package fibonacci.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fibonacci.Fibonacci;

class FibonacciTest {

	@Test
	void fibMinus2IsEmpty() {
		assertEquals("", Fibonacci.fibonacci(-2));
	}

	@Test
	void fibMinus1IsEmpty() {
		assertEquals("", Fibonacci.fibonacci(-1));
	}
	
	@Test
	void fib0IsEmpty() {
		assertEquals("", Fibonacci.fibonacci(0));
	}

	@Test
	void fib1Is1() {
		assertEquals("1", Fibonacci.fibonacci(1));
	}
	
	@Test
	void fib2Is11() {
		assertEquals("1 1", Fibonacci.fibonacci(2));
	}
	
	@Test
	void fib3Is112() {
		assertEquals("1 1 2", Fibonacci.fibonacci(3));
	}
	
	@Test
	void fib4Is1123() {
		assertEquals("1 1 2 3", Fibonacci.fibonacci(4));
	}
	
	@Test
	void fib5Is11235() {
		assertEquals("1 1 2 3 5", Fibonacci.fibonacci(5));
	}
	
	@Test
	void fib6Is112358() {
		assertEquals("1 1 2 3 5 8", Fibonacci.fibonacci(6));
	}

	@Test
	void fib7Is11235813() {
		assertEquals("1 1 2 3 5 8 13", Fibonacci.fibonacci(7));
	}
	
	@Test
	void fib8Is1123581321() {
		assertEquals("1 1 2 3 5 8 13 21", Fibonacci.fibonacci(8));
	}
}
