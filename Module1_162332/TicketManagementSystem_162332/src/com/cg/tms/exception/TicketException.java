package com.cg.tms.exception;

class TicketException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TicketException() {
		super();
		
	}

	public TicketException(String message) {
		super(message);
		
	}

	public TicketException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public TicketException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public TicketException(Throwable cause) {
		super(cause);
		
	}
	
}
