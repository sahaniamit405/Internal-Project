package Inheritance;


public class ShapeMain {
    public static void main(String[] args) {
        Shape shape = new Shape("Red");
        shape.draw();

        Circle circle = new Circle("Blue", 5.0);
        circle.draw();

        ColoredCircle coloredCircle = new ColoredCircle("Green", 3.0, "Striped");
        coloredCircle.draw();
    }
}
