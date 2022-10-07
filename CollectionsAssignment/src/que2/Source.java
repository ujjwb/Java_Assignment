package que2;

import java.util.*;

class SalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee employee, Employee t1) {
        if(employee.salary> t1.salary){
            return -1;
        }
        else if(employee.salary==t1.salary){
            return 0;
        }
        else{
            return 1;
        }
    }

}
class Employee implements Comparable<Employee>{
    double age,salary;
    String name;
    public Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }
    @Override
    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);
    }
    @Override
    public String toString(){
        return "Employee Name: "+name+" Age: "+age+" Salary: "+salary;
    }

}

public class Source {

    public static void main(String[] args) {
        Employee e1= new Employee(22,400000, "Marques Brownlee");
        Employee e2= new Employee(23,450000, "Linus Sebastian");
        Employee e3= new Employee(32,800000, "Lewis George");
        Employee e4= new Employee(26,500000, "Rakesh Ahluwalia");
        List<Employee> list1=new ArrayList<>();
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);
        list1.add(e4);
        System.out.println("Natural Order:");
        for(Employee e: list1){
            System.out.println(e);
        }
        System.out.println("\nSorted by Name:");
        Collections.sort(list1);
        for(Employee e: list1){
            System.out.println(e);
        }
        Collections.sort(list1, new SalaryComparator());
        System.out.println("\nSorted by Salary");
        for(Employee e: list1){
            System.out.println(e);
        }

    }
}
