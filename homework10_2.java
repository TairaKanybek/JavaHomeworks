package homework;
// Create a method that takes a char representing a grade
// (A, B, C, D, or F) and returns a boolean indicating whether the grade is passing or failing.
// A and B are passing, C,D,F are failing.

import java.util.Scanner;

public class homework10_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write your grade: A,B,C,D");
        char grade=sc.next().charAt(0);
        System.out.println(gradeLetters(grade));
    }
    public static boolean gradeLetters(char grade){
        if (grade=='A' || grade=='B'){System.out.println("You are passing");return true;}
        else if (grade=='C' || grade=='D' || grade=='F'){System.out.println("You are failing");return true;}
        else {System.out.println("Wrong input"); return false;}

    }

}
