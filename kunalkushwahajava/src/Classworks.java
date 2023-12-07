
import com.sun.source.tree.Tree;

import javax.naming.StringRefAddr;
import java.awt.print.Printable;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.*;

//public class Classworks {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        for( int i = 0; i < x; i++){
//            for(int z = 0; z < i; z++ ){
//                System.out.print(" ");
//            }
//            for( int j = x; j > i ; j-- ){
//                System.out.print("#");
//            }
//            System.out.println();
//        }

//        int  i = 0;
//        while( i < x ){
//            int j = 0;
//            while( j < i){
//                System.out.print(" ");
//                j++;
//            }
//            int z = x;
//            while( z >i ){
//                System.out.print("#");
//                z--;
//
//            }
//            i++;
//            System.out.println();
////        }
//        int ans = 0;
//        while(x!=0){
//            ans*=10;
//            ans += x%10;
//            x= x/10;
//
//        }
//        System.out.println(ans);
//        if( x == ans){
//            System.out.print("true");
//        }
//        else{
//            System.out.print("false");
//        }
//        int ans = 0;
//        int count = 0;
//        while(x>0){
//            ans= ans*10;
//            count++;
//            x= x/10;
//        }
//        System.out.println(count);
//        int fans =0;
//        while(x>0){
//            fans= ans*10;
//            fans = ans**count;
//            x= x/10;
//        }
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        int arr[][] = new int[x][y];
//
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                arr[i][j] = sc.nextInt();
//
//            }
//        }
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                System.out.print(arr[i][j]);
//
//            }
////            System.out.println();
//
//        }

//    Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y =sc.nextInt();
//        int arr[][] = new int[3][];
//
//        arr[0] = new int[3];
//        arr[1] = new int[2];
//        arr[2] = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        int sum = 0;
//        System.out.println("Array elements are");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//                sum += arr[i][j];
//            }
//            System.out.println();
//        }
//
//        int num[] ={1,2,3,4,5};
//        int clone[] =num;//same hash codes because it is just a reference, not actual copy of the array;


//        int clone[] = num.clone();


//        clone[2] =7;
//        num[3] = 87;
//
//        for(int i = 0; i< clone.length;i++){
//            System.out.print(clone[i]+" ");
//        }
//        System.out.println(clone.hashCode());
//        System.out.println(num.hashCode());


//public static class Overload{

//    static void sum(int a){
//        System.out.println(a+10);
//    }
//    int sum(int a, int b){
//        int c = a+ b;
//        return c;
//    }
//    void sum(double d){
//        System.out.println(d+10);
//    }
//    double sum(double d1, int a1) {
//        return (double) (d1 + a1);
//    }
//    public static void main(String[] args) {
//        Classworks o =new Classworks();
//
//        System.out.println(o.sum(10,10));
//        o.sum(10d);
//        sum(10);
//        System.out.println(o.sum(10d,10));

//    int id, year;
//    String name, mob, colg;
//    Classworks(String mob, String colg, int year){
//        this.mob =mob;
//        this.colg =colg;
//        this.year =year;
//
//    }
//    Classworks(int id, String name){
//        this("8767887676786", "lpu", 2036);
//        this.id = id;
//        this.name = name;
//    }
//public static void main(String[] args) {
//        Classworks s = new Classworks(101, "John");
//    System.out.println("student info: --");
//    System.out.println("name: "+s.name +" id: "+s.id+ " contact "+ s.mob+" college "+s.colg+" year: "+s.year);
//
//
//}

/*  public static void main(String[] args) {
      String s = "TX1232TX6Month32746TX";
      String t = "Month";
      int j =2;
      System.out.println(s.substring(j));
      System.out.println(s.substring(s.indexOf(t)));


      int i = s.lastIndexOf("TX");
      String s3= s.substring(2,i);
      System.out.println(s.lastIndexOf("TX"));
  }*/
//INITIALAIZERS
/*    private int z;
    {
        System.out.println("initialiser before def constructor");
    }
    Classworks() {
        System.out.println("def constructor");
    }
    Classworks(int a) {
        System.out.println(a);
    }
    {
        System.out.println("initialiser after constructor");
    }
    public static void main(String[] args) {
        Classworks c =new Classworks();
        Classworks d =new Classworks(10);
    }*/

