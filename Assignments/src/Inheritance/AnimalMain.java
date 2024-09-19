package Inheritance;

public class AnimalMain {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        System.out.print("Dog sound: ");
        myDog.makeSound();

        System.out.print("Cat sound: ");
        myCat.makeSound();
    }
}
