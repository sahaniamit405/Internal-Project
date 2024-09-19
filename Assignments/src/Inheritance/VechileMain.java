package Inheritance;

 class Vehcile {
    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}


class Car extends Vehcile {

    void start() {
        System.out.println("Car is starting!");
    }


    void stop() {
        System.out.println("Car has stopped.");
    }
}
class Bike extends Vehcile {

    void start() {
        System.out.println("Bike is starting!");
    }


    void stop() {
        System.out.println("Bike has stopped.");
    }
}


public class VechileMain {
    public static void main(String[] args) {
        Vehcile myCar = new Car();
        Vehcile myBike = new Bike();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();
    }
}
