package com.codersbay.gerhofer;

public class Square extends Rectangle {
    public Square(String shapeForm, int color, boolean isFilled, double length) {
        super(shapeForm, color, isFilled, length, length);
    }

    @Override
    public double getWidth() {
        return super.getLength();
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

}
