package fr.retromon.generator.values; 

/**
 *
 * @author theo
 */
public enum LongValue implements Representable {
	BASIC("5"),
	ZERO("0"),
	NEGATIVE("-1"),
	ONE("1"),
	BIG("Long.MAX_VALUE"),
	SMALL("Long.MIN_VALUE");

	private final String representation;

	private LongValue(String representation) {
		this.representation = representation;
	}

	@Override
	public String getRepresentation() {
		return representation;
	}

}
