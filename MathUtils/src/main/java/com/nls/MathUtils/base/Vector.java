package com.nls.MathUtils.base;

import com.nls.MathUtils.intrrface.LAO;
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
public abstract class Vector<V extends Number> implements IVector<V>, LAO {
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
    protected Vector(@NotNull Class<V> clazz, int size,
                     @NotNull VectorType vectorType, @Nullable String name,
                     V... values) {
        defaultValue = IVector.createDefaultValue(SupportedVectorType.getInstance(clazz));
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
    protected Vector(@NotNull Class<V> clazz, int size, @NotNull VectorType vectorType, V... values) {
        this(clazz, size, vectorType, null, values);
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
    protected Vector(@NotNull Class<V> clazz, int size, @Nullable String name, V... values) {
        this(clazz, size, DEFAULT_VECTOR_TYPE, name, values);
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
    protected Vector(@NotNull Class<V> clazz, int size, V... values) {
        this(clazz, size, DEFAULT_VECTOR_TYPE, null, values);
    }
    
    @Override
    public V[] getValues() { return values; }
    
    @Override
    public void updateDefaultVectorType(@NotNull VectorType vectorType) { DEFAULT_VECTOR_TYPE = vectorType; }
    
    @Override
    public @NotNull VectorType getDefaultVectorType() { return DEFAULT_VECTOR_TYPE; }
}
