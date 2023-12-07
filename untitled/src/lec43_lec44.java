
//Create a class Game, which allows a user to play "Guess the Number" game once.
//
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!
package com.company;

import java.util.Scanner;
/*class Game{
    public int takeUserInput(){
        Scanner sc=new Scanner(System.in);
        int num =sc.hasNextInt();
    }
}


public class guess_thegame_43lec {
    public static void main(String[] args) {

    }
}*/

//create a class cylinder and use getter and setters to set its radius and height
class Cylinder{
    private int radius;
    private int height;
    public Cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;

    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public double surfaceArea(){
        return 2* Math.PI *radius * radius + 2*Math.PI*radius*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
    public class Cylinder.lec43_lec44{
        Cylinder mycilinder=new Cylinder(9, 12);
        System.out.println()


    }

}






























