package adstr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class addstrTest {
    @org.junit.jupiter.api.Test
    void testCring() {
        addstr e=new addstr();
        assertEquals("AB", e.cring("A","B")); 
    }
}
