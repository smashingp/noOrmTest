package es.alop.noorm.exceptions;

public class DatabaseException extends Exception {

	private static final long serialVersionUID = -9026306849190032683L;

	public DatabaseException(String msg) {
		super(msg);
	}
}
