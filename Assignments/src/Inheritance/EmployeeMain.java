package Inheritance;

class Employee {
    public String getRole()
    {
        return "Employee";
    }
}


class Manager extends Employee {
    @Override
    public String getRole() {
        return "Manager";
    }
}

class Developer extends Employee {
    @Override
    public String getRole() {
        return "Developer";
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        Employee emp2 = new Developer();

        System.out.println("Role of emp1: " + emp1.getRole());
        System.out.println("Role of emp2: " + emp2.getRole());
    }
}
