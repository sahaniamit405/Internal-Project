package Inheritance;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw() {
        System.out.println("Drawing a shape.");
    }
}
class Circle extends Shape {
  double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void draw() {
        System.out.println("Drawing a circle with radius " + radius + " and color " + getColor() + ".");
    }
}

class ColoredCircle extends Circle {
    String pattern;

    public ColoredCircle(String color, double radius, String pattern) {
        super(color, radius);
        this.pattern = pattern;
    }

    public void draw() {
        System.out.println("Drawing a " + pattern + " colored circle with radius " + getRadius() + " and color " + getColor() + ".");
    }
}

