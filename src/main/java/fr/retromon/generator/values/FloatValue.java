package fr.retromon.generator.values; 

/**
 *
 * @author theo
 */
public enum FloatValue implements Representable {
	BASIC("5.1f"),
	ZERO("0"),
	NEGATIVE("-1.1f"),
	ONE("1"),
	BIG("Float.MAX_VALUE"),
	SMALL("Float.MIN_VALUE");

	private final String representation;

	private FloatValue(String representation) {
		this.representation = representation;
	}

	@Override
	public String getRepresentation() {
		return representation;
	}

}
