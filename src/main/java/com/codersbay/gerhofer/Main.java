package com.codersbay.gerhofer;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Shape c01 = new Circle(
                "Circle01",
                4,
                true,
                15
        );

        System.out.printf("Your %s with the Radius of %.2f cm has an Area of %.2f cm² and a Perimeter of %.2f cm \n\n", ((Circle) c01).getShapeForm(), ((Circle) c01).getRadius(), ((Circle) c01).getArea(), ((Circle) c01).getPerimeter());

        Shape r01 = new Rectangle(
                "Rectangle01",
                5,
                true,
                40,
                70
        );
        System.out.printf("Your %s with the Width of %.2f cm and the Length of %.2f cm has an Area of %.2f cm² and a Perimeter of %.2f cm \n\n", ((Rectangle) r01).getShapeForm(), ((Rectangle) r01).getWidth(), ((Rectangle) r01).getLength(), ((Rectangle) r01).getArea(), ((Rectangle) r01).getPerimeter());

        Shape s01 = new Square(
                "Square01",
                5,
                true,
                60
        );
        System.out.printf("Your %s with the Length of %.2f cm has an Area of %.2f cm² and a Perimeter of %.2f cm \n\n", ((Square) s01).getShapeForm(), ((Square) s01).getLength(), ((Square) s01).getArea(), ((Square) s01).getPerimeter());


    }

}
