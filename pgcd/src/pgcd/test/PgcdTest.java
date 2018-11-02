package pgcd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pgcd.Pgcd;

class PgcdTest {

	@Test
	public void pgcd1And1Is1() {
		assertEquals(1, Pgcd.computePgcd(1, 1));
	}
	
	@Test
	public void pgcd2And2Is2() {
		assertEquals(2, Pgcd.computePgcd(2, 2));
	}
	
	@Test
	public void pgcd3And9Is3() {
		assertEquals(3, Pgcd.computePgcd(3, 9));
	}
	
	@Test
	public void pgcd16And4Is4() {
		assertEquals(4, Pgcd.computePgcd(16, 4));
	}
	
	@Test
	public void pgcd2And3Is1() {
		assertEquals(1, Pgcd.computePgcd(2, 3));
	}
	
	@Test
	public void pgcd3And2Is1() {
		assertEquals(1, Pgcd.computePgcd(3, 2));
	}
	
	@Test
	public void pgcd12And15Is3() {
		assertEquals(3, Pgcd.computePgcd(12,  15));
	}
	
	@Test
	public void pgcd10And15Is5() {
		assertEquals(5, Pgcd.computePgcd(10, 15));
	}
	
	@Test
	public void pgcd9And12Is3() {
		assertEquals(3, Pgcd.computePgcd(9, 12));
	}
	
	@Test
	public void pgcd9And21Is3() {
		assertEquals(3, Pgcd.computePgcd(9, 21));
	}
	
	@Test
	public void pgcd21And9Is3() {
		assertEquals(3, Pgcd.computePgcd(21, 9));
	}

	@Test
	public void pgcd7And5Is1() {
		assertEquals(1, Pgcd.computePgcd(7, 5));
	}
	
	@Test
	public void pgcd32And72Is8() {
		assertEquals(8, Pgcd.computePgcd(32, 72));
	}
	
	@Test
	public void pgcdBigCase() {
		final int prime = 53;
		final int a = prime * 7;
		final int b = prime * 11;
		
		assertEquals(53, Pgcd.computePgcd(a, b));
	}
}
