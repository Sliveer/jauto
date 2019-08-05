package fr.retromon.generator.values;

/**
 *
 * @author theo
 */
public enum BooleanValue implements Representable {
	TRUE("true"),
	FALSE("false");

	private final String representation;

	private BooleanValue(String representation) {
		this.representation = representation;
	}

	@Override
	public String getRepresentation() {
		return representation;
	}
}
