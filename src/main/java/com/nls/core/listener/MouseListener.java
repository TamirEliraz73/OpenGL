package com.nls.core.listener;

import com.nls.core.datastructure.BooleanArray;
import com.nls.core.world.implement.Vector2f;
import lombok.Getter;
import org.lwjgl.glfw.GLFW;

@Getter
public class MouseListener implements Listener {
    public static final int NUMBER_OF_BUTTONS = 5;
    private final BooleanArray buttonPressed;
    private final Vector2f currentPosition;
    private final Vector2f lastPosition;
    private final Vector2f scroll;
    private static MouseListener instance;
    
    public void setButtonPressed(int button) {
        getButtonPressed().enable(button);
    }
    
    public void unsetButtonPressed(int button) {
        getButtonPressed().disable(button);
    }
    
    private MouseListener() {
        buttonPressed = new BooleanArray(NUMBER_OF_BUTTONS);
        currentPosition = new Vector2f();
        lastPosition = new Vector2f();
        scroll = new Vector2f();
    }
    
    public static MouseListener getInstance() {
        if (instance == null) instance = new MouseListener();
        return instance;
    }
    
    public static void mousePosCallback(long window, double xPos, double yPos) {
        MouseListener mouse = getInstance();
        mouse.getLastPosition().setXY(mouse.getCurrentPosition());
        mouse.getCurrentPosition().setXY((float) xPos, (float) yPos);
    }
    
    public static void mouseButtonCallback(long window, int button, int action, int mods) {
        MouseListener mouseListener = getInstance();
        switch (action) {
            case GLFW.GLFW_PRESS -> mouseListener.setButtonPressed(button);
            case GLFW.GLFW_RELEASE -> mouseListener.unsetButtonPressed(button);
        }
    }
    
    public static void mouseScrollCallback(long window, double xOffset, double yOffset) {
        MouseListener mouseListener = getInstance();
        mouseListener.getScroll().setXY((float) xOffset, (float) yOffset);
    }
    
    public static void endFrame() {
        MouseListener mouseListener = getInstance();
        mouseListener.getScroll().reset();
        mouseListener.getLastPosition().setXY(mouseListener.getCurrentPosition());
    }
    
    public static double getX() { return getInstance().getCurrentPosition().getX(); }
    
    public static double getY() { return getInstance().getCurrentPosition().getY(); }
    
    public static double getLastX() { return getInstance().getLastPosition().getX(); }
    
    public static double getLastY() { return getInstance().getLastPosition().getY(); }
    
    public static double getScrollX() { return getInstance().getScroll().getX(); }
    
    public static double getScrollY() { return getInstance().getScroll().getY(); }
    
    public static double getDeltaX() { return getX() - getLastX(); }
    
    public static double getDeltaY() { return getY() - getLastY(); }
    
    public boolean isButtonPressed(int button) {
        return buttonPressed.isEnabled(button);
    }
    
    public boolean isDragging() {
        return buttonPressed.isAny();
    }
    
    @Override
    public void adapt(long window) {
        GLFW.glfwSetCursorPosCallback(window, MouseListener::mousePosCallback);
        GLFW.glfwSetMouseButtonCallback(window, MouseListener::mouseButtonCallback);
        GLFW.glfwSetScrollCallback(window, MouseListener::mousePosCallback);
    }
}