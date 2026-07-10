package com.cognizant.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    void testUpperCase() {
        assertEquals("HELLO", "hello".toUpperCase());
    }
}