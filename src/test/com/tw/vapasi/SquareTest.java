package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void expectArea16ForSide4() {
        Square square = new Square(4);
        Assertions.assertEquals(16, square.area());
    }

    @Test
    void expectArea9ForSide3(){
        Square square = new Square(3);
        Assertions.assertEquals(9, square.area());
    }

    @Test
    void expectPerimeter8ForSide() {
        Square square = new Square(4);
        Assertions.assertEquals(16, square.area());
    }

    @Test
    void expectPerimeter9ForSide3(){
        Square square = new Square(3);
        Assertions.assertEquals(9, square.area());
    }
}