//multiple inheritance
  /*  class A {
        void d1() {
            System.out.println("This is the base class");
        }
    }

    class B extends A {
        void d2() {
            System.out.println("derived class b");
        }
    }

    class C extends B {
        void d3() {
            System.out.println("derived class c");
        }

    }

    public class Classworks {//main class hai ye

        public static void main(String[] args) {
            C obj1 = new C();
            obj1.d1();
            obj1.d2();
            obj1.d3();
        }
    }*/

//heirarchichal inheritance
/*class Base{
    int d1(int a,int b){
        System.out.println("base class");
        return a+b;
    }
}
class A extends Base{
    int d2(int a, int b){
        System.out.println("der class 1");
        return a % b;

    }
}

class B extends Base{
   int d3(int a, int b){
         System.out.println("der class 2");
         return a/b;

    }
}
class Classworks{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 =sc.nextInt();
        A obj1=new A();
        B obj2=new B();

        System.out.println(obj1.d1(num1,num2));//can be called by both obj1 nd obj2
        System.out.println(obj1.d2(num1,num2));
        System.out.println(obj2.d3(num1,num2));

    }
}*/
/*
class Person {
    public String a;
    public String b;
    void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("base class a: ");
        String a = sc.next();
        System.out.println("base class b: ");
        String b = sc.next();
    }
    void setInfo() {
        System.out.println(a);
        System.out.println(b);
    }
}

class Student extends Person{
    private String a;
    private String b;
    void getInfo(){
        super.getInfo();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("der class a: ");
//        String a = sc.next();
//        System.out.println("der class b: ");
//        String b = sc.next();
    }
    void setInfo(){
        System.out.println(a);
        System.out.println(b);

    }
}
*/



/*
class Student{
    int id;
    String name;
    public void setData(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void displayData() {
        System.out.println("ID: " + id);
        System.out.println("name: " + name);
    }
    }
    class Marks extends Student{
    float jmarks;
    float cmarks;
    public void setMarks(float jmarks, float cmarks){
        this.jmarks=jmarks;
        this.cmarks=cmarks;
    }
    public void displayMarks(){
        System.out.println("java marks: "+jmarks);
        System.out.println("cpp marks: "+cmarks);
    }
}



class classworks extends Marks{
    float total, avg;
    public void compute() {
        total = jmarks + cmarks;
        avg = total /2;
    }
    public void showResult(){
        System.out.println("total: "+total);
        System.out.println("avg: "+ avg);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int id =sc.nextInt();
        int jmarks =sc.nextInt();
        int cmarks =sc.nextInt();
        Classworks obj = new Classworks();



    }*/
/*public class Classworks {
    static void add(int x, int y){
        System.out.println(x+y);
    }
    static void add(int x, float y){
        System.out.println(x+y);
    }
    static void add(float x, float y){
        System.out.println(x+y);
    }
    static void add(float x, double y, double z){
        System.out.println(x+y+z);
    }

public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
//        int a =sc.nextInt();
//        int b =sc.nextInt();
//        int c =sc.nextInt();
//        float d =sc.nextFloat();
//        double e =sc.nextDouble();
//        double f =sc.nextDouble();
        int a = Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        int c =Integer.parseInt(args[2]);
        float d =Float.parseFloat(args[3]);
        double e =Double.parseDouble(args[4]);
        double f =Double.parseDouble(args[5]);
        add(a,b);
        add(b,c);
        add(c,d);
        add(d,e,f);
        }*/



        //class name is box, height, depth and width, data type is double,three overloaded constructors are there , first is default constructor(initializes all the members by -1),
//second is parameterized cons(only one para length,a dn initialise all three parameter by length), third cons is three parametered (height, width and depth initialised separately),
    //one method is volume (type is double), main method of box class assumes either zero argument, one argument or three arguments, zero argument results volume is -1.0,
