package fr.retromon.generator; 

import java.io.File;
import java.io.OutputStream;

/**
 *
 * @author theo
 */
public class FileManager {
	
	OutputStream out;

	public static boolean isAFile(File file) {
		if (file == null) {
			return false;
		}
		return (file.exists() && file.isFile());
	}

	public static boolean isADirectory(File directory) {
		if (directory == null) {
			return false;
		}
		return (directory.exists() && directory.isDirectory());
	}

	public static File getAsFile(String path) {
		if (path == null) {
			path = "";
		}
		return new File(path);
	}

	public static void writeInFile(String value) {
		
	}
	
	public static String getPackageFor(File javaClass) {
		if (!javaClass.getAbsolutePath().endsWith(".java")) {
			throw new IllegalArgumentException("Cannot find a package for files others than classes.");
		}
//		if (!isAFile(javaClass.getAbsolutePath()))
//			i should chose to only use File objects instead of strings
//				just use the method getAsFile at first, and then only deal with File.
		return "fr.retromon.generator";
	}

}
