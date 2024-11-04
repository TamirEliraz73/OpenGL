package com.nls.core.world.base;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.Nullable;

@Getter
@Setter
@Accessors(chain = true)
public abstract class Vector3<T extends Number> extends Vector2<T> {
    protected T z;
    
    public Vector3() { }
    
    public Vector3(@Nullable String name) { super(name); }
    
    public Vector3(T xyz) { super(xyz); setZ(z); }
    
    public Vector3(T xyz, String name) { super(xyz, name); setZ(z); }
    
    public Vector3(T x, T y, T z) { super(x, y); setZ(z); }
    
    public Vector3(T x, T y, T z, String name) { super(x, y, name); setZ(z); }
    
    @SuppressWarnings("unchecked")
    public Vector3<T> setXYZ(Vector2<T> vector2) {
        return vector2 == null ? this : setXYZ(vector2.getX(), vector2.getY(), (T) (Number) 0);
    }
    
    public Vector3<T> setXYZ(Vector3<T> vector3) {
        return vector3 == null ? this : setXYZ(vector3.getX(), vector3.getY(), vector3.getZ());
    }
    
    public Vector3<T> setXYZ(T xyz) { return setXYZ(xyz, xyz, xyz); }
    
    public Vector3<T> setXYZ(T x, T y, T z) { return ( (Vector3<T>) setX(x).setY(y) ).setZ(z); }
}