/*    //1 argument results =volume of cube, three arguments results volume of cuboid
class Classworks{
    double height, depth, width;

    Classworks(){
        height =-1;
        depth =-1;
        width =-1;
    }
    Classworks(double length){
        height =length;
        depth =length;
        width =length;
    }
    Classworks(double a, double b, double c){
        height = a;
        depth = b;
        width =c;
    }
    double volume(){
        return height * width * depth;

    }


    public static void main(String[] args) {
        if(args.length == 0){
            Classworks b = new Classworks();
            System.out.println("volume with 0 argument: "+ b.volume());
        }
        else if(args.length == 1){
            double d =Double.parseDouble(args[0]);
            Classworks b1 = new Classworks(d);
            System.out.println("with 1 argument: "+ b1.volume());
        }
        else if(args.length == 3){
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            Classworks b2 =new Classworks(a,b,c);
            System.out.println("with three args: "+ b2.volume());
        }


}*/
/*

class Works {

    float calcInt(float p, int t) {
        return 0;
    }

    class SBI extends Works {
        private static final float intrate = 10.5f;

        float calcInt(float p, int t) {
            return (p * intrate * t) / 100;
        }
    }

    class AXIS extends Works {
        private static final float intrate = 12.5f;

        float calcInt(float p, int t) {
            return (p * intrate * t) / 100;

        }
    }

    class ICICI extends Works {
        private static final float intrate = 15f;

        float calcInt(float p, int t) {
            return (p * intrate * t) / 100;
        }
    }
}

    public class Classworks{


    public static void main(String[] args) {

    }
}

*/
/*
 class Object {}
  public class Classworks {
      public static void main(String[] args) {
          String obj = new String("hey");
          Class c = obj.getClass();
          System.out.println("class: "+c.getName());
      }
  }
*/

/*interface Printable{
    void print();
        }

        class C implements Printable {
            public void print() {
                Scanner sc = new Scanner(System.in);
                System.out.println("first: ");
                int a = sc.nextInt();
                System.out.println("second: ");
                int b = sc.nextInt();
                System.out.println("entered " + a + "and" + b);



            }
        }

public class Classworks {
    public static void main(String[] args) {
        Printable printable = new C();
        printable.print();
    }
}*/

/*


interface Printable {
    void print();
}

class C implements Printable {
    public void print() {
        Scanner sc = new Scanner(System.in);
        System.out.println("first: ");
        int a = sc.nextInt();
        System.out.println("second: ");
        int b = sc.nextInt();
        System.out.println("entered " + a + " and " + b);
    }
}

public class Classworks {
    public static void main(String[] args) {
        Printable printable = new C();
        printable.print();
    }
}
*/
/*

interface Bank{
    float calcInterest(){
        return 0;
    }
}

class SBI implements Bank{
    private float interestRate = 10.8f, p=1000, t=2;
 float calcInterest() {
        return 0;
    }
}
class Axis implements Bank{
            private float interestRate = 12.8f, p=1000, t=2;

}
public class Classworks implements Bank{
    Bank obj  = new Bank();
    Bank o2 = new SBI();
    Bank o3 = new Axis();

        }


*/


/*

interface A1{
    int pixel = 720;
    public void camera();
}
interface A2{
    int color = 38;
    public void design();

}
class CLassworks implements A1,A2{
    public void camera(){
        int color = pixel*200;
        System.out.println("supported colors"+color);
    }
    public void design(){
        int pixel = color*300;
        System.out.println("supported pixel"+pixel);
    }

}
*/

