package Object;

public class Rectangle {
     int length;
     int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }


    public double getPerimeter() {
        return 2 * (length + width);
    }
}
