package com.nls.core.utilities.color;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;

public record Color(float red, float green, float blue, float alpha) {
    public Color(float red, float green, float blue) { this(red, green, blue, 1.0f); }
    
    /**
     * Retrieves the static color variable from the <code>com.nls.core.color.ColorList</code> interface based on the provided name.
     *
     * @param colorName
     *         The name of the color as a string (e.g., "NAVY").
     * @return The <code>com.nls.core.color.Color</code> object corresponding to the specified name, or <code>null</code> if no such
     * color exists.
     * @throws IllegalArgumentException
     *         if <code>colorName</code> is <code>null</code> or empty.
     */
    public static Color getColorByName(@NotNull String colorName) {
        try {
            Field field = ColorList.class.getField(colorName.toUpperCase());
            return (Color) field.get(null);
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException("Unknown color: " + colorName);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to access color field", e);
        }
    }
    
    public float redF() { return colorF(red); }
    
    public float greenF() { return colorF(green); }
    
    public float blueF() { return colorF(blue); }
    
    public float alphaF() { return colorF(alpha); }
    
    private float colorF(float color) { return color <= 1.0f ? color : color / 256.0f; }
}