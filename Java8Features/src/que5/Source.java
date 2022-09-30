package que5;

interface Intrfc1{

    default void printDetails(){
        System.out.println("Interface 1");
    }
}

interface Intrfc2{

    default void printDetails(){
        System.out.println("Interface 2");
    }
}
class Default1 implements Intrfc1,Intrfc2{

    @Override
    public void printDetails() {
        Intrfc1.super.printDetails();
        Intrfc2.super.printDetails();
        System.out.println("Child class");
    }
}
public class Source {

    public static void main(String[] args) {
        Default1 d=new Default1();
        d.printDetails();
    }

}
