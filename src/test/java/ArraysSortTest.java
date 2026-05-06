import org.junit.jupiter.api.Test;
import otherTests.ArraysSort;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArraysSortTest {

    ArraysSort obj = new ArraysSort();
    @Test
    void sorttest(){
        int[] arr = {2, 7, 1};
        int[] srr = null;

        assertThrows(NullPointerException.class, () -> obj.sortA(srr));
    }
}
