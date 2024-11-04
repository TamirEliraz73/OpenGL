package com.nls.core.window;

import com.nls.core.utilities.clock.Clock;
import com.nls.core.utilities.color.Color;
import com.nls.core.gl.GlfwAdapter;
import com.nls.core.listener.KeyListener;
import com.nls.core.listener.MouseListener;
import com.nls.core.world.implement.Vector2i;
import lombok.Getter;

import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

@Getter
public class Window implements Runnable {
    private long glfwWindow;
    private String title;
    private Vector2i dimensions;
    private Color backgroundColor;
    private Clock clock;
    
    private static Window instance;
    
    private Window() { this("Mario"); }
    
    private Window(String title) { this(title, 1920, 1080); }
    
    private Window(int width, int height) { this("Mario", width, height); }
    
    private Window(String title, int width, int height) {
        this.title = title;
        dimensions = new Vector2i(width, height, "Dimensions");
        setBackgroundColor("GOLD");
        clock = Clock.getInstance();
        init();
    }
    
    public static Window getInstance() {
        if (instance == null) instance = new Window();
        return instance;
    }
    
    @Override
    public void run() {
        loop();
    }
    
    public void init() {
        GlfwAdapter.setErrorCallback();
        GlfwAdapter.glfwInit();
        glfwWindow = WindowFactory.createWindow(this,
                new int[]{ GLFW.GLFW_RESIZABLE, GLFW.GLFW_MAXIMIZED },
                new int[]{ GLFW.GLFW_VISIBLE });
        MouseListener.getInstance().adapt(this);
        KeyListener.getInstance().adapt(this);
        WindowFactory.makeContextCurrent(this);
        WindowFactory.enableVSync();
        WindowFactory.showWindow(this);
        GlfwAdapter.createCapabilities();
    }
    
    public void loop() {
        clock.init();
        
        while (!GLFW.glfwWindowShouldClose(getGlfwWindow())) {
            GLFW.glfwPollEvents();
            
            clearWindow();
            
            GLFW.glfwSwapBuffers(getGlfwWindow());
            System.out.printf("\r%s", MouseListener.getInstance().isButtonPressed(0));
            clock.tick();
        }
    }
    
    private void clearWindow() {
        GL11.glClearColor(backgroundColor.redF(), backgroundColor.greenF(), backgroundColor.blueF(),
                backgroundColor.alphaF());
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
    }
    
    public void setBackgroundColor(float r, float g, float b, float a) {
        backgroundColor = new Color(r, g, b, a);
    }
    
    public void setBackgroundColor(float r, float g, float b) { setBackgroundColor(r, g, b, 1.0f); }
    
    public void setBackgroundColor(@NotNull String colorName) {
        setBackgroundColor(Color.getColorByName(colorName));
    }
    
    public void setBackgroundColor(@NotNull Color color) {
        if (color != null) backgroundColor = color;
    }
    
    public int getWidth() { return getDimensions().getX(); }
    
    public int getHeight() { return getDimensions().getY(); }
    
}
