package com.nls.core.gl;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;

import java.io.PrintStream;

public class GlfwAdapter {
    public static void setErrorCallback() { setErrorCallback(System.err); }
    
    public static void setErrorCallback(PrintStream err) {
        GLFWErrorCallback.createPrint(err).set();
    }
    
    public static void createCapabilities() {
        GL.createCapabilities();
    }
    
    public static void glfwInit() {
        if (!GLFW.glfwInit()) {
            throw new GlfwException("Unable to initialize GLFW");
        }
    }
}
