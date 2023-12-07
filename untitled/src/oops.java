
package com.company;
import java.util.Scanner;
//Create a class Employee with the following properties and methods:
//        Salary (property) (int)
//        getSalary (method returning int)
//        name (property) (String)
//        getName (method returning String)
//        setName (method changing name)

/*class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class oops {
    public static void main(String[] args) {
        Employee1 harry= new Employee1();
        harry.setName("CodeWithHarry");
        harry.salary=234;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

    }

}*/
//question-Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
/*class Cellphone{
    public void vibrate(){
        System.out.println("vibrating...zzz..zzz..zzz");
    }
    public void ring(){
        System.out.println("calling and ringing...tututu...tututu..");
    }
    public void callAsh(){
        System.out.println("calling Ash....");
    }

}

public class oops {
    public static void main(String[] args) {
        Cellphone oppo=new Cellphone();
        oppo.ring();
        oppo.vibrate();
        oppo.callAsh();

    }
}*/



//Create a class Square with a method to initialize its side, calculating area, perimeter etc.
class Square{
    int side;
    public int area(){
        return side*side;

    }
    public int perimeter(){
        return 4*side;
    }

}

public class oops {
    public static void main(String[] args) {
        Square abcd=new Square();
        abcd.side=5;

        System.out.println(abcd.area());
        System.out.println(abcd.perimeter());

    }
}


//    Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc
