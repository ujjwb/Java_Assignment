package assignment1.ques1;
class Person{
    static String FirstName, LastName;
    static int age;
    public Person(){
        FirstName="Barry";
        LastName="Allen";
        age=65;
    }
    static {
        FirstName="Harry";
        LastName="Styles";
        age=45;
        System.out.println("\nStatic Block:");
        System.out.println("Name: "+ FirstName + " " + LastName);
        System.out.println("Age: "+ age);
    }
    static void printPerson(){
        System.out.println("\nStatic Function:");
        System.out.println("Name: "+ FirstName + " " + LastName);
        System.out.println("Age: "+ age);
    }
    {
        System.out.println("\nInstance Block:");
        System.out.println("Name: "+ FirstName + " " + LastName);
        System.out.println("Age: "+ age);
    }

}

public class Source {
    public static void main(String args[]){
        Person p= new Person();
        Person.printPerson();
    }
}
