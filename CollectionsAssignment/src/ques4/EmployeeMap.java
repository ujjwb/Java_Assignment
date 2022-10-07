package ques4;

import java.util.*;

public class EmployeeMap {
    public static void main(String[] args) {
        Employee e1=new Employee("emp1","Software Dev",25);
        Employee e2=new Employee("emp2","Software Tester",27);
        Employee e3=new Employee("emp3","Devops Developer",26);
        Employee e4=new Employee("emp4","Marketing Consulatant",35);
        Map<Employee, Integer> map1=new HashMap<>();
        map1.put(e1,480000);
        map1.put(e2,570000);
        map1.put(e3,550000);
        map1.put(e4,520000);
        for(Employee e:map1.keySet()){
            System.out.println(e+" Salary: "+map1.get(e) );
        }
    }
}
