package assignment1.ques3;

import java.util.Scanner;

public class Source {
    static double cirCircle(double r){
        return 2*3.1415*r;
    }
    static double areaCircle(double r){
        return 3.1415*r*r;
    }
    public static void main(String[] args) {
        System.out.printf("*******MENU*******\n"+
                "1. Calculate Area of Circle\n" +
                "2. Calculate Circumference of a Circle\n" +
                "3. Exit.\n" +
                "Choose an option (1-3): \n");
        Scanner sc= new Scanner(System.in);
        switch(sc.nextInt()){
            case 1:
                System.out.println("Enter Radius: ");
                System.out.println("Area is: "+areaCircle(sc.nextDouble()));
                break;
            case 2:
                System.out.println("Enter Radius: ");
                System.out.println("Circumference is: "+cirCircle(sc.nextDouble()));
                break;
            case 3:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
