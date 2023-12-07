import com.sun.jdi.PathSearchingVirtualMachine;

public class Recursionlecturequestions {
    /*

        //PRINT FROM N TO 1
        public static void main(String[] args) {
            printNum(5);
        }
        static void printNum(int n){
            if (n==0){
                return;
            }
            System.out.println(n);
            printNum(n-1);
        }
    */     //PRINTING FROM 1 TO N
/*
    public static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n){
        if (n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);

    }

 */
    //PRINTING FACTORIAL OF A NUMBER
/*
public static void main(String[] args) {
    System.out.print("the fact is: ");
    fact(8);
}
public static void fact(int n){
    int prod=1;
    for (n=n;n>0;n--){
        prod *= n;
    }
    System.out.print(prod);

}
*/
/*    //FACTORIAL USING ANOTHER METHOD
public static void main(String[] args) {
    int ans = fact(6);
    System.out.println(ans);

}
public static int fact(int n){
    if (n <= 1){   //BASE CONDITION TO END THE LOOP
        return 1;
    }
        return (n * fact(n-1));

}

 */
  /*  //SUM OF N NUMBERS
public static void main(String[] args) {
    int ans= sum(10);
    System.out.println(ans);

}

public static int sum(int n){
    if(n<1){ //BASE CONDITION TO END THE LOOP
        return 0;
    }
    return (n+sum(n-1));
}
   */
  /*  //SUM OF DIGITTS IN A NUMBER
    public static void main(String[] args) {
        int ans = digitsum(4234);
        System.out.println(ans);

    }

    public static int digitsum(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + digitsum(n / 10));

    }

   */
 /*   //PRODUCT OF DIGITS IN A NUMBER
    public static void main(String[] args) {
        int ans = digitprod(105);
        System.out.println(ans);
    }
    public static int digitprod(int n) {
        if (n == 0)
            return 1;
        return (n % 10 * digitprod(n / 10));
    }*/
    /*
    //REVERSING A NUMBER
    public static void main(String[] args) {
        int ans=rev(2345);
        System.out.println(ans);
    }
    public static int rev(int n){
        a=
        for(int i=n;i+)
        if (n%10==0)
            return 0;
        return(n%10+ rev(Math.abs(n/10)));

    }*/
    //PRINTING REVERSE USING WAY TWO


    //PRINTING PALINDROME USING THE ABOVE METHOD OF REVERSE


    //COUNTING THE NUMBERS OF ZERO IN THE NUMBER
  /*  public static void main(String[] args) {
        System.out.println((helper(405000500,0)));
    }
    public static int helper(int n,int count){
        while (n>0){
        if (n%10 == 0) {
            count = count +1;
        }
            n = n / 10;
        }
        return count;
    }*/
    //USING RECURSION
    /*
    public static void main(String[] args) {
        System.out.println(count(84004684));

    }
    public static int count(int n){
        return helper(n,0);
    }
    public static int helper(int n , int c){
        if(n==0){
            return c;
        }
        if (n%10==0){
            return helper(n/10,c=c+1);

        }
        return (helper(n/10,c));


    }

     */
    //GIVEN AN INTEGER NUM, RETURN THE NUMBER OF STEPS TO REDUCE IT TO ZERO
    //in one step , if the cuerrent number is even you have to divide it by 2,
    // otherwise you have to subtact 1 from it

    public static void main(String[] args) {
        System.out.println(helper(14,0));

    }
    public static int helper(int n,int step){
        while(n>0){
        if (n%2==0){
            step =+1;

       if (n%2!=0){
            n=n-1;
            step=+1;
           System.out.println(step);

        }}}

       return step; 





    }
}
