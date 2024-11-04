package com.nls.core.datastructure;

public record BooleanArray(boolean[] array) {
    public BooleanArray(int size) {
        this(new boolean[size]);
    }
    
    public BooleanArray enable(int index) {
        try { array[index] = true; } catch (IndexOutOfBoundsException ignored) { } ;
        return this;
    }
    
    public BooleanArray disable(int index) {
        try { array[index] = false; } catch (IndexOutOfBoundsException ignored) { } ;
        return this;
    }
    
    public boolean isEnabled(int index) {
        boolean res = false;
        try { res = array[index]; } catch (IndexOutOfBoundsException ignored) { }
        return res;
    }
    
    public boolean isDisable(int index) {
        return !isEnabled(index);
    }
    
    public boolean isAny() {
        for (int i = 0; i < size(); i++) {
            if (isEnabled(i)) return true;
        }
        return false;
    }
    
    public boolean isAll() {
        for (int i = 0; i < size(); i++) {
            if (isDisable(i)) return false;
        }
        return true;
    }
    
    public int size() { return array.length; }
    
    public int length() { return size(); }
}
