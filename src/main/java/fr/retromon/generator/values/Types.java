package fr.retromon.generator.values;

/**
 *
 * @author theo
 */
public enum Types {
	
	BOOLEAN(BooleanValue.class, "boolean"),
	BYTE(ByteValue.class, "byte"),
	CHAR(CharValue.class, "char"),
	DOUBLE(DoubleValue.class, "double"),
	FLOAT(FloatValue.class, "float"),
	INT(IntValue.class, "int"),
	LONG(LongValue.class, "long"),
	OBJECT(ObjectValue.class, "*"),
	SHORT(ShortValue.class, "short"),
	STRING(StringValue.class, "String");
	
	private final Class classObject;
	private final String identifier;

	private Types(Class classObject, String identifier) {
		this.classObject = classObject;
		this.identifier = identifier;
	}
	
	public Class getClassObject() {
		return this.classObject;
	}

	public String getIdentifier() {
		return identifier;
	}

}
