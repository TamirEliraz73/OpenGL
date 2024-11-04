package com.nls.core.utilities.clock;

import lombok.Getter;

public class Clock {
    private final double time;
    private double beginTime;
    @Getter
    private double dt;
    private static Clock instance;
    
    private Clock() {
        time = System.nanoTime();
    }
    
    public static Clock getInstance() {
        if (instance == null) instance = new Clock();
        return instance;
    }
    
    public double getTime() { return ( System.nanoTime() - time ) * 1E-9; }
    
    public void init() {
        beginTime = getTime();
    }
    
    public void tick() {
        double endTime = getTime();
        dt = endTime - beginTime;
        beginTime = endTime;
    }
}
