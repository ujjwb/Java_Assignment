package que2;
class Operations{
    int addition(int a, int b ){
        return a+b;
    }
    int subtraction(int a, int b ){
        return a-b;
    }
    static int multiplication(int a, int b ){
        return a*b;
    }
}

interface DoOperations{
    int execute(int a, int b);
}
public class Source {
    public static void main(String[] args) {
        DoOperations d=Operations::multiplication;
        System.out.println(d.execute(20,30));

        d=new Operations()::addition;
        System.out.println(d.execute(30,30));

        d=new Operations()::subtraction;
        System.out.println(d.execute(50,30));
    }
}
