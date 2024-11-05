package com.nls.MathUtils.base;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Array;

/**
 * Represents a mathematical vector that can hold elements of a specified type extending {@link Number}.
 *
 * @param <V>
 *         the type of elements in the vector, must extend {@link Number}
 * @author Tamir Eliraz
 */
@Getter
@Setter
@Accessors(chain = true)
public abstract class Vector<V extends Number> {
    /**
     * The default vector type, which can be set and updated.
     * Initially set to {@link VectorType#ROW_VECTOR}.
     */
    private static @NotNull VectorType DEFAULT_VECTOR_TYPE = VectorType.ROW_VECTOR;
    
    /**
     * The default value used for uninitialized elements of the vector.
     */
    private @NotNull V defaultValue;
    
    /**
     * The type of this vector (e.g., row or column).
     */
    private @NotNull VectorType vectorType;
    
    /**
     * An optional name for this vector, which can be null.
     */
    private @Nullable String name;
    
    /**
     * The array of values representing the elements of the vector.
     */
    private final @NotNull V[] values;
    
    
    /**
     * Constructs a Vector with the specified parameters, allowing initial values to be provided.
     *
     * @param clazz
     *         the class of the vector's elements, must extend {@link Number}
     * @param size
     *         the size of the vector
     * @param vectorType
     *         the type of the vector (e.g., row or column)
     * @param name
     *         an optional name for the vector
     * @param values
     *         optional initial values to populate the vector
     * @throws NullPointerException
     *         if <code>clazz</code> is <code>null</code>
     */
    @SuppressWarnings("unchecked")
    protected Vector(@NotNull Class<V> clazz, int size, @NotNull VectorType vectorType, @Nullable String name,
                     V... values) {
        defaultValue = createDefaultValue(SupportedVectorType.getInstance(clazz));
        setVectorType(vectorType).setName(name);
        this.values = (V[]) Array.newInstance(clazz, size);
        System.arraycopy(values, 0, this.values, 0, values.length);
        for (int i = values.length; i < this.values.length; i++) this.values[i] = defaultValue;
    }
    
    /**
     * Constructs a Vector with the specified class type, size, and vector type, without a name.
     *
     * @param clazz
     *         the class of the vector's elements, must extend {@link Number}
     * @param size
     *         the size of the vector
     * @param vectorType
     *         the type of the vector (e.g., row or column)
     * @throws NullPointerException
     *         if <code>clazz</code> is <code>null</code>
     */
    @SuppressWarnings("unchecked")
    protected Vector(@NotNull Class<V> clazz, int size, @NotNull VectorType vectorType) {
        this(clazz, size, vectorType, null);
    }
    
    /**
     * Constructs a Vector with the specified class type, size, and name, using the default vector type.
     *
     * @param clazz
     *         the class of the vector's elements, must extend {@link Number}
     * @param size
     *         the size of the vector
     * @param name
     *         an optional name for the vector
     * @throws NullPointerException
     *         if <code>clazz</code> is <code>null</code>
     */
    @SuppressWarnings("unchecked")
    protected Vector(@NotNull Class<V> clazz, int size, @Nullable String name) {
        this(clazz, size, DEFAULT_VECTOR_TYPE, name);
    }
    
    /**
     * Constructs a Vector with the specified class type and size, using the default vector type and no name.
     *
     * @param clazz
     *         the class of the vector's elements, must extend {@link Number}
     * @param size
     *         the size of the vector
     * @throws NullPointerException
     *         if <code>clazz</code> is <code>null</code>
     */
    @SuppressWarnings("unchecked")
    protected Vector(@NotNull Class<V> clazz, int size) {
        this(clazz, size, DEFAULT_VECTOR_TYPE, null);
    }
    
    
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
    public static void updateDefaultVectorType(@NotNull VectorType vectorType) { DEFAULT_VECTOR_TYPE = vectorType; }
    
    /**
     * Retrieves the current default vector type.
     *
     * @return the current default vector type
     */
    public static @NotNull VectorType getDefaultVectorType() { return DEFAULT_VECTOR_TYPE; }
}
