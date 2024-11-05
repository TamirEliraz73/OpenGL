package com.nls.MathUtils.base;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface IVector<V extends Number> {
    public @NotNull V[] getValues();
    
    public @NotNull IVector<V> set(V values);
    
    
    /**
     * Creates a default value for the specified class type.
     *
     * <p>This method supports the following types:</p>
     * <ul>
     *     <li><code>Byte</code>: Returns <code>0</code></li>
     *     <li><code>Double</code>: Returns <code>0.0</code></li>
     *     <li><code>Float</code>: Returns <code>0.0f</code></li>
     *     <li><code>Integer</code>: Returns <code>0</code></li>
     *     <li><code>Long</code>: Returns <code>0L</code></li>
     *     <li><code>Short</code>: Returns <code>0</code></li>
     * </ul>
     *
     * <p>Currently, support for <code>Boolean</code> and <code>Character</code> is commented out,
     * but is planned for future implementation.</p>
     *
     * @param type
     *         the type for which the default value is to be created.
     * @param <V>
     *         the type of the value, which must extend {@link Number}.
     * @return the default value for the specified type.
     * @throws NullPointerException
     *         if <code>type</code> is <code>null</code>.
     */
    @Contract(pure = true)
    public static <V extends Number> @NotNull V createDefaultValue(@NotNull SupportedVectorType type) {
        Object defaultValue = switch (type) {
            case BYTE -> (byte) 0;
            case DOUBLE -> 0.0;
            case FLOAT -> 0.0f;
            case INTEGER -> 0;
            case LONG -> 0L;
            case SHORT -> (short) 0;
        };
        return (V) defaultValue;
    }
    
    /**
     * Updates the default vector type to the specified type.
     *
     * @param vectorType
     *         the new default vector type to set
     */
    public void updateDefaultVectorType(@NotNull VectorType vectorType);
    
    /**
     * Retrieves the current default vector type.
     *
     * @return the current default vector type
     */
    public @NotNull VectorType getDefaultVectorType();
}
