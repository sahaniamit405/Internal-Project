package Inheritance;

public class Inheritance {
    public static void main(String[] args) {


        SubChild sc=new SubChild("Nikita");
        sc.display();
        Child child=new Child("Anju");
        child.display();
        Child ch=new SubChild("Naman");//Runtime polymorphism or Upcasting or dynamic method dispatch
        ch.display();

        Parent p=new Child("Aman");
        p.display();


    }

}
abstract class Parent
{
    String name;
    Parent(String name)
    {
        this.name=name;
    }
//	void display()
//	{
//		System.out.println("The name provided in Parent class is "+name);
//	}

    abstract void display();
}
class Child extends Parent
{
    Child(String name)
    {
        super(name);
    }
    void display()
    {
        System.out.println("The name provided in Child class is "+name);
    }
}
class SubChild extends Child
{
    SubChild(String name)
    {
        super(name);
    }
    void display()
    {
        System.out.println("The name provided in SubChild class is "+name);
    }
}

