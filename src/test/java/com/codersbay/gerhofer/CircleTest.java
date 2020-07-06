package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircleTest {

    @Test
    @DisplayName("When we make an new Instance of the class with radius = 0 we expect it to throw an exception")
    void newInstanceWithRadiusNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle("circle", 16, true, 0);
        });
    }

    @Test
    @DisplayName("When we make an new Instance of the class with radius < 0 we expect it to throw an exception")
    void newInstanceWithNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle("circle", 16, true, -10);
        });
    }

    @Test
    @DisplayName("When we call getArea() on the testShape class we expect it get")
    void testGetArea01() {
        Shape testShape = new Circle("circle", 16, true, 10);
        assertEquals(Math.round(314.16), Math.round(testShape.getArea()));
    }

    @Test
    @DisplayName("When we call getArea() on the testShape class we expect it to throw an exception")
    void testGetArea02() {
        Shape testShape = new Circle("circle", 16, true, 45);
        assertEquals(Math.round(6361.73), Math.round(testShape.getArea()));
    }

    @Test
    @DisplayName("When we call getPerimeter() on the testShape class we expect it to throw an exception")
    void getPerimeter01() {
        Shape testShape = new Circle("circle", 16, true, 5);
        assertEquals(Math.round(31.42), Math.round(testShape.getPerimeter()));
    }

    @Test
    @DisplayName("When we call getPerimeter() on the testShape class we expect it to throw an exception")
    void getPerimeter02() {
        Shape testShape = new Circle("circle", 16, true, 56);
        assertEquals(Math.round(351.86), Math.round(testShape.getPerimeter()));
    }
}