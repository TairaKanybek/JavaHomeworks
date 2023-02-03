package homework;
//2. Write a program that takes an operator (e.g., “+”, “-”, “*”, “/”) and two integers as input,
//        and outputs the result of the operation. Use a switch statement to implement this program.
//        Make sure to consider the possibility of division by zero, and any other edge cases.
//        Sample outputs for input "+ 2 3" would be "5", input "/ 6 2" would be "3", input "* 7 8" would be "56",
//        if we have edge case input "/ 5 0" would be "division by zero is not allowed" or similar message

import java.util.Scanner;

public class homework9_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to online calculator!"+"\n"+"Please write first number:");
        int n1= sc.nextInt();
        System.out.println("Use one of the operators: +,-,*,/ ");
        String operators=sc.next();
        System.out.println("Please write second number:");
        int n2= sc.nextInt();


        switch (operators){
            case "+":
                System.out.println("Your result is " + (n1+n2));break;
            case "-":
                System.out.println("Your result is "+ (n1-n2));break;
            case "*":
                System.out.println("Your result is " + (n1*n2));break;
            case "/":
                if (n2==0){
                    System.out.println("You cant devide to zero");
                }
                else {
                    System.out.println("Your result is " + (n1/n2));
                };break;

            default:
                System.out.println("Error. Try again!");


        }
    }
}
