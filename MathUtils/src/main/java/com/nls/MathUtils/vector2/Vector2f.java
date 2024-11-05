package com.nls.MathUtils.vector2;

import com.nls.MathUtils.base.VectorType;
import com.nls.MathUtils.intrrface.LAO;
import org.jetbrains.annotations.NotNull;

public class Vector2f extends Vector2<Float> {
    
    public Vector2f(@NotNull Class<Float> clazz) {
        super(clazz);
    }
    
    public Vector2f(@NotNull Class<Float> clazz, @NotNull Float xy) {
        super(clazz, xy);
    }
    
    public Vector2f(@NotNull Class<Float> clazz, @NotNull Float x, @NotNull Float y) {
        super(clazz, x, y);
    }
    
    public Vector2f(@NotNull Class<Float> clazz, @NotNull VectorType vectorType) {
        super(clazz, vectorType);
    }
    
    public Vector2f(@NotNull Class<Float> clazz, @NotNull Float xy, @NotNull VectorType vectorType) {
        super(clazz, xy, vectorType);
    }
    
    public Vector2f(@NotNull Class<Float> clazz, @NotNull Float x, @NotNull Float y, @NotNull VectorType vectorType) {
        super(clazz, x, y, vectorType);
    }
    
    public Vector2f(@NotNull Class<Float> clazz, @NotNull String name) {
        super(clazz, name);
    }
    
    public Vector2f(@NotNull Class<Float> clazz, @NotNull Float xy, @NotNull String name) {
        super(clazz, xy, name);
    }
    
    public Vector2f(@NotNull Class<Float> clazz, @NotNull Float x, @NotNull Float y, @NotNull String name) {
        super(clazz, x, y, name);
    }
    
    public Vector2f(@NotNull Class<Float> clazz, @NotNull VectorType vectorType, @NotNull String name) {
        super(clazz, vectorType, name);
    }
    
    public Vector2f(@NotNull Class<Float> clazz, @NotNull Float xy, @NotNull VectorType vectorType, @NotNull String name) {
        super(clazz, xy, vectorType, name);
    }
    
    public Vector2f(@NotNull Class<Float> clazz, @NotNull Float x, @NotNull Float y, @NotNull VectorType vectorType, @NotNull String name) {
        super(clazz, x, y, vectorType, name);
    }
    
    @Override
    public @NotNull LAO add(@NotNull LAO rhs) {
        return null;
    }
    
    @Override
    public LAO sub(LAO rhs) {
        return null;
    }
    
    @Override
    public <V extends Number> LAO mul(V scalar) {
        return null;
    }
    
    @Override
    public LAO mul(LAO rhs) {
        return null;
    }
}
