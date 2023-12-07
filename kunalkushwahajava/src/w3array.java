//packpackage com.company;
//package com.company;
import java.util.Scanner;
import java.util.Arrays;

//public class w3array {

    /*---------------------------- Write a Java program to calculate the average value of array elements----------------------------
    public static void main(String[] args) {
        int sum=0,avg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input length of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("input the elements");
        for (int i=0; i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
            avg=sum/n;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum+" "+avg);
    }*/

//    Write a Java program to test if an array contains a specific value

   /* public static void main(String[] args) {
        int [] arr={12,587,87,4823,874};
        int target=7;
        System.out.println(Search(arr,target));

    }
    public static int Search(int[] arr,int target){
        for (int i=0;i<5;i++){
            if (target==arr[i]){
                return i;
            }
        }
        return 0;


    }*/
    //---------------Write a Java program to remove a specific element from an array------------------------
 /*                              |

                               |
                               |
                               |

                                |
*/
//------------------------------------------------------------   Write a Java program to insert an element in between the array at any specific index-------------------------------------------------------

//.Arrays.
//    .
//            .
//            .
//            .
//            .
//            .
//            .
//            .
//            .
//            .
//            .
//            .
//            .
//            .
//            .
//            .
//            .
//















//    ----------------------------10. Write a Java program to find the maximum and minimum value of an array.------------------------------------------------------
   /*public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the length of array you want");
       int n=sc.nextInt();
       int [] arr=new int[n];
       for (int i=0;i<n;i++)
           arr[i]=sc.nextInt();
       System.out.println(Arrays.toString(arr));
       //for max element of the array
       int max=arr[0];
       int min=arr[0];

       for (int i=1;i<n;i++) {
           if (arr[i]>max){
               max=arr[i];
           }
           if (arr[i]<min){
               min=arr[i];
           }
       }
       System.out.println(max);
       System.out.println(min);

   }*/
//    ----------------------------------11. Write a Java program to reverse an array of integer values------------------------------------
  /* public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the sze of the array you want ");
       int n=sc.nextInt();
       int []arr=new int[n];
       for (int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       System.out.println(Arrays.toString(arr));

       for (int i=0;i<n;i++){
       int temp=arr[i];
       arr[i]=arr[n-i-1];
       arr[n-i-1]=temp;
       }
       System.out.println(Arrays.toString(arr));

   }*/
    /*   public static void main(String[] args) {

               System.out.println("\nJava Version: "+System.getProperty("java.version"));
               System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
               System.out.println("Java Home: "+System.getProperty("java.home"));
               System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
               System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
               System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
           }

 */
   /*-------------------------------12. Write a Java program to find duplicate values in an array of integer values.------------------------------------
   public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.println("enter the length of array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       for (int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       System.out.println(Arrays.toString(arr));

       for (int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if (arr[i]==arr[j] && (i!=j))
               {
                   System.out.println("Duplicate element: "+ arr[j]);
               }
           }
       }
       }

    */
    //-------------------------------12. Write a Java program to find duplicate values in an array of integer values.------------------------------------
  /* public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length of array");
       int n = sc.nextInt();
       String arr[]=new String[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.next();
       }
       System.out.println(Arrays.toString(arr));
       for(int i=0;i<n-1;i++){
           for(int j=i+1; j<n;j++){
               if (arr[i].equals(arr[j]) && (i!=j)){
                   System.out.println("the duplicate value : "+arr[j]);
               }
           }

       }
   }

   */
    /*//Write a Java program to find common elements between two arrays (string values).
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the lenght of array");
       //for the first array
       int n = sc.nextInt();
       String arr[]=new String[n];
       for(int i=0;i<n;i++) {
           arr[i] = sc.next();
       }

       //for the second array
       int m=sc.nextInt();
       String arr2[]=new String[m];
       for(int i=0;i<m;i++){
           arr[m]=sc.next();
       }
       System.out.println(Arrays.toString(arr2));
       System.out.println(Arrays.toString(arr));
       for(int i=0;i<n;i++){
           for(int i=0;i<n-1;i++){
               for(int j=0;j<m;j++){


                   }
               }
           }

       }




   }

     */
   //.------------------------- Write a Java program to remove duplicate elements from an array.----------------------------------------------------------------
//   public static void main(String[] args) {
//       int arr[]={363,363,737,737,299};
//       System.out.println(Arrays.toString(arr));
//       for(int i=0;i<arr.length;i++){
//           for(int i=0;i<arr.length;i++){
//               for(int j=i+1;j<arr.length;j++){
//                   if (arr[i]==arr[j]){


//                   }
//                   remove the element here and then the work wil be done
//               }
//           }
//
//       }
//
//
//
//   }


//}










