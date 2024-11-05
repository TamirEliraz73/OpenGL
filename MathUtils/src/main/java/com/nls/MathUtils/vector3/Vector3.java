package com.nls.MathUtils.vector3;

import com.nls.MathUtils.base.Vector;
import com.nls.MathUtils.base.VectorType;
import org.jetbrains.annotations.NotNull;

public abstract class Vector3<V extends Number> extends Vector<V> implements IVector3<V> {
    public Vector3(@NotNull Class<V> clazz) { super(clazz, 3); }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V xyz) { super(clazz, 3, xyz); }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y) { super(clazz, 3, x, y); }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z) { super(clazz, 3, x, y, z); }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull VectorType vectorType) { super(clazz, 3, vectorType); }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V xyz, @NotNull VectorType vectorType) {
        super(clazz, 3, vectorType, xyz);
    }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull VectorType vectorType) {
        super(clazz, 3, vectorType, x, y);
    }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z, @NotNull VectorType vectorType) {
        super(clazz, 3, vectorType, x, y, z);
    }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull String name) { super(clazz, 3, name); }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V xyz, @NotNull String name) { super(clazz, 3, name, xyz); }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull String name) {
        super(clazz, 3, name, x, y);
    }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z, @NotNull String name) {
        super(clazz, 3, name, x, y, z);
    }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull VectorType vectorType, @NotNull String name) {
        super(clazz, 3, vectorType, name);
    }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V xyz, @NotNull VectorType vectorType, @NotNull String name) {
        super(clazz, 3, vectorType, name, xyz);
    }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull VectorType vectorType,
                   @NotNull String name) {
        super(clazz, 3, vectorType, name, x, y);
    }
    
    public Vector3(@NotNull Class<V> clazz, @NotNull V x, @NotNull V y, @NotNull V z, @NotNull VectorType vectorType,
                   @NotNull String name) {
        super(clazz, 3, vectorType, name, x, y, z);
    }
}
