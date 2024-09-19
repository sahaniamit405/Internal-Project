package Encapsulation;

public class Student {
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        setName(name);
        setGrade(grade);
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name == null ) {
            System.out.println("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100.");
        }
        else{
            System.out.println("Grade must be less than 100");
        }
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }


    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Grade: " + grade);
    }

    public static void main(String[] args) {

            Student student1 = new Student("Shubham", 85);
            student1.displayInfo();

            Student student2 = new Student("", 90);
            student2.displayInfo();



            Student student3 = new Student("Rakesh", 105);
            student3.displayInfo();

    }
}
