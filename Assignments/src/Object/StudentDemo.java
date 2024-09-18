package Object;


public class StudentDemo {
    public static void main(String[] args) {

        Student student1 = new Student("Sarthak", 26, 'A');
        Student student2 = new Student("Dhaksh", 27, 'B');
        Student student3 = new Student("Rupesh", 28, 'C');
        Student student4 = new Student("Raghav", 29, 'C');

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
    }
}

class Student {
    private String name;
    private int age;
    private char grade;

    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}


