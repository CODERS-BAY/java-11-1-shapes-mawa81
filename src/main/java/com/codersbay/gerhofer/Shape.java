package com.codersbay.gerhofer;

public abstract class Shape {
    private String shapeForm;
    private int color;
    private boolean isFilled;

    public Shape(String shapeForm, int color, boolean isFilled) {
        this.shapeForm = shapeForm;
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getShapeForm() {
        return shapeForm;
    }

    public void setShapeForm(String shapeForm) {
        this.shapeForm = shapeForm;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}

