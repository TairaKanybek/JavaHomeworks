package homework;

import java.util.Scanner;

//Create a method that takes a person's height as a double (in meters)
// and returns their height in feet and inches. Google the formula.
public class homework10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write your height in meters");
        double height= sc.nextDouble();
        System.out.println("Your height in feet is: "+heightInFeet(height)+"\n"+"Your height in inch is:  "+heightInInche(height));
    }
    public static double heightInFeet (double height){
        double feet= (height*3.28084);
        return feet;
    }
    public static double heightInInche (double height){

        double inch= (height*39.3701);
        return inch;
    }

    }

