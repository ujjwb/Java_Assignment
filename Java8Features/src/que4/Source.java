package que4;

import java.util.Arrays;
import java.util.stream.Collectors;

class Employee{
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}
public class Source {
    public static void main(String[] args) {
        Employee e1=new Employee("Sanjay Kumar", (long)3000, "Delhi");
        Employee e2=new Employee("Vijay Bindra", (long)3500, "Delhi");
        Employee e3=new Employee("Ajay Kumar", (long)5700, "Delhi");
        Employee e4=new Employee("Uday Kumar", (long)5000, "Noida");
        Employee e5=new Employee("Vijay Kumar", (long)4500, "Delhi");
        Arrays.asList(e1,e2,e3,e4,e5).stream()
                .filter(e->e.salary<5000)
                .filter(e->e.city.compareTo("Delhi")==0)
                .map(e->e.fullName=e.fullName.split(" ")[0])
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
