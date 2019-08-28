package com.tw.vapasi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleAreaTest {
    @Test
    public void testRectangleArea3L5B() {
        RectangleArea area = new RectangleArea(3.0, 5.0);
        assertEquals(15.0, area.area());
    }
    @Test
    public void testRectangleArea4L8B() {
        RectangleArea area = new RectangleArea(4.0,8.0);
        assertEquals(32.0, area.area());
    }
}