package com.trabalho;
 import static org.junit.Assert.assertEquals;

import org.junit.Test;
class AppTest {
    @Test
    void testIdentifyingTea() {
        App app = new App();
        int result = app.identifyingTea(3, 3);
        assertEquals(1, result);
    }

    @Test
    void testIdentifyingTea2() {
        App app = new App();
        int result = app.identifyingTea(3, 2);
        assertEquals(0, result);
    }
}