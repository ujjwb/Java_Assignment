package ques4;

import java.util.Objects;

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
                " Designation: " + designation +
                " Age: " + age +" HashCode: "+this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, designation, age);
    }
}
