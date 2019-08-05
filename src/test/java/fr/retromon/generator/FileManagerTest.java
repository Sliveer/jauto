package fr.retromon.generator;

import fr.retromon.generator.FileManager;
import java.io.File;
import java.io.OutputStream;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author theo
 */
public class FileManagerTest {

	private final ClassLoader classLoader = getClass().getClassLoader();

	@Test
	public void testIsAFileWhenGivenPathExistsThenReturnTrue() {
		File file = new File("src/test/resources/i_am_an_existing_file.txt");
		Assert.assertTrue(FileManager.isAFile(file));
	}

	@Test
	public void testIsAFileWhenGivenPathUsesDotsButExistsThenReturnTrue() {
		File file = new File("src/test/resources/../resources/i_am_an_existing_file.txt");
		Assert.assertTrue(FileManager.isAFile(file));
	}

	@Test
	public void testIsAFileWhenGivenPathStartsWithDotsButExistsThenReturnTrue() {
		File file = new File("./src/test/resources/i_am_an_existing_file.txt");
		Assert.assertTrue(FileManager.isAFile(file));
	}

	@Test
	public void testIsAFileWhenGivenPathDoesNotHaveAnExtensionButIsAFileThenReturnTrue() {
		File file = new File("src/test/resources/i_am_a_file_with_no_extension");
		Assert.assertTrue(FileManager.isAFile(file));
	}

	@Test
	public void testIsAFileWhenGivenPathDoesNotExistThenReturnFalse() {
		File file = new File("src/test/resources/i_am_a_non_existing_file.txt");
		Assert.assertFalse(FileManager.isAFile(file));
	}

	@Test
	public void testIsAFileWhenGivenPathIsADirectoryThenReturnFalse() {
		File file = new File("src/test/resources/i_am_a_directory");
		Assert.assertFalse(FileManager.isAFile(file));
	}

	@Test
	public void testIsAFileWhenGivenPathIsEmptyThenReturnFalse() {
		File file = new File("");
		Assert.assertFalse(FileManager.isAFile(file));
	}

	@Test
	public void testIsAFileWhenGivenPathIsNullThenReturnFalse() {
		File file = null;
		Assert.assertFalse(FileManager.isAFile(file));
	}

	@Test
	public void testIsADirectoryWhenGivenPathExistsThenReturnTrue() {
		File directory = new File("src/test/resources/i_am_an_existing_directory");
		Assert.assertTrue(FileManager.isADirectory(directory));
	}

	@Test
	public void testIsADirectoryWhenGivenPathUsesDotsButExistsThenReturnTrue() {
		File directory = new File("src/test/resources/../resources/i_am_an_existing_directory");
		Assert.assertTrue(FileManager.isADirectory(directory));
	}

	@Test
	public void testIsADirectoryWhenGivenPathStartsWithDotsButExistsThenReturnTrue() {
		File directory = new File("./src/test/resources/i_am_an_existing_directory");
		Assert.assertTrue(FileManager.isADirectory(directory));
	}

	@Test
	public void testIsADirectoryWhenGivenPathIsADirectoryContainingExtensionButExistsThenReturnTrue() {
		File directory = new File("src/test/resources/i_am_a_directory.with_an_extension");
		Assert.assertTrue(FileManager.isADirectory(directory));
	}

	@Test
	public void testIsADirectoryWhenGivenPathDoesNotExistThenReturnFalse() {
		File directory = new File("src/test/resources/i_am_a_non_existing_directory");
		Assert.assertFalse(FileManager.isADirectory(directory));
	}

	@Test
	public void testIsADirectoryWhenGivenPathIsAFileThenReturnFalse() {
		File directory = new File("src/test/resources/i_am_a_file.txt");
		Assert.assertFalse(FileManager.isADirectory(directory));
	}

	@Test
	public void testIsADirectoryWhenGivenPathIsEmptyThenReturnFalse() {
		File directory = new File("");
		Assert.assertFalse(FileManager.isADirectory(directory));
	}

	@Test
	public void testIsADirectoryWhenGivenPathIsNullThenReturnFalse() {
		File directory = null;
		Assert.assertFalse(FileManager.isADirectory(directory));
	}

	@Test
	public void testGetAsFileWhenGivenAValidPathThenReturnFileWithThePath() {
		File result = FileManager.getAsFile("foo");
		Assert.assertEquals("foo", result.getPath());
	}

	@Test
	public void testGetAsFileWhenGivenPathIsNullThenReturnFileWithEmptyPath() {
		File result = FileManager.getAsFile(null);
		Assert.assertEquals("", result.getPath());
	}

	@Test
	public void testGetPackageForWhenGivenPathExistsAndIsAClassInAPackageThenReturnPackage() {
		String path = "src/test/resources/src/main/java/fr/"
			+ "retromon/generator/Dummy.java";
		File javaClass = new File(path);
		String expected = "fr.retromon.generator";
		String result = FileManager.getPackageFor(javaClass);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testGetPackageForWhenGivenPathUsesDotsButExistsThenReturnPackage() {
		String path = "src/test/resources/src/main/java/fr/"
			+ "retromon/../retromon/generator/Dummy.java";
		File javaClass = new File(path);
		String expected = "fr.retromon.generator";
		String result = FileManager.getPackageFor(javaClass);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testGetPackageForWhenGivenPathStartsWithDotsButExistsThenReturnPackage() {
		String path = "./src/test/resources/src/main/java/fr/"
			+ "retromon/generator/Dummy.java";
		File javaClass = new File(path);
		String expected = "fr.retromon.generator";
		String result = FileManager.getPackageFor(javaClass);
		Assert.assertEquals(expected, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetPackageForWhenGivenPathHasNoJavaExtensionThenThrowIllegalArgumentException() {
		String path = "src/test/resources/src/main/java/fr/"
			+ "retromon/generator/NoJavaExtension";
		File javaClass = new File(path);
		FileManager.getPackageFor(javaClass);
	}

//	@Test(expected = IllegalArgumentException.class)
//	public void testGetPackageForWhenGivenPathDoesNotExistThenThrowIllegalArgumentException() {
//		String path = "i/am/a/path/that/does/not/Exist.java";
//		File javaClass = new File(path);
//		FileManager.getPackageFor(javaClass);
//	}
//	@Test
//	public void testGetPackageForWhenGivenPathIsAFileThenReturnFalse() {
//		String path = "src/test/resources/i_am_a_file.txt";
//		Assert.assertFalse(FileManager.isADirectory(path));
//	}
//
//	@Test
//	public void testGetPackageForWhenGivenPathIsEmptyThenReturnFalse() {
//		String path = "";
//		Assert.assertFalse(FileManager.isADirectory(path));
//	}
//
//	@Test
//	public void testGetPackageForWhenGivenPathIsNullThenReturnFalse() {
//		String path = null;
//		Assert.assertFalse(FileManager.isADirectory(path));
//	}
//	@Test
//	public void testWriteInFileWhenFilePathIsValidThenCreateFileAccordingly() {
//		
//		String value = "I should be written in a file.";
//		OutputStream out = System.out;
//		FileManager.setWriter(out);
//		FileManager.writeInFile(value);
//		
//		
//	}
}