//interface A1{
//    int pixel = 720;
//    public void camera();
//}
//interface A2 extends A1{
//    int color = 38;
//    public void design();
//
//}
//class CLassworks implements A1,A2{
//    public void camera(){
//        int color = pixel*200;
//        System.out.println("supported colors"+color);
//    }
//    public void design(){
//        int pixel = color*300;
//        System.out.println("supported pixel"+pixel);
//    }
//
////}
//interface I5{
//    String display(int a,int b);
//        }
//
//public class Classworks {
//    public static void main(String[] args) {
//        I5 obj = (a,b) -> {System.out.println(a+b);
//        };
//        obj.display(6,8);
//
//
//    }
//}
/*interface I7{
    String display(String a);
        }

public class Classworks {
    public static void main(String[] args) {
        I7 obj = (a) -> {return"hello "+a;
        };
        I7 obj2 = (a) ->{return" hoyy"+a;
        };
        String ab = obj.display("world");
        String ab2 = obj2.display("world");
        System.out.println(ab);
        System.out.println(ab2);


    }
}*/
//create a java program to implement lambda expression to find factorial of a given number
/*


interface I {
    long fact(long n);
}

public class Classworks {
    public static void main(String[] args) {
        I obj = n -> factorial(n);

        int number = 5;
        int result = (int) obj.fact(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    static long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
*/


/*
//WRITE A JAVA PROGRAM TO IMPLEMENT LAMBDA EXPRESSION TO SORT A LIST IN THE ALPHABETICAL ORDER
import java.util.List;
import java.util.Arrays;

public class Classworks {
    public static void main(String[] args) {
        List<String> obj = Arrays.asList("hello", "world", "study", "java");

        obj.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println(obj);
    }
}

*/

/*
class Classworks{
    private static int a=10;
    private static int b=20;
    static void message(){
        System.out.println("Outer class message: "+b);
    }
    static class NestedClass {
        void display(){
            message();
            System.out.println("Inner class message: "+a);
        }
    }
    public static void main(String[] a) {
        Classworks o = new Classworks();
        Classworks.NestedClass o1 = new Classworks.NestedClass();
        o1.display();
    }
}*/
/*

public class Classworks{
    private String name;
    public Classworks(String name){
        this.name = name;
    }
    class Prefixer{
        private String prefix;
        private Prefixer(String prefix){
            this.prefix = prefix;
        }
        public String getCompleteName(){
            return prefix + " " + name;
        }
    }

    public static void main(String[] args) {
        Classworks c = new Classworks("Ash");
        Classworks.Prefixer pre
    }"{"
    }
*/
/*public class Classworks{
    int x = 10;
    static int y = 20;
    void demo(){
        int z = 30;
        System.out.println("local class loaaing");
        class Local{
            int a = 10;
            void myLoacal(){
                System.out.println("x : "+x);
                System.out.println("y: "+y);
                System.out.println("z: "+z);
                System.out.println("a: "+a);
            }
        }
        Local l = new Local();
//        z++;
        l.myLoacal();
    }

    public static void main(String[] args) {
        Classworks c = new Classworks();
        c.demo();

    }*/
   /* public class Classworks {
        int x = 10;
        static int y = 20;

        void demo() {
            int z = 30;
            for (int i = 0; i < 2; i++) {
                System.out.println("local class loaaing");
                class Local {
                    int a = 10;

                    void myLoacal() {
                        System.out.println("x : " + x);
                        System.out.println("y: " + y);
                        System.out.println("z: " + z);
                        System.out.println("a: " + a);
                    }
                }
                Local l = new Local();
//        z++;
                l.myLoacal();
            }
        }

        public static void main(String[] args) {
            Classworks c = new Classworks();
            c.demo();

        }
    }*/
    //outer class, with n number input from user , check whwther the number is even ir odd if the number is even,print
// msg using local l=class ,els eif num is odd print msg using u=amother loi9acal  clAsss
/*
public class Classworks{
        private int a;

        class Local{

        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            Local

        }
        else{

        }

    }*/



