package fr.retromon.generator;

import java.util.Arrays;

/**
 *
 * @author theo
 */
public class StringParser {

	public String[] cleanedStringArray(String[] array) {

		return array == null
			? null
			: Arrays
				.stream(array)
				.filter(string -> string != null && !string.isEmpty())
				.toArray(size -> new String[size]);

	}
	
	public String substringBetweenTags(String input, String begining, String end) {
		
		return null;
		
	}

	public String computeTestPackage(String input) throws StringParsingException {
		
		if (input == null) {
			throw new StringParsingException("Input package cannot be null");
		}
		if (! input.contains("src/main/")) {
			throw new StringParsingException("Expected package starting with 'src/main' but got " + input);
		}
		return input.replaceFirst("src/main/", "src/test/");
	
	}

}
