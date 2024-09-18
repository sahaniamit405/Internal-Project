package Encapsulation;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        PersonDetails person = new PersonDetails("Santosh", 25, "456 U.P India");
        //Scanner sc= new Scanner(System.in);
       // System.out.println("enter the age");
        //int age=sc.nextInt();

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());

        person.setAge(30);
        System.out.println("Updated Age: " + person.getAge());


    }
}
