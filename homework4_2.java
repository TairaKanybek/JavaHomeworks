package homework;

import java.util.Scanner;
//Homework: Scanner.
//Write a credit landing program
//get user input for age, creditscore, marital status

//printout Approved: true
//if user is older than 25
//if user has a creditscore more than 700
//if user is married


//printout Approved: false
//if any of the conditions is wrong

public class homework4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get user input for age
        System.out.print("Please write your age ");
        byte age = input.nextByte();
        System.out.println("Your age is "  + age);

        System.out.print("Please write your credit score");
        int creditScore= input.nextInt();
        System.out.println("Your credit score is "+ creditScore);

        System.out.print("Please write your marital status");
        String maritalStatus= input.next();
        System.out.println ("Your marital status is "+maritalStatus);

        boolean makeAloan= age>=25 && creditScore>700 && maritalStatus.equalsIgnoreCase("married");
        System.out.println(makeAloan);





    }
}
