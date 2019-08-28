package com.tw.vapasi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaTest {
    @Test
    public void expectArea15ForLength5Breadth3() {
        RectangleArea rectangle = new RectangleArea(3.0, 5.0);
        assertEquals(15.0, rectangle.area());
    }

    @Test
    public void expectArea32ForLength4Breadth8() {
        RectangleArea rectangle = new RectangleArea(4.0, 8.0);
        assertEquals(32.0, rectangle.area());
    }

    @Test
    public void expectPerimeter16ForLength4Breadth2() {
        RectangleArea rectangle = new RectangleArea(4.0, 2.0);
        assertEquals(16.0, rectangle.perimeter());
    }
}