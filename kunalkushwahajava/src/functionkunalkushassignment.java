import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//
public class functionkunalkushassignment {


/*    //Java program to find the Largest and Smallest of three Integers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("enter b: ");
        int b = sc.nextInt();
        System.out.print("enter c: ");
        int c = sc.nextInt();
        greatest(a,b,c);
        smallest(a,b,c);
    }

    public static void greatest(int a, int b, int c) {
        if (a > b && a > c)
            System.out.println ("a is greatest");
        if (c > b && c > a)
            System.out.println("c is greatest");
        if (b > a && b > c)
            System.out.println ("b is greatest");
    }
    public static void smallest(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println ("a is smallest");
            if (c < b && c < a)
                System.out.println ("c is smallest");
            if (b < a && b < c)
                System.out.println("b is smallest");

        }

    }
    */
  /*  //Java Program to Check if a Given Integer is Odd or Even



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            checkOddOrEven(a);
        }

        public static void checkOddOrEven(int a) {
            if (a % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }

   */

/*
//        Define a method to find out if a number is prime or not.


public static void main(String[] args) {

    Scanner sc= new Scanner (System.in);
    int n=sc.nextInt();
     Prime(n);
}
public static void Prime(int n){
    for(int i=2;i<= Math.sqrt(n);i++){

            if (n%i==0){
                System.out.println("prime");

            }
            else{
                System.out.println("not prime");
            }
        }


        }

 */


  /*  //Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " +  factorial(n));
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

   */

//Write a function to find if a number is a palindrome or not. Take number as parameter.


//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter a number");
//    int n = sc.nextInt();
//    isPalindrome(n);
//}
//    public static boolean isPalindrome(int n){
//    if (n==0) {
//
//
//    }
//        System.out.println();
//
//import java.io.*;
//
//        class GFG
//        {
//
//            // recursive function that
//// returns the reverse of digits
//            static int rev(int n, int temp)
//            {
//                // base case
//                if (n == 0)
//                    return temp;
//
//                temp= (temp*10)+(n%10);
//                return rev(n/10,temp)
//
//            }
//
//
//            public static void main (String[] args)
//            {
//                int n = 121;
//                int temp = rev(n, 0);
//
//                if (temp == n)
//                    System.out.println("yes");
//                else
//                    System.out.println("no" );
//            }
//        }
//
//
//
//
//
//
//
//
//
//
//    }
/*  two numbers is equal to the square of the third number).

    public static void main(String[] args) {
        int a=3,b=4,c=5;
        System.out.println( "is this a pythagorean triplet : "+isPyTrip(a,b,c));
    }
    public static boolean isPyTrip(int a,int b,int c){
        int x=a*a, y=b*b, z=c*c;
        if (x+y==z || y+z==x || z+x==y  ){
            return true;
        }
        else{
            return false;
        }
    }

 */

//    Write a function that returns all prime numbers between two given numbers.
/*
        public static void main(String[] args) {
            Scanner sc= new Scanner (System.in);
            System.out.println("Enter the start");
            int start=sc.nextInt();
            System.out.println("enter the end");
            int end =sc.nextInt();
            List<Integer> primes = findPrimesInRange(start, end);
            System.out.println("Prime numbers between " + start + " and " + end + ": " + primes);
        }
        public static List<Integer> findPrimesInRange(int start, int end) {
            List<Integer> primes = new ArrayList<>();
            // Check each number in the range for primality
            for (int num = start; num <= end; num++) {
                if (isPrime(num)) {
                    primes.add(num);
                }
            }
            return primes;
        }
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            // Check for divisibility from 2 to the square root of the number
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }//copiedcpt

 */

//    public static void main(String[] args) {
//        Scanner sc= new Scanner (System.in);
//        System.out.println("Enter the start");
//        int start=sc.nextInt();
//        System.out.println("enter the end");
//        int end =sc.nextInt();
//        System.out.println("Prime numbers between " + start + " and " + end + ":");
//        findAndPrintPrimesInRange(start, end);
//    }
//    public static void findAndPrintPrimesInRange(int start, int end) {
//        for (int num = start; num <= end; num++) {
//            if (isPrime(num)) {
//                System.out.print(num + " ");
//            }
//        }
//        System.out.println(); // Print a new line after the prime numbers are printed.
//    }
//    public static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        for (int i = 2; i * i <= number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    // printed prIME number between two interval (OWN)
    public static void main(String[] args) {
        int start = 10, end = 50;
        primeNumbers(start,end);

    }

    public static void primeNumbers(int start,int end){
        int i,j;
            for (i = start; i <= end; i++) {
                for (j = 2; j <= i; j++) {
                    if (i % j == 0)
                        break;
                }
                if (i == j)
                    System.out.print(j + ", ");

            }
        }


}






