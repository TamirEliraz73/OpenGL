package com.nls.core.world.implement;

import com.nls.core.world.base.Vector2;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Vector2f extends Vector2<Float> {
    public Vector2f() { super(); }
    
    public Vector2f(String name) { super(name); }
    
    public Vector2f(float xy) { super(xy); }
    
    public Vector2f(float xy, String name) { super(xy, name); }
    
    public Vector2f(float x, float y) { super(x, y); }
    
    public Vector2f(float x, float y, String name) { super(x, y, name); }
}
