package com.nls.MathUtils.intrrface;

import org.jetbrains.annotations.NotNull;

/**
 * Interface representing basic linear algebra operations.
 * This interface defines methods for performing addition, subtraction,
 * and multiplication operations on linear algebra objects.
 *
 * Implementing classes should provide the logic for handling operations
 * between objects that conform to the linear algebra concepts.
 *
 * @author Tamir Eliraz
 */
public interface LAO {
    /**
     * Adds the specified linear algebra object to this object.
     *
     * @param rhs the linear algebra object to add
     * @return the result of the addition as a new LAO object
     */
    public @NotNull LAO add(@NotNull LAO rhs);
    
    /**
     * Subtracts the specified linear algebra object from this object.
     *
     * @param rhs the linear algebra object to subtract
     * @return the result of the subtraction as a new LAO object
     */
    public LAO sub(LAO rhs);
    
    /**
     * Multiplies this linear algebra object by a scalar value.
     *
     * @param scalar the scalar value to multiply by
     * @param <V> the type of the scalar, which must extend {@link Number}
     * @return the result of the multiplication as a new LAO object
     */
    public <V extends Number> LAO mul(V scalar);
    
    /**
     * Multiplies this linear algebra object by another linear algebra object.
     *
     * @param rhs the linear algebra object to multiply with
     * @return the result of the multiplication as a new LAO object
     */
    public LAO mul(LAO rhs);
}
