package Constructor;

public class CarDetails {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.displayDetails();
        Car car2 = new Car("Ford", "Mustang", 50000000);
        car2.displayDetails();
    }
}

class Car {

     String brand;
    String model;
     int price;


    public Car() {
        brand = "Unknown";
        model = "Unknown";
        price = 0;
    }


    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println();
    }
}


