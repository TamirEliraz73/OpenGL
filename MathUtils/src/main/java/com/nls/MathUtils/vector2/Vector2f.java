package com.nls.MathUtils.vector2;

import com.nls.MathUtils.base.VectorType;
import com.nls.MathUtils.intrrface.LAO;
import org.jetbrains.annotations.NotNull;

public class Vector2f extends Vector2<Float> {
    
    public Vector2f() {
        super(Float.class);
    }
    
    public Vector2f(float xy) {
        super(Float.class, xy);
    }
    
    public Vector2f(float x, float y) {
        super(Float.class, x, y);
    }
    
    public Vector2f(VectorType vectorType) {
        super(Float.class, vectorType);
    }
    
    public Vector2f(float xy, VectorType vectorType) {
        super(Float.class, xy, vectorType);
    }
    
    public Vector2f(float x, float y, VectorType vectorType) {
        super(Float.class, x, y, vectorType);
    }
    
    public Vector2f(String name) {
        super(Float.class, name);
    }
    
    public Vector2f(float xy, String name) {
        super(Float.class, xy, name);
    }
    
    public Vector2f(float x, float y, String name) {
        super(Float.class, x, y, name);
    }
    
    public Vector2f(VectorType vectorType, String name) {
        super(Float.class, vectorType, name);
    }
    
    public Vector2f(float xy, VectorType vectorType, String name) {
        super(Float.class, xy, vectorType, name);
    }
    
    public Vector2f(float x, float y, VectorType vectorType, String name) {
        super(Float.class, x, y, vectorType, name);
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
