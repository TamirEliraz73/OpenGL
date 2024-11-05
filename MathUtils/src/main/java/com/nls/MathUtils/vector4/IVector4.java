package com.nls.MathUtils.vector4;

import com.nls.MathUtils.base.IVector;
import com.nls.MathUtils.vector3.IVector3;
import org.jetbrains.annotations.NotNull;

public interface IVector4<V extends Number> extends IVector3<V> {
    public default @NotNull V getW() { return getValues()[3]; }
    
    public default @NotNull IVector<V> setW(@NotNull V w) { getValues()[2] = w; return this; }
    
    @Override
    public default @NotNull IVector<V> set(@NotNull V xyzw) {
        return set(xyzw, xyzw, xyzw, xyzw);
    }
    
    public default @NotNull IVector<V> set(@NotNull V x, @NotNull V y, @NotNull V z, @NotNull V w) {
        return ( (IVector4<V>) IVector3.super.set(x, y, z) ).setW(w);
    }
}
