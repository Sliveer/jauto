package fr.retromon.generator.values; 

/**
 *
 * @author theo
 */
public enum ByteValue implements Representable {
	BASIC("(byte) 5"),
	ZERO("(byte) 0"),
	NEGATIVE("(byte) -1"),
	ONE("(byte) 1"),
	BIG("Byte.MAX_VALUE"),
	SMALL("Byte.MIN_VALUE");

	private final String representation;

	private ByteValue(String representation) {
		this.representation = representation;
	}

	@Override
	public String getRepresentation() {
		return representation;
	}

}
