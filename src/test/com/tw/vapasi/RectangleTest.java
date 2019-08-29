package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RectangleTest {

    @Nested
    class RectangleCalculator {
        @Test
        void expectArea15ForLength5Breadth3() {
            Rectangle rectangle = Rectangle.createRectangle(5.0, 3.0);
            assertEquals(15.0, rectangle.area());
        }

        @Test
        void expectArea32ForLength8Breadth4() {
            Rectangle rectangle = Rectangle.createRectangle(8.0, 4.0);
            assertEquals(32.0, rectangle.area());
        }

        @Test
        void expectPerimeter16ForLength4Breadth2() {
            Rectangle rectangle = Rectangle.createRectangle(4.0, 2.0);
            assertEquals(12.0, rectangle.perimeter());
        }

        @Test
        void expectPerimeter16ForLength5Breadth3() {
            Rectangle rectangle = Rectangle.createRectangle(5.0, 3.0);
            assertEquals(16.0, rectangle.perimeter());
        }
    }

    @Nested
    class SquareCalculator {

        @Test
        void expectArea16ForSide4() {
            Rectangle square = Rectangle.createSquare(4);
            Assertions.assertEquals(16, square.area());
        }

        @Test
        void expectArea9ForSide3() {
            Rectangle square = Rectangle.createSquare(3);
            Assertions.assertEquals(9, square.area());
        }

        @Test
        void expectPerimeter8ForSide() {
            Rectangle square = Rectangle.createSquare(4);
            Assertions.assertEquals(16, square.area());
        }

        @Test
        void expectPerimeter9ForSide3() {
            Rectangle square = Rectangle.createSquare(3);
            Assertions.assertEquals(9, square.area());
        }
    }

}