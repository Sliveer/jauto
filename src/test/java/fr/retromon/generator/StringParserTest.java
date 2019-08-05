/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.retromon.generator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author theo
 */
public class StringParserTest {

	StringParser instance = new StringParser();

	@Test
	public void testCleanedStringArrayWhenArrayIsAlreadyCleanThenReturnTheSameArray() {

		String[] input = {"I", "do", "not", "contain", "empty", "strings", "."};
		String[] expected = {"I", "do", "not", "contain", "empty", "strings", "."};

		String[] result = instance.cleanedStringArray(input);

		assertArrayEquals(expected, result);

	}

	@Test
	public void testCleanedStringArrayWhenArrayIsEmptyThenReturnTheSameArray() {

		String[] input = {};
		String[] expected = {};

		String[] result = instance.cleanedStringArray(input);

		assertArrayEquals(expected, result);

	}

	@Test
	public void testCleanedStringArrayWhenArrayIsNullThenReturnNull() {

		String[] input = null;
		String[] expected = null;

		String[] result = instance.cleanedStringArray(input);

		assertArrayEquals(expected, result);

	}

	@Test
	public void testCleanedStringArrayWhenArrayContainsEmptyStringsThenReturnTheSameArrayWithoutEmptyStrings() {

		String[] input = {"I", "", "do", "", "contain", "", "empty", "", "strings"};
		String[] expected = {"I", "do", "contain", "empty", "strings"};

		String[] result = instance.cleanedStringArray(input);

		assertArrayEquals(expected, result);

	}

	@Test
	public void testCleanedStringArrayWhenArrayContainsOnlyEmptyStringsThenReturnEmptyArray() {

		String[] input = {"", "", ""};
		String[] expected = {};

		String[] result = instance.cleanedStringArray(input);

		assertArrayEquals(expected, result);

	}

	@Test
	public void testCleanedStringArrayWhenArrayContainsNullStringsThenSameArrayWithoutNullStrings() {

		String[] input = {"I", "contain", null, "string"};
		String[] expected = {"I", "contain", "string"};

		String[] result = instance.cleanedStringArray(input);

		assertArrayEquals(expected, result);

	}

	@Test
	public void testSubstringBetweenTagsWhenInputStringNullThenReturnNull() {

		String input = null;
		String expected = null;

		String result = instance.substringBetweenTags(input, null, null);

		assertEquals(expected, result);

	}

	@Test
	public void testComputeTestPackageWhenPackageGivenThenReturnCorrespondingTestPackage() throws StringParsingException {

		String input = "src/main/java/fr/retromon/dummy/Dummy.java";
		String expected = "src/test/java/fr/retromon/dummy/Dummy.java";

		String result = instance.computeTestPackage(input);

		assertEquals(expected, result);

	}

	@Test(expected = StringParsingException.class)
	public void testComputeTestPackageWhenInputEmptyThenThrowStringParsingException() throws StringParsingException {

		String input = "";
		instance.computeTestPackage(input);

	}

	@Test(expected = StringParsingException.class)
	public void testComputeTestPackageWhenInputNullThenThrowStringParsingException() throws StringParsingException {

		String input = null;
		instance.computeTestPackage(input);

	}

	@Test(expected = StringParsingException.class)
	public void testComputeTestPackageWhenInputNumericOnlyThenThrowStringParsingException() throws StringParsingException {

		String input = "123";
		instance.computeTestPackage(input);

	}

	@Test(expected = StringParsingException.class)
	public void testComputeTestPackageWhenInputContainsNullCharThenThrowStringParsingException() throws StringParsingException {

		String input = "\"a\u0000z\"";
		instance.computeTestPackage(input);

	}

	@Test(expected = StringParsingException.class)
	public void testComputeTestPackageWhenInputLongAndInvalidThenThrowStringParsingException() throws StringParsingException {

		String input = "\"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
			+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
			+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
			+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
			+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
			+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
			+ "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz\"";
		instance.computeTestPackage(input);

	}

}
