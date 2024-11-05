import com.nls.MathUtils.intrrface.LAO;
import com.nls.MathUtils.vector2.Vector2;
import com.nls.MathUtils.vector2.Vector2f;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Vector2Test {
    private static Vector2<Float> vector2;
    
    @BeforeAll
    public static void init() { vector2 = new Vector2f(); }
    
    @Test
    public void f() {
        Assertions.assertEquals(0.0f, vector2.getX());
        Assertions.assertEquals(0.0f, vector2.getY());
        
        vector2 = new Vector2f(2.5f, 3f);
        Assertions.assertEquals(2.5f, vector2.getX());
        Assertions.assertEquals(3f, vector2.getY());
        
        vector2.set(12.2f);
        Assertions.assertEquals(12.2f, vector2.getX());
        Assertions.assertEquals(12.2f, vector2.getY());
        
        vector2.setX(10.0f);
        vector2.setY(11.5f);
        Assertions.assertEquals(10.0f, vector2.getX());
        Assertions.assertEquals(11.5f, vector2.getY());
        
    }
}
