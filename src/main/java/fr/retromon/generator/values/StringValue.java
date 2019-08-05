package fr.retromon.generator.values;

/**
 *
 * @author theo
 */
public enum StringValue implements Representable {
	BASIC("\"foo\""),
	NULL("null"),
	EMPTY("\"\""),
	NUMERIC_ONLY("\"123\""),
	NUL_CHAR("\"a\u0000z\""),
	LONG_SEQUENCE("\"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
		+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
		+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
		+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
		+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
		+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
		+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz\"");

	private final String representation;

	private StringValue(String representation) {
		this.representation = representation;
	}

	@Override
	public String getRepresentation() {
		return representation;
	}

}
