package javaExercices.trianglesketch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javaExercices.trianglesketch.TriangleSketch;
import javaExercices.trianglesketch.exception.TriangleSketchException;

class TriangleSketchTest {

	private static TriangleSketch triangle;

	@Test
	public void noTriangleSketch() {
		try {
			triangle = new TriangleSketch();
			assertEquals("", triangle.draw(0), "no lines sketched");
		} catch (TriangleSketchException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void oneLineSketched() {
		try {
			triangle = new TriangleSketch();
			StringBuilder expected = new StringBuilder("");
			expected.append("*\n");
			assertEquals(expected.toString(), triangle.draw(1), "one line sketched");
		} catch (TriangleSketchException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void wrongArgumentWhenMinus1() {
		try {
			triangle = new TriangleSketch();
			triangle.draw(-1);
			fail("should throw an exception when passing negative argument");
		} catch (TriangleSketchException e) {
			assertEquals("argument height must be greater or equal to 0", e.getMessage());
		}
	}

	@Test
	public void wrongArgumentWhenMinus10() {
		try {
			triangle = new TriangleSketch();
			triangle.draw(-10);
			fail("should throw an exception when passing negative argument");
		} catch (TriangleSketchException e) {
			assertEquals("argument height must be greater or equal to 0", e.getMessage());
		}
	}

	@Test
	public void twoLinesSketched() {
		try {
			triangle = new TriangleSketch();
			StringBuilder expected = new StringBuilder("");
			expected.append(" * \n");
			expected.append("***\n");
			assertEquals(expected.toString(), triangle.draw(2), "one line sketched");
		} catch (TriangleSketchException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void threeLinesSketched() {
		try {
			triangle = new TriangleSketch();
			StringBuilder expected = new StringBuilder("");
			expected.append("  *  \n");
			expected.append(" *** \n");
			expected.append("*****\n");
			assertEquals(expected.toString(), triangle.draw(3), "one line sketched");
		} catch (TriangleSketchException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fourLinesSketched() {
		try {
			triangle = new TriangleSketch();
			StringBuilder expected = new StringBuilder("");
			expected.append("   *   \n");
			expected.append("  ***  \n");
			expected.append(" ***** \n");
			expected.append("*******\n");
			assertEquals(expected.toString(), triangle.draw(4), "one line sketched");
		} catch (TriangleSketchException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fourLinesSketchedWithSymbolO() {
		try {
			triangle = new TriangleSketch('o');
			StringBuilder expected = new StringBuilder();
			expected.append("   o   \n");
			expected.append("  ooo  \n");
			expected.append(" ooooo \n");
			expected.append("ooooooo\n");
			assertEquals(expected.toString(), triangle.draw(4), "one line sketched");
		} catch (TriangleSketchException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fourLinesSketchedWithSymbolOAndBackgroundline() {
		try {
			triangle = new TriangleSketch('o', '-');
			StringBuilder expected = new StringBuilder();
			expected.append("---o---\n");
			expected.append("--ooo--\n");
			expected.append("-ooooo-\n");
			expected.append("ooooooo\n");
			assertEquals(expected.toString(), triangle.draw(4), "one line sketched");
		} catch (TriangleSketchException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fourLinesSketchedWithSymbolOAndBackgroundlineAndLinebreakHTML() {
		try {
			triangle = new TriangleSketch('o', '-', "<br/>");
			StringBuilder expected = new StringBuilder();
			expected.append("---o---<br/>");
			expected.append("--ooo--<br/>");
			expected.append("-ooooo-<br/>");
			expected.append("ooooooo<br/>");
			assertEquals(expected.toString(), triangle.draw(4), "one line sketched");
		} catch (TriangleSketchException e) {
			e.printStackTrace();
		}
	}
}
