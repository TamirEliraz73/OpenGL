package com.nls.core.listener;

import com.nls.core.datastructure.BooleanArray;
import lombok.Getter;
import org.lwjgl.glfw.GLFW;

@Getter
public class KeyListener implements Listener{
    public static final int NUMBER_OF_KEYS = 350;
    private final BooleanArray keysPressed;
    private static KeyListener instance;
    
    public static KeyListener getInstance() {
        if (instance == null) instance = new KeyListener();
        return instance;
    }
    
    private KeyListener() {
        keysPressed = new BooleanArray(NUMBER_OF_KEYS);
    }
    
    public static void keyCallback(long window, int keyCode, int scanCode, int action, int mods) {
        KeyListener listener = KeyListener.getInstance();
        switch (action) {
            case GLFW.GLFW_PRESS -> listener.getKeysPressed().enable(keyCode);
            case GLFW.GLFW_RELEASE -> listener.getKeysPressed().disable(keyCode);
        }
    }
    
    public static boolean isKeyPressed(int keyCode) {
        return getInstance().getKeysPressed().isEnabled(keyCode);
    }
    
    @Override
    public void adapt(long window) {
        GLFW.glfwSetKeyCallback(window, KeyListener::keyCallback);
    }
}