/*

public class Classworks{
    private String name;
    private int age;
    private String addres;
   Classworks(String name, int age,String addres){
       this.name=name;
       this.age=age;
       this.addres=addres;
   }
   void showInfo(){
       System.out.println("name : "+name+",age : "+age+",add : "+addres);
   }

    protected void finalize(){
        System.out.println("agarbage invoked and removed");


    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name=sc.next();
       int age=sc.nextInt();
        String adress=sc.next();

        Classworks c =new Classworks(name,age,adress);
        Classworks d = new Classworks("Ankit",4,"pjb");
        d.showInfo();

        c.showInfo();

        d=null;
        c=null;
        System.gc();

        c.showInfo();//now it will genarete nullPointerException




    }
*/
/*
class Classworks extends Thread{
    public void run(){
        System.out.println("thread is created");
    }

    public static void main(String[] args) {
        Classworks c =new Classworks();
        c.start();
    }



}*/
/*class Classworks implements Runnable{
    public void run(){
        System.out.println("thread is created");
    }

    public static void main(String[] args) {
        Runnable t1= new Classworks();
        Thread c =new Thread(t1);

        c.start();
    }



}*/
/*public class Classworks {
    public static void main(String[] args) {
        Runnable t1 = () -> System.out.println("thread is created");
        Thread c = new Thread(t1);

        c.start();
    }
}*/

/*
public class Classworks implements Runnable {
    public static void main(String[] args) {
        Runnable t1 = new Classworks() {
            public void run() {
                System.out.println("Thread started");
            }
        };

        Thread c = new Thread(t1);
        c.start();
    }
    public void run() {
        // Implement the run method
    }
}

*/
import java.io.*;
//public class Classworks {
//    public static void main(String[] args) {
//
//        try{
//            int a =5, b = 0;
//            System.out.println(a/b);
//        }
//        catch (ArithmeticException e){
////            System.out.println(e);//outpt: java.lang.ArithmeticException: / by zero
////            e.printStackTrace();
////            System.out.println(e.toString());//same as sout e
//            System.out.println(e.getMessage());//only msg not class / by zero
//
//
//        }
//
//    }
//}

//declare one int array
   /*     public class Classworks {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3, 4};
            System.out.println(arr[5]);
            String str = null;
            System.out.println(str.length());
            String str1 = "Ash";
            int a = Integer.parseInt(str1);
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch(NumberFormatException n){
            System.out.println(n);
        }

        System.out.println("end of prog");

    }
}
*/
/*
public class Classworks {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        try {

                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException a) {

            }

        try {
            String str = null;

                System.out.println(str.length());
            } catch (NullPointerException n) {
                System.out.println("Null Pointer Exception: " + n);
            }

        try {
            String str1 = "Ash";
                int a = Integer.parseInt(str1);
            } catch (NumberFormatException nf) {
                System.out.println("Number Format Exception: " + nf);
            }


        System.out.println("End of program");
    }
}*/

/*public class Classworks {
    public static void somemethod(){
     somemethod();
    }
    public static void main(String[] args) {
        try{
            somemethod();
        }catch(StackOverflowError s){
            System.out.println(s);
        }

    }


}*/
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
/*

public class Classworks {
    public static void main(String[] args) {
        File file = new File("File.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello world");
            writer.close();

            FileReader reader = new FileReader(file);
            int character;
            System.out.println("Contents of the file \"" + file.getName() + "\":");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
*/


/*
public class Classworks {
    public static void main(String[] args) {
        String fileName = "File.txt";
        String textToAppend = " - Appended text";

        try {
            FileWriter writer = new FileWriter("File.txt", true); // Set the second parameter to true for append mode
            writer.write(textToAppend);
            writer.close();
            System.out.println("Text appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}*/
/*

public class Classworks{
    public static void main(String[] args) {
        File f = new File("File.txt");
        if(f.delete()){
            System.out.println("Deleted");
        }
        else{
            System.out.println("doesnt exist");
        }
    }

}
*/
/*
import java.io.*;
import java.nio.file.*;

public class Classworks {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("This is appended text\n");
        for (int i = 2; i <= 10; i++) {
            sb.append("file was written at " + i + " times \n");
        }

        Reader r = new StringReader(sb.toString());
        String outputFileName = "characterStreamdemo.txt";
        try (FileWriter fw = new FileWriter(outputFileName)) {
            char[] chararr = new char[512];
            int charsread = 0;
            while ((charsread = r.read(chararr)) != -1) {
                fw.write(chararr, 0, charsread);
            }
        }

        Path outputFilePath = Paths.get(outputFileName);
        byte[] contentArr = Files.readAllBytes(outputFilePath);
        System.out.println(new String(contentArr));
    }
}
*/
/*
import java.io.*;
import java.util.*;

public class Classworks {
    public static void main(String[] args) {
        try {
            File fp = new File("src/ab.txt");
            Scanner sc = new Scanner(fp);
            double sum = 0, count = 0;
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;

            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                String[] val = str.split(",");
                for (String itr : val) {
                    double num = Double.parseDouble(itr.trim());
                    sum += num;
                    count++;
                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                }
            }
            System.out.println(sum + " " + min + " " + max);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
*/

