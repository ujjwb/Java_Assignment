package que12;

sealed class Parent permits Child1, Child2{
    public Parent(){
        System.out.println("Parent Sealed Class");
    }
}
final class Child1 extends Parent{
    public Child1(){
        System.out.println("Child1 Class");
    }
}

sealed class Child2 extends Parent permits GrandChild1 {
    public Child2(){
        System.out.println("Child2 Class");
    }
}
non-sealed class GrandChild1 extends Child2{
    public GrandChild1(){
        System.out.println("GrandChild1 Class");
    }
}
public class Source {
    public static void main(String[] args) {
        Child1 ch1= new Child1();
        GrandChild1 g1=new GrandChild1();
    }
}
