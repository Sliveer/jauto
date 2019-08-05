package fr.retromon.generator.values;

/**
 *
 * @author theo
 */
public enum CharValue implements Representable {
	BASIC("'a'"),
	SPACE("' '"),
	NUMERIC("'1'"),
	NUL_CHAR("'\u0000'"),
	SPECIAL("'¤'"),
	BACKSLASH("'\\'"),
	LINE_FEED("'\n'");

	private final String representation;

	private CharValue(String representation) {
		this.representation = representation;
	}

	@Override
	public String getRepresentation() {
		return representation;
	}

}
