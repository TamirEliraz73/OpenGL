package com.nls.core.world.implement;

import com.nls.core.world.base.Vector2;
import org.jetbrains.annotations.Nullable;

public class Vector2i extends Vector2<Integer> {
    public Vector2i() { }
    
    public Vector2i(@Nullable String name) { super(name); }
    
    public Vector2i(Integer xy) { super(xy); }
    
    public Vector2i(Integer xy, String name) { super(xy, name); }
    
    public Vector2i(Integer x, Integer y) { super(x, y); }
    
    public Vector2i(Integer x, Integer y, String name) { super(x, y, name); }
}
