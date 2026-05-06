import course_purchase.Course_Purchased;
import course_purchase.JavaC;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Testcourse_purchase {

    @Test
    void testcoursePurchased(){
        Course_Purchased obj = new Course_Purchased();
        boolean purchase = obj.coursePurchased(new JavaC());
        assertTrue(purchase);
    }
}
