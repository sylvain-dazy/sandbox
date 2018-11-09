package javaExercices.trianglesketch;

import javaExercices.trianglesketch.exception.TriangleSketchException;

public class TriangleSketch {

	// properties

	private char triangleSymbol;
	private char background;
	private String lineBreak;

	// Constructors

	public TriangleSketch() {
		triangleSymbol = '*';
		background = ' ';
		lineBreak = "\n";
	}

	public TriangleSketch(char symbol) {
		this();
		this.triangleSymbol = symbol;
	}

	public TriangleSketch(char symbol, char background) {
		this(symbol);
		this.background = background;
	}

	public TriangleSketch(char symbol, char background, String lineBreak) {
		this(symbol, background);
		this.lineBreak = lineBreak;
	}

	// public method(s)

	public String draw(final int height) throws TriangleSketchException {

		if (height < 0) {
			throw new TriangleSketchException("argument height must be greater or equal to 0");
		}

		StringBuilder result = new StringBuilder("");

		final int lineLenght = 2 * height - 1;

		for (int line = 1; line <= height; line++) {

			final int numberOfSymbols = 2 * line - 1;
			final int numberOfBackgrounds = (lineLenght - numberOfSymbols) / 2;

			result.append(drawSymboles(numberOfBackgrounds, background));
			result.append(drawSymboles(numberOfSymbols, triangleSymbol));
			result.append(drawSymboles(numberOfBackgrounds, background));

			result.append(lineBreak);
		}

		return result.toString();
	}

	// private method(s)

	private String drawSymboles(final int numberOfSimbols, final char symbol) {

		StringBuilder symbols = new StringBuilder("");

		for (int i = 0; i < numberOfSimbols; i++) {
			symbols.append(symbol);
		}

		return symbols.toString();
	}

}
