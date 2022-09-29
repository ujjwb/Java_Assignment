package ques4;

public class Employee {
    String name, designation;
    int age;

    public Employee(String name, String designation, int age){
        this.name=name;
        this.designation=designation;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name  +
                " Designation: " + designation + '\'' +
                " Age: " + age ;
    }
}
