package com.geometryapp;



public class GeometryApp {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());


        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(4, 5, 6);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        double unitInCM = 100.0;
        double unitInM = convertToMeters(unitInCM, "cm");
        System.out.println(unitInM + " m");

        double area1 = 10.0;
        double area2 = 10.00001;
        System.out.println("Areas are equal: " + GeometryUtils.areEqual(area1, area2));

        Sphere sphere = new Sphere(5);
        System.out.println("Volume: " + sphere.getVolume());
        System.out.println("Area: " + sphere.getArea());
    }
}
