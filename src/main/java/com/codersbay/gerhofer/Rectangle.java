package com.codersbay.gerhofer;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String shapeForm, int color, boolean isFilled, double width, double length) {
        super(shapeForm, color, isFilled);
        if (width > 0 && length > 0) {
            this.width = width;
            this.length = length;
        } else {
            throw new IllegalArgumentException("width or height <= 0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double area = width * length;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (2 * width) + (2 * length);
        return perimeter;
    }
}
