

import java.util.Scanner;

public class onlineprac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = in.nextDouble();

        if (num==0.0){
            System.out.println("Zero");
        }
        else{
            System.out.println("positive or negative");
        }
        if (num<1.0){
            System.out.println("small");
        }
        else if (num>1000000.0) {
            System.out.println("large");

        }


    }


}
