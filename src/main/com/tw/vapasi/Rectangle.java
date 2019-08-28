package com.tw.vapasi;

/**
 * Understands a four-sided flat shape where every angle is a right angle.
 */
class Rectangle {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter(int TWO) {
        return TWO * (length + breadth);
    }
}


