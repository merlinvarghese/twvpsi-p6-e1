package com.tw.vapasi;

/**
 * Understands a plane figure with four equal straight sides and four right angles.
 */
class Square {
    private double side;

    Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }
}