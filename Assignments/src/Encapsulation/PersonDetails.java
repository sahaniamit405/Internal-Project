package Encapsulation;

import java.util.Scanner;


public class PersonDetails {
    private String name;
    private int age;
    private String address;

    public PersonDetails(String name, int age, String address) {
        this.name = name;
        setAge(age);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {

        //Scanner sc= new Scanner(System.in);
       // System.out.println("enter the age");
       // int age=sc.nextInt();

        if (age < 0) {

            System.out.print("Age cannot be negative");
        }
        this.age = age;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }
}
