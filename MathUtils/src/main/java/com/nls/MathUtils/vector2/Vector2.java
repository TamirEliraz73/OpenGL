package com.nls.MathUtils.vector2;

import com.nls.MathUtils.base.Vector;
import com.nls.MathUtils.base.VectorType;
import org.jetbrains.annotations.NotNull;

public abstract class Vector2<V extends Number> extends Vector<V> {
    public Vector2(Class<V> clazz) { super(clazz, 2); }
    
    public Vector2(Class<V> clazz, V xy) { this(clazz, xy, xy); }
    
    public Vector2(Class<V> clazz, V x, V y) { super(clazz, 2, getDefaultVectorType(), null, x, y); }
    
    public Vector2(Class<V> clazz, VectorType vectorType) { super(clazz, 2, vectorType); }
    
    public Vector2(Class<V> clazz, V xy, VectorType vectorType) { this(clazz, xy, xy, vectorType); }
    
    public Vector2(Class<V> clazz, V x, V y, VectorType vectorType) { this(clazz, x, y, vectorType, null); }
    
    public Vector2(Class<V> clazz, String name) { super(clazz, 2, getDefaultVectorType(), name); }
    
    public Vector2(Class<V> clazz, V xy, String name) { this(clazz, xy, xy, name); }
    
    public Vector2(Class<V> clazz, V x, V y, String name) { this(clazz, x, y, getDefaultVectorType(), name); }
    
    public Vector2(Class<V> clazz, VectorType vectorType, String name) { super(clazz, 2, vectorType, name); }
    
    public Vector2(Class<V> clazz, V xy, VectorType vectorType, String name) { this(clazz, xy, xy, vectorType, name); }
    
    public Vector2(Class<V> clazz, V x, V y, VectorType vectorType, String name) {
        super(clazz, 2, vectorType, name,
                x, y);
    }
    
    public @NotNull V getX() { return getValues()[0]; }
    
    public @NotNull Vector2<V> setX(@NotNull V x) { getValues()[0] = x; return this; }
    
    public @NotNull V getY() { return getValues()[1]; }
    
    public @NotNull Vector2<V> setY(@NotNull V y) { getValues()[1] = y; return this; }
    
    public @NotNull Vector2<V> set(@NotNull V xy) { return set(xy, xy); }
    
    public @NotNull Vector2<V> set(@NotNull V x, @NotNull V y) { return setX(x).setY(y); }
    
}
