package fr.retromon.generator; 

/**
 *
 * @author theo
 */
public class StringParsingException extends Exception {

	public StringParsingException() {
	}

	public StringParsingException(String message) {
		super(message);
	}

	public StringParsingException(String message, Throwable cause) {
		super(message, cause);
	}

	public StringParsingException(Throwable cause) {
		super(cause);
	}

	public StringParsingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	
}
