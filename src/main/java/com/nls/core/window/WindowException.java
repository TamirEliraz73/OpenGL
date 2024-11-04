package com.nls.core.window;

public class WindowException extends IllegalStateException {
    public WindowException() { super(); }
    
    public WindowException(String message) {
        super(message);
    }
}