import java.io.*;
//
//public class Classworks {
//    public static void main(String[] args) {
//        String file1Path = "file1.txt";
//        String file2Path = "file2.txt";
//        String mergedFilePath = "mergedFile.txt";
//
//        mergeFiles(file1Path, file2Path, mergedFilePath);
//    }
//
//    public static void mergeFiles(String file1Path, String file2Path, String mergedFilePath) {
//        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
//             BufferedReader reader2 = new BufferedReader(new FileReader(file2Path));
//             BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFilePath))) {
//
//            String line;
//            while ((line = reader1.readLine()) != null) {
//                writer.write(line);
//                writer.newLine();
//            }
//
//            while ((line = reader2.readLine()) != null) {
//                writer.write(line);
//                writer.newLine();
//            }
//
//            System.out.println("Files merged successfully!");
//
//        } catch (IOException e) {
//            System.out.println("An error occurred while merging the files: " + e.getMessage());
//        }
//    }
//}
/*
import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;

public class Classworks {
    public static void main(String[] args) {
        try {
            merged("src/a.txt", "src/b.txt", "src/ab.txt");
        } catch (Exception e1) {
        }
    }

    static void merged(String a, String b, String ab) {
        try {
            BufferedReader r1 = new BufferedReader(new FileReader(a));
            BufferedReader r2 = new BufferedReader(new FileReader(b));
            BufferedWriter w1 = new BufferedWriter(new FileWriter(ab));
            String s1, s2;
            while ((s1 = r1.readLine()) != null && (s2 = r2.readLine()) != null) {
                w1.write(s1);
                w1.write(s2);
                w1.newLine();
            }
            w1.close(); // Close the BufferedWriter
        } catch (IOException e) {
        }
    }
}*/

//GENERICS

/*

        class fun<T>
        {
            T a;
            void fun1(T b){
                a=b;
                System.out.println(a);
            }
        }
public class Classworks {
    public static void main(String[] args) {
            fun<Integer> obj = new fun<Integer>();
            fun<String> obj2 = new fun<String>();
            obj.fun1(5);
            obj2.fun1("Abc");


    }
    }
*/
/*
       class fun<T,U>
        {
            T a;
            U b;
            void fun1(T c ,U d){
                a=c;
                b=d;
                System.out.println(a+" "+b);
            }
        }
public class Classworks {
    public static void main(String[] args) {
            fun<Integer,String> obj = new fun<Integer,String>();
            fun<String,Integer> obj2 = new fun<String,Integer>();
            obj.fun1(5,"Abc");
            obj2.fun1("Abc",68);


    }

}*/
/*

       class fun
       {

       <T> void genericDisplay(T element)
        {
                System.out.println(element.getClass().getName()+" = "+element);
            }
        }
public class Classworks {
    public static void main(String[] args) {
        fun obj = new fun();
        obj.genericDisplay(10);
        obj.genericDisplay("Mukesh");
        obj.genericDisplay('A');
        obj.genericDisplay(1.0);


    }

}        }*/

   /* public static void main(String[] args) {
        Map<String,String>mp = new LinkedHashMap<>();
        mp.put("123","Abc");
        mp.put("124","c");
        mp.put("125","Ac");
        mp.put("12","bc");
        System.out.println(mp);
        System.out.println(mp.get("12"));



    }*/
  /* public static void main(String[] args) {
        Map<String,ArrayList<String>>mp = new HashMap<String,ArrayList<String>>();
        mp.put("Ford",new ArrayList<String>());
        mp.get("Ford").add("GT");
        mp.get("Ford").add("Mustang");
        mp.get("Ford").add("Pantera");
       System.out.println("size1: "+mp.size());


       mp.put("Maruti",new ArrayList<String>());
       mp.get("Maruti").add("Swift");
       mp.get("Maruti").add("Alto");
       mp.get("Maruti").add("ciaz");
       System.out.println("size2: "+mp.size());


       System.out.println(mp);
       System.out.println(mp.get("Ford"));
       mp.clear();
       System.out.println("size3: "+mp.size());

    }
    //create one list in form of key and value pair, implement using Treemap and display the list(key is parameter type string , value is the parameter type integer)
main*/
/*

//import java.util.TreeMap;
class Bankaccount <T extends Number>
{
    public void display(T[] t1){
        for (T i: t1) {
            System.out.println(i+ " ");

        }
    }
}

public class Classworks {
    public static void main(String[] args) {
        Bankaccount <Number> b1 = new Bankaccount<>();
        Integer[] m1 = {100,200,344};
        Double[] m2 = {20.0,45.9,12.76,87.7};
        b1.display(m1);
        b1.display(m2);


    }
}
*/
/*
class Animal {
    public void eat(){
        System.out.println("Animals eatig");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
}
class Rat extends  Animal{
    public void eat(){
        System.out.println("Rat is eating");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("Cat is eating");
    }
}
public class Classworks {
    public static void feedAnimal(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        List<Rat> rats = new ArrayList<>();
        rats.add(new Rat());
        rats.add(new Rat());
        feedAnimal(rats);
        feedAnimal(cats);
        feedAnimal(dogs);
    }*/
