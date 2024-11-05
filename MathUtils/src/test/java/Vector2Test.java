import com.nls.MathUtils.vector2.Vector2f;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Vector2Test {
    @Test
    public void f() {
        Vector2f vector2f = new Vector2f();
        Assertions.assertEquals(0, vector2f.getX());
        Assertions.assertEquals(0, vector2f.getY());
        
        vector2f = new Vector2f(2f, 3f);
        Assertions.assertEquals(2f, vector2f.getX());
        Assertions.assertEquals(3f, vector2f.getY());
        
        vector2f.set(12f);
        Assertions.assertEquals(12f, vector2f.getX());
        Assertions.assertEquals(12f, vector2f.getY());
    }
}
