package Inheritance;

public class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}


class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

