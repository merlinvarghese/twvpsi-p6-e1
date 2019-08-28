package com.tw.vapasi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class RectangleTest {
    @Test
    void expectArea15ForLength5Breadth3() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        assertEquals(15.0, rectangle.area());
    }

    @Test
    void expectArea32ForLength8Breadth4() {
        Rectangle rectangle = new Rectangle(8.0, 4.0);
        assertEquals(32.0, rectangle.area());
    }

    @Test
    void expectPerimeter16ForLength4Breadth2() {
        Rectangle rectangle = new Rectangle(4.0, 2.0);
        assertEquals(12.0, rectangle.perimeter());
    }

    @Test
    void expectPerimeter16ForLength5Breadth3() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        assertEquals(16.0, rectangle.perimeter());
    }
}