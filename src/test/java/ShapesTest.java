import org.junit.jupiter.api.Test;
import otherTests.Shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTest {
    Shapes obj = new Shapes();

    @Test
    void testsqarea(){
        assertEquals(78.5, obj.sqarea(12));
    }

    @Test
    void testcirclearea(){
        assertEquals(78.5, obj.circlearea(5));
    }
}
