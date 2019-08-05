package fr.retromon.generator.values;

/**
 *
 * @author theo
 */
public enum DoubleValue implements Representable {
	BASIC("5.1"),
	ZERO("0"),
	NEGATIVE("-1.1"),
	ONE("1"),
	BIG("Double.MAX_VALUE"),
	SMALL("Double.MIN_VALUE");

	private final String representation;

	private DoubleValue(String representation) {
		this.representation = representation;
	}

	@Override
	public String getRepresentation() {
		return representation;
	}

}