import java.util.*;

public class Classworks {

    public static List<Integer> getPossibleDigits(Map<Integer, String> validDigits, String fd) {
        List<Integer> potd = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : validDigits.entrySet()) {
            int mismatches = 0;
            String pattern = entry.getValue();

            for (int i = 0; i < fd.length(); i++) {
                if (fd.charAt(i) != pattern.charAt(i)) {
                    mismatches++;
                }
            }

            if (mismatches <= 1) {
                potd.add(entry.getKey());
            }
        }

        return potd;
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);

        List<String> segd = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            segd.add(scanner.nextLine().strip());
        }

        List<String> placementlelo = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            placementlelo.add(scanner.nextLine().strip());
        }

        Map<Integer, String> digp = new HashMap<>();

        for (int digit = 0; digit < 10; digit++) {
            StringBuilder pattern = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                pattern.append(segd.get(row).substring(digit * 3, (digit + 1) * 3));
            }
            digp.put(digit, pattern.toString());
        }

        List<List<Integer>> possibleNumbers = new ArrayList<>();

        for (int i = 0; i < placementlelo.get(0).length() / 3; i++) {
            StringBuilder fd = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                fd.append(placementlelo.get(row).substring(i * 3, (i + 1) * 3));
            }

            List<Integer> matchingDigits = getPossibleDigits(digp, fd.toString());

            if (matchingDigits.isEmpty()) {
                System.out.print("Invalid");
                return;
            }
            possibleNumbers.add(matchingDigits);
        }

        int totalSum = 0;
        for (List<Integer> combination : getCombinations(possibleNumbers)) {
            StringBuilder number = new StringBuilder();
            for (int digit : combination) {
                number.append(digit);
            }
            totalSum += Integer.parseInt(number.toString());
        }

        System.out.print(totalSum);
    }

    public static List<List<Integer>> getCombinations(List<List<Integer>> possibleNumbers) {
        List<List<Integer>> result = new ArrayList<>();
        gch(possibleNumbers, 0, new ArrayList<>(), result);
        return result;
    }

    private static void gch(List<List<Integer>> possibleNumbers, int index, List<Integer> curcom, List<List<Integer>> result) {
        if (index == possibleNumbers.size()) {
            result.add(new ArrayList<>(curcom));
            return;
        }

        for (int digit : possibleNumbers.get(index)) {
            curcom.add(digit);
            gch(possibleNumbers, index + 1, curcom, result);
            curcom.remove(curcom.size() - 1);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
