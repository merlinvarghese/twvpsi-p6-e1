package com.tw.vapasi;

public class RectangleArea {
    private double length;
    private double breadth;
    public RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double area(){
        return  length * breadth;
    }
}
