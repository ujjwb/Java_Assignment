package que8;

class Employee implements AutoCloseable{

    public void display(){
        System.out.println("Displaying Employee");
    }

    @Override
    public void close() throws Exception {
        System.out.println("In Close Method");
    }
}

public class Source {
    public static void main(String[] args) throws Exception {
        System.out.println("Main method");

        Employee e = new Employee();
        Employee e1=new Employee();
        try(e;e1){
            e.display();
            e1.display();
        }
    }
}
