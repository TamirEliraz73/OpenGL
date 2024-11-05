package com.nls.MathUtils.vector2;

import com.nls.MathUtils.base.Vector;
import com.nls.MathUtils.base.VectorType;
import org.jetbrains.annotations.NotNull;

public abstract class Vector2<V extends Number> extends Vector<V> implements IVector2<V> {
    public Vector2(@NotNull Class<V> clazz) { super(clazz, 2); }
    
    public Vector2(@NotNull Class<V> clazz, @NotNull V xy) { super(clazz, 2, xy, xy); }
    
    public Vector2(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y) { super(clazz, 2, x, y); }
    
    public Vector2(@NotNull Class<V> clazz, @NotNull VectorType vectorType) { super(clazz, 2, vectorType); }
    
    public Vector2(@NotNull Class<V> clazz, @NotNull V xy, @NotNull VectorType vectorType) {
        super(clazz, 2, vectorType, xy, xy);
    }
    
    public Vector2(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull VectorType vectorType) {
        super(clazz, 2, vectorType, x, y);
    }
    
    public Vector2(@NotNull Class<V> clazz, @NotNull String name) { super(clazz, 2, name); }
    
    public Vector2(@NotNull Class<V> clazz, @NotNull V xy, @NotNull String name) { super(clazz, 2, name, xy, xy); }
    
    public Vector2(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull String name) {
        super(clazz, 2, name, x, y);
    }
    
    public Vector2(@NotNull Class<V> clazz, @NotNull VectorType vectorType, @NotNull String name) {
        super(clazz, 2, vectorType, name);
    }
    
    public Vector2(@NotNull Class<V> clazz, @NotNull V xy, @NotNull VectorType vectorType, @NotNull String name) {
        super(clazz, 2, vectorType, name, xy, xy);
    }
    
    public Vector2(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull VectorType vectorType,
                   @NotNull String name) {
        super(clazz, 2, vectorType, name, x, y);
    }
}
