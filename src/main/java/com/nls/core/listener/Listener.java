package com.nls.core.listener;

import com.nls.core.window.Window;
import org.jetbrains.annotations.NotNull;

public interface Listener {
    public default void adapt(@NotNull Window window) { adapt(window.getGlfwWindow()); }
    
    @SuppressWarnings("unused")
    public void adapt(long window);
}
