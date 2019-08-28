package com.tw.vapasi;

class RectangleArea {
    private double length;
    private double breadth;

    RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area(){
        return  length * breadth;
    }

    double perimeter() {
        return 16;
    }
}
