package javaExercices.trianglesketch;

import javaExercices.trianglesketch.exception.TriangleSketchException;

public class TriangleSketchApp {

	public static void main(String[] args) {

		TriangleSketch triangle = new TriangleSketch('*', ' ', "<br/>\n");

		try {
			System.out.println("Triangle sketch application:");
			System.out.println(triangle.draw(4));
			System.out.println();
		} catch (TriangleSketchException e) {
			e.printStackTrace();
		}
	}

}
