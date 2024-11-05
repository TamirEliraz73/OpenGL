package com.nls.MathUtils.vector2;

import com.nls.MathUtils.base.IVector;
import org.jetbrains.annotations.NotNull;

public interface IVector2<V extends Number> extends IVector<V> {
    public default @NotNull V getX() { return getValues()[0]; }
    
    public default @NotNull V getY() { return getValues()[1]; }
    
    public default @NotNull IVector<V> setX(@NotNull V x) { getValues()[0] = x; return this; }
    
    public default @NotNull IVector<V> setY(@NotNull V y) { getValues()[1] = y; return this; }
    
    @Override
    public default @NotNull IVector<V> set(@NotNull V xy) { return set(xy, xy); }
    
    public default @NotNull IVector<V> set(@NotNull V x, @NotNull V y) { return ( (IVector2<V>) setX(x) ).setY(y); }
}
