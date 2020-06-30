package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {

    @Test
    @DisplayName("When we make an new Instance of the class with length or width = 0 we expect it to throw an exception")
    void newInstanceWithRadiusNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("rectangle", 16, true, 0, 15);
        });
    }

    @Test
    @DisplayName("When we make an new Instance of the class with length or width < 0 we expect it to throw an exception")
    void newInstanceWithNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("rectangle", 16, true, -10, 12);
        });
    }

    @Test
    @DisplayName("When we call getArea() on the testShape class we expect it get")
    void testGetArea01() {
        Shape testShape = new Rectangle("rectangle", 16, true, 10, 20);
        assertEquals(Math.round(200), Math.round(testShape.getArea()));
    }

    @Test
    @DisplayName("When we call getArea() on the testShape class we expect it to throw an exception")
    void testGetArea02() {
        Shape testShape = new Rectangle("rectangle", 16, true, 45, 88);
        assertEquals(Math.round(3960), Math.round(testShape.getArea()));
    }

    @Test
    @DisplayName("When we call getPerimeter() on the testShape class we expect it to throw an exception")
    void getPerimeter01() {
        Shape testShape = new Rectangle("rectangle", 16, true, 50, 10);
        assertEquals(Math.round(120), Math.round(testShape.getPerimeter()));
    }

    @Test
    @DisplayName("When we call getPerimeter() on the testShape class we expect it to throw an exception")
    void getPerimeter02() {
        Shape testShape = new Rectangle("rectangle", 16, true, 112, 300);
        assertEquals(Math.round(824), Math.round(testShape.getPerimeter()));
    }
}