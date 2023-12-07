import java.util.Arrays;
import java.util.Scanner;

public class multidimarray {
    public static void main(String[] args) {

    Scanner in = new Scanner (System.in);


//        int[][] arr = {
//                {1, 2, 3}, {2, 4}, {3, 5, 5, 7}
//        };

       /* int [][] arr = new int [3][3];
        System.out.println(arr.length);

        for (int row =0; row< arr.length; row++) {
            for (int col =0; col< arr[row].length; col++){
                arr[row][col] =in.nextInt();
            }
        }
        for (int row=0;row<arr.length;row++){
            for (int col=0 ; col < arr[row].length; col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }*/
//        METHOD TWO USING TOSTRING METHOD
        /*int  [] [] arr = new int[3][3];
        System.out.println(arr.length);
        System.out.println("enter");
        for (int row=0;row<arr.length;row++){
            {
                for (int col=0;col<arr[row].length;col++){

                    arr[row][col]=in.nextInt();
                }
            }
        }
        for (int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }*/
        int  [] [] arr = new int[3][3];
        System.out.println(arr.length);
        System.out.println("enter");
        for (int row=0;row<arr.length;row++){
            {
                for (int col=0;col<arr[row].length;col++){

                    arr[row][col]=in.nextInt();
                }
            }
        }
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }




    }


}




