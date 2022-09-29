package assignment1.ques2;
import java.util.Scanner;
public class Source {
    public static void main(String args[]){
        StringBuilder inpt=new StringBuilder();
        String a;
        Scanner sc=new Scanner(System.in);
        while(true) {
            a = sc.nextLine();
            if (a.compareTo("XDONE")==0) {
                System.out.println(inpt.toString());
                break;
            } else {
                inpt.append(a);
                inpt.append(" ");
            }
        }
    }
}
