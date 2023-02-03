package homework;
//        Write a program that takes a day of the week as input (e.g., “Monday”),
//        and outputs the number of days until the next weekend (i.e., either Saturday or Sunday).
//        Use a switch statement to implement this program.
//        Sample outputs for input "Monday" would be "5" and input "Friday" would be "2"


import java.util.Scanner;

public class homework9 {
    public static void main(String[] args) {
        byte num=7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a day of the week");
        String days= sc.next();
        switch (days){
            case "Monday": System.out.println("There are "+(num-1)+" until next weekend"); break;
            case "Tuesday": System.out.println("There are "+(num-2)+" until next weekend"); break;
            case "Wednesday": System.out.println("There are "+(num-3)+" until next weekend"); break;
            case "Thursday": System.out.println("There are "+(num-4)+" until next weekend"); break;
            case "Friday": System.out.println("There are "+(num-5)+" until next weekend"); break;
            case "Saturday": System.out.println("There are "+(num-6)+" until next weekend"); break;
            case "Sunday": System.out.println("There are "+(num-7)+" until next weekend"); break;
            default:
                System.out.println("Try again! You wrote something wrong");
        }

    }
}
