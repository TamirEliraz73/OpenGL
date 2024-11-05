package com.nls.MathUtils.vector3;

import com.nls.MathUtils.base.IVector;
import com.nls.MathUtils.vector2.IVector2;
import org.jetbrains.annotations.NotNull;

public interface IVector3<V extends Number> extends IVector2<V> {
    public default @NotNull V getZ() { return getValues()[2]; }
    
    public default @NotNull IVector<V> setZ(@NotNull V z) { getValues()[2] = z; return this; }
    
    @Override
    public default @NotNull IVector<V> set(@NotNull V xyz) {
        return set(xyz, xyz, xyz);
    }
    
    public default @NotNull IVector<V> set(@NotNull V x, @NotNull V y, @NotNull V z) {
        return ( (IVector3<V>) IVector2.super.set(x, y) ).setZ(z);
    }
}
