package que1;

@FunctionalInterface
interface FindGreater{
    boolean execute1(int a,int b);
}

@FunctionalInterface
interface Increment{
    int execute1(int a);
}
@FunctionalInterface
interface Concat{
    String execute1(String a,String b);
}
@FunctionalInterface
interface ToUpper{
    String execute1(String a);
}
public class Source1 {
    public static void main(String[] args) {
        FindGreater f= (int a, int b)->{
            if(a>b) return true;
            else return false;};
        System.out.println(f.execute1(10,20));

        Increment i= (int a)->{return ++a;};
        System.out.println(i.execute1(33));

        Concat c= (String a,String b)->{return a+b;};
        System.out.println(c.execute1("Concat"," this String"));

        ToUpper t=(String a)->{return a.toUpperCase();};
        System.out.println(t.execute1("this is in lower case"));
    }
}
