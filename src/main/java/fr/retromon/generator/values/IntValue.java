package fr.retromon.generator.values;

/**
 *
 * @author theo
 */
public enum IntValue implements Representable {
	BASIC("5"),
	ZERO("0"),
	NEGATIVE("-1"),
	ONE("1"),
	BIG("Integer.MAX_VALUE"),
	SMALL("Integer.MIN_VALUE");

	private final String representation;

	private IntValue(String representation) {
		this.representation = representation;
	}

	@Override
	public String getRepresentation() {
		return representation;
	}
}
