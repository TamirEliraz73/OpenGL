package com.nls.MathUtils.vector4;

import com.nls.MathUtils.base.Vector;
import com.nls.MathUtils.base.VectorType;
import org.jetbrains.annotations.NotNull;

public abstract class Vector4<V extends Number> extends Vector<V> implements IVector4<V> {
    public Vector4(@NotNull Class<V> clazz) { super(clazz, 4); }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V xyzw) { super(clazz, 4, xyzw); }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y) { super(clazz, 4, x, y); }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z) { super(clazz, 4, x, y, z); }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z, @NotNull V w) {
        super(clazz, 4, x, y, z, w);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull VectorType vectorType) { super(clazz, 4, vectorType); }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V xyzw, @NotNull VectorType vectorType) {
        super(clazz, 4, vectorType, xyzw);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull VectorType vectorType) {
        super(clazz, 4, vectorType, x, y);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z, @NotNull VectorType vectorType) {
        super(clazz, 4, vectorType, x, y, z);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z, @NotNull V w,
                   @NotNull VectorType vectorType) {
        super(clazz, 4, vectorType, x, y, z, w);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull String name) { super(clazz, 4, name); }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V xyzw, @NotNull String name) { super(clazz, 4, name, xyzw); }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull String name) {
        super(clazz, 4, name, x, y);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z, @NotNull String name) {
        super(clazz, 4, name, x, y, z);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z, @NotNull V w,
                   @NotNull String name) {
        super(clazz, 4, name, x, y, z, w);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull VectorType vectorType, @NotNull String name) {
        super(clazz, 4, vectorType, name);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V xyzw, @NotNull VectorType vectorType, @NotNull String name) {
        super(clazz, 4, vectorType, name, xyzw);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull VectorType vectorType,
                   @NotNull String name) {
        super(clazz, 4, vectorType, name, x, y);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z, @NotNull VectorType vectorType,
                   @NotNull String name) {
        super(clazz, 4, vectorType, name, x, y, z);
    }
    
    public Vector4(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z, @NotNull V w,
                   @NotNull VectorType vectorType, @NotNull String name) {
        super(clazz, 4, vectorType, name, x, y, z, w);
    }
}
