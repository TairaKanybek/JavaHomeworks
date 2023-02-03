package homework;
//**Write a program to take a day number from the user and print the name of the day from the given number**
//
//
//        **Question Type:** Write Code.
//
//        ## Test Data:
//
//        ```java
//        Input - 0,  Output - Sunday
//        Input - 1,  Output - Monday
//        Input - 2,  Output - Tuesday
//        Input - 3,  Output - Wednesday
//        Input - 4,  Output - Thursday
//        Input - 5,  Output - Friday
//        Input - 6,  Output - Saturday
//        Input - 7,  Output - Invalid Input

import java.sql.SQLOutput;
import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner week=new Scanner(System.in);
        System.out.println("Please write a number from 0 to 7");
        byte s= week.nextByte();

        if(s==0){
            System.out.println("Sunday");}
        else if (s==1) {
            System.out.println("Monday");}
        else if (s==2) {
            System.out.println("Tuesday");}
        else if (s==3) {
            System.out.println("Wednesday");}
        else if (s==4) {
            System.out.println("Thursday");}
        else if (s==5) {
            System.out.println("Friday");}
        else if (s==6) {
            System.out.println("Saturday");}
        else {
            System.out.println("Invalid Input");}

        }
    }


