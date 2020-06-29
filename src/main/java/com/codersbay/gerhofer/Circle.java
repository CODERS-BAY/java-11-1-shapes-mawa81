package com.codersbay.gerhofer;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeForm, int color, boolean isFilled, double radius) {
        super(shapeForm, color, isFilled);
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("radius <= 0");
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
