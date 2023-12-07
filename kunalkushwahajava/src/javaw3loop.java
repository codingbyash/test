public class javaw3loop {

/*
------------------------------PRINT THIS LOOP-----------------------------------------
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910*/

/*
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<11;i++){
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
*/
/*
----------------QUE-2--------------------PRINT THIS LOOP------------------------
        1
        22
        333
        4444*/
 /*   public static void main(String[] args) {
        int i,j;
        for (i=1;i<5;i++){
            for (j=1;j<=i;j++){
                System.out.print(i);

            }
            System.out.println(" ");
        }
    }*/

/*-------------------QUE-3------------PRINT THIS LOOP--------------------

     1
     2 3
     4 5 6
     7 8 9 10


    public static void main(String[] args) {
        int i,j,k=1;
        for(i=1;i<=5;i++){
            for(j=1;j<i;j++){
                System.out.print(k++);

            }
            System.out.println("");
        }

    }   */
     /* ______________--------------------PRINT THIS PATTERN---------------------------------------_____________________/

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


    public static void main(String[] args) {
        int k=1;
        for (int i=1; i<=6;i++){
            for (int j=1;j<i;j++){
                System.out.print(k+++" ");
            }
            System.out.println("");
        }

}*/
    /*
       1
      2 2
     3 3 3
    4 4 4 4


public static void main(String[] args) {
    for (int row =1;row<=4;row++){
        for (int i=1;i<=4-row;i++){
            System.out.print(" ");
        }
        for (int col=1;col<=row;col++){
            System.out.print(row+ " ");
        }
        System.out.println();


    }
} */
/*
                    *
                   ***
                  *****
                 *******
                *********
               ***********
              *************
               ***********
                *********
                 *******
                  *****
                   ***
                    *

public static void main(String[] args) {
    for (int i=1;i<=13;i++){
        for(int spc=1;spc)



    }





}

 */


/*
    @
    @@
    @@@
    @@@@
    @@@@@
    @@@@@@


public static void main(String[] args) {
    for(int row=1;row<=6;row++){
        System.out.println();
        for(int col=1;col<=row;col++){
            System.out.print("@");
        }

    }

}

 */
/*
         @
        @@
       @@@
      @@@@
     @@@@@
    @@@@@@





    public static void main(String[] args) {

        int row=6;
        int i;
        for(i=1;i<=row;i++) {
            for (int spc = row-i; spc >0; spc--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("@");
            }
            System.out.println();
        }



    }

 */


    /*
     ******
      *****
       ****
        ***
         **
          *

          *

public static void main(String[] args) {
    int row=6;
    for (int i=1;i<=row;i++){
        for(int spc=0;spc<i;spc++)
            System.out.println(" ");
        for(int j=0;j<)
    }
}

     */


    /*
    Square Hollow Pattern
     ******
     *    *
     *    *
     *    *
     *    *
     ******

    public static void main(String[] args) {
        for (int i = 1; i <=6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == 6 || j == 1 || j ==6) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }



    YAHA SE KARNA HAI AUR BHI DEKH ENA SHAYAD ISKE PEHLE BHU QUESRTIONS CHHUTE HONGE

//     */
//    /*                    1
//                         2 2
//                        3 3 3
//                       4 4 4 4
//                      5 5 5 5 5
//                     6 6 6 6 6 6
//
//     */
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int space=5; space>=0;space--){
                System.out.println(" ");

            }

            }
            System.out.println();

        }
  }










