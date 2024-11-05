package com.nls.MathUtils.base;

import org.jetbrains.annotations.NotNull;

/**
 * Represents the supported types for vector elements.
 *
 * @author Tamir Eliraz
 */
public enum SupportedVectorType {
    /**
     * Represents the Byte vector type, which is an 8-bit signed integer.
     */
    BYTE,
    
    /**
     * Represents the Double vector type, which is a double-precision 64-bit IEEE 754 floating point.
     */
    DOUBLE,
    
    /**
     * Represents the Float vector type, which is a single-precision 32-bit IEEE 754 floating point.
     */
    FLOAT,
    
    /**
     * Represents the Integer vector type, which is a 32-bit signed integer.
     */
    INTEGER,
    
    /**
     * Represents the Long vector type, which is a 64-bit signed integer.
     */
    LONG,
    
    /**
     * Represents the Short vector type, which is a 16-bit signed integer.
     */
    SHORT;
    
    /**
     * Returns the SupportedVectorType instance that corresponds to the specified class type.
     *
     * @param clazz
     *         the class type for which the SupportedVectorType is to be retrieved.
     * @param <V>
     *         the type of the value, which must extend {@link Number}.
     * @return the corresponding SupportedVectorType instance.
     * @throws NullPointerException
     *         if <code>clazz</code> is <code>null</code>.
     * @throws UnsupportedVectorTypeException
     *         if the class type is not supported.
     */
    public static <V extends Number> SupportedVectorType getInstance(@NotNull Class<V> clazz) {
        return switch (clazz.getSimpleName()) {
            case "Byte" -> BYTE;
            case "Double" -> DOUBLE;
            case "Float" -> FLOAT;
            case "Integer" -> INTEGER;
            case "Long" -> LONG;
            case "Short" -> SHORT;
            default -> throw new UnsupportedVectorTypeException("Unsupported vector type: " + clazz.getSimpleName());
        };
    }
}