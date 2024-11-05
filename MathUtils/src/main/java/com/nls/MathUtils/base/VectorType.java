package com.nls.MathUtils.base;

/**
 * Represents the two types of vectors: row vectors and column vectors.
 *
 * @author Tamir Eliraz
 */
public enum VectorType {
    /**
     * Represents a row vector, which is a 1 x n matrix.
     */
    ROW_VECTOR,
    
    /**
     * Represents a column vector, which is an n x 1 matrix.
     */
    COLUMN_VECTOR;
    
    /**
     * Checks if this vector type is a row vector.
     *
     * @return true if this vector type is a row vector; false otherwise.
     */
    public boolean isRowVector() { return this == ROW_VECTOR; }
    
    /**
     * Checks if this vector type is a column vector.
     *
     * @return true if this vector type is a column vector; false otherwise.
     */
    public boolean isColumnVector() { return this == COLUMN_VECTOR; }
    
}