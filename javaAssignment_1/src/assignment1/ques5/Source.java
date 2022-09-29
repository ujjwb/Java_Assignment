package assignment1.ques5;
class Employee{
    String firstName, lastName, designation;
    int age;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String designation, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.age = age;
    }
    public Employee(Employee p){
        this.firstName = p.firstName;
        this.lastName = p.lastName;
        this.designation = p.designation;
        this.age = p.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee " + firstName+" "+lastName + " of Age "+ age+ " is working in the company as a "+designation+".";
    }
}


public class Source {
    public static void main(String[] args) {

    }
}
