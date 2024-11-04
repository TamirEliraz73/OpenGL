package com.nls.core.world.base;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.Nullable;

@Getter
@Setter
@Accessors(chain = true)
public abstract class Vector2<T extends Number> {
    private T x;
    private T y;
    private @Nullable String name;
    
    public Vector2() { this((String) null); }
    
    @SuppressWarnings("unchecked")
    public Vector2(@Nullable String name) { this((T) (Number) 0, (String) null); }
    
    public Vector2(T xy) { this(xy, xy, null); }
    
    public Vector2(T xy, String name) { this(xy, xy, name); }
    
    public Vector2(T x, T y) { this(x, y, null); }
    
    public Vector2(T x, T y, String name) {
        setXY(x, y);
        setName(name);
    }
    
    public Vector2<T> setXY(Vector2<T> vector2d) {
        return vector2d == null ? this : setXY(vector2d.getX(), vector2d.getY());
    }
    
    public Vector2<T> setXY(T xy) { return setXY(xy, xy); }
    
    public Vector2<T> setXY(T x, T y) { return setX(x).setY(y); }
    
    @SuppressWarnings("unchecked")
    public Vector2<T> reset() { return setXY((T) (Number) 0); }
    
    @Override
    public String toString() {
        return getName() != null ?
                String.format("%s: (%.2f, %.2f)", getName(), getX().doubleValue(), getY().doubleValue()) :
                String.format("(%.2f, %.2f)", getX().doubleValue(), getY().doubleValue());
    }
}
