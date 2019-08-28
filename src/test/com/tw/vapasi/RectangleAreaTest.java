package com.tw.vapasi;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleAreaTest {
    @Test
    public void testRectangleArea3L5B() {
        RectangleArea area = new RectangleArea();

        assertEquals(15, area.computeArea(3, 5));
    }
}
