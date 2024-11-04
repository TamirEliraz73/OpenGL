package com.nls.core.gl;

public class GlfwException extends IllegalStateException {
    public GlfwException() { super(); }
    
    public GlfwException(String message) {
        super(message);
    }
}
