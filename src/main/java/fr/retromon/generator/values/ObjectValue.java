package fr.retromon.generator.values;

/**
 *
 * @author theo
 */
public enum ObjectValue implements Representable {
	NULL("null");

	private final String representation;

	private ObjectValue(String representation) {
		this.representation = representation;
	}

	@Override
	public String getRepresentation() {
		return representation;
	}
}
