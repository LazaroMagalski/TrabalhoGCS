package com.trabalho;
 import static org.junit.Assert.assertEquals;

import org.junit.Test;
class AppTest {
    @Test
    void testIdentifyingTea() {
        Tea app = new Tea();
        int result = app.identifyingTea(3, 3);
        assertEquals(1, result);
    }

    @Test
    void testIdentifyingTea2() {
        Tea app = new Tea();
        int result = app.identifyingTea(3, 2);
        assertEquals(0, result);
    }
}