package com.verizonwireless.exception;

import org.springframework.core.NestedRuntimeException;


/**
 * Exception thrown when incoming data is not valid.
 */
public class InvalidDataException extends NestedRuntimeException {

    /**
     * Constructs new InvalidDataException with the specified message.
     *
     * @param msg message
     */
    public InvalidDataException(final String msg) {
        super(msg);
    }

    /**
     * Constructs a new InvalidDataException exception with the
     * specified detail message and cause.
     *
     * @param msg   message.
     * @param cause cause.
     */
    public InvalidDataException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
