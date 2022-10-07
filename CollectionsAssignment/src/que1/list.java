package que1;

import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Float> list1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            list1.add(sc.nextFloat());
        }
        Iterator<Float> it=list1.iterator();
        float sum=0;
        while(it.hasNext()){
            sum = sum + it.next();
        }
        System.out.println("Sum is: "+ sum);
    }
}
