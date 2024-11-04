package com.nls.core.window;

import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

import static org.lwjgl.system.MemoryUtil.NULL;

public class WindowFactory {
    public static long createWindow(int width, int height, String title, int[] enables, int[] disables) {
        long window;
        GLFW.glfwDefaultWindowHints();
        if (enables != null) for (int enable : enables) {
            GLFW.glfwWindowHint(enable, GLFW.GLFW_TRUE);
        }
        if (disables != null) for (int disable : disables) {
            GLFW.glfwWindowHint(disable, GLFW.GLFW_TRUE);
        }
        window = GLFW.glfwCreateWindow(width, height, title, NULL, NULL);
        if (window == NULL) {
            throw new WindowException("Failed to create the GLFW window");
        }
        return window;
    }
    
    public static long createWindow(@NotNull Window window, int[] enables, int[] disables) {
        return createWindow(window.getWidth(), window.getHeight(), window.getTitle(), enables, disables);
    }
    
    public static void showWindow(long window) {
        GLFW.glfwShowWindow(window);
    }
    
    public static void showWindow(@NotNull Window window) { showWindow(window.getGlfwWindow()); }
    
    public static void makeContextCurrent(long window) {
        GLFW.glfwMakeContextCurrent(window);
    }
    
    public static void makeContextCurrent(@NotNull Window window) { makeContextCurrent(window.getGlfwWindow()); }
    
    public static void enableVSync() { GLFW.glfwSwapInterval(1); }
}
