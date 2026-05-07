import org.junit.jupiter.api.*;
import otherTests.Shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTest {
    Shapes obj = new Shapes();
    Shapes shape;

    @BeforeAll
    static void init(){

        System.out.println("Before test");
    }

    @Test
    void testsqarea(){
        assertEquals(144, obj.sqarea(12));
        System.out.println(144);
    }

    @Test
    void testcirclearea(){
        assertEquals(78.5, obj.circlearea(5));
        System.out.println(78.5);
    }
}
