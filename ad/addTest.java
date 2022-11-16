package ad;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class addTest {
    @Test
    void testEw() {
        add o=new add();
        assertEquals(5,o.ew(2,3));
    }
}
