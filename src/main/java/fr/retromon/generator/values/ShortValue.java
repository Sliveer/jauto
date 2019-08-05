package fr.retromon.generator.values;

/**
 *
 * @author theo
 */
public enum ShortValue implements Representable {
	BASIC("(short) 5"),
	ZERO("(short) 0"),
	NEGATIVE("(short) -1"),
	ONE("(short) 1"),
	BIG("Short.MAX_VALUE"),
	SMALL("Short.MIN_VALUE");

	private final String representation;

	private ShortValue(String representation) {
		this.representation = representation;
	}

	@Override
	public String getRepresentation() {
		return representation;
	}

}
