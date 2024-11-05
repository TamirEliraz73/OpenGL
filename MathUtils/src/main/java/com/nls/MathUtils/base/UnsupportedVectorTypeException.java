package com.nls.MathUtils.base;

/**
 * Exception thrown when an unsupported vector type is encountered.
 *
 * @author Tamir Eliraz
 */
public class UnsupportedVectorTypeException extends RuntimeException {
    /**
     * Constructs a new exception with no detail message.
     */
    public UnsupportedVectorTypeException() { super(); }
    
    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param message
     *         the detail message, which is saved for later retrieval by the {@link Throwable#getMessage()} method.
     */
    public UnsupportedVectorTypeException(String message) {
        super(message);
    }
}
