package homework;
//Write a to take the opening balance and the account name from the user and
// display the below operations that the user can perform, at the end ask user
// if they want to perform more operations and then continue the same process
// until a user enters ‘NO’
//Output
//Welcome to the ATM Machine
//Please enter your account opening balance: 1000
//Please choose the operations you want to perform
//1) Withdraw
//2) Deposit
//3) Check Balance
//1
//Please enter the amount you want to withdraw: 500
//The available balance is: 500
//Do you want to perform more operations?
//Press 1 for yes, Press 2 for No
//1
//Please choose the operations you want to perform
//1) Withdraw
//2) Deposit
//3) Check Balance
//2
//Please enter the amount you want to deposit: 500
//The available balance is: 1000
//Do you want to perform more operations?
//Press 1 for yes, Press 2 for No
//2

import java.util.Scanner;

public class homework15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String operations;

         System.out.println("Welcome to the ATM Machine");
         System.out.println("Please enter your account opening balance:");

         int balance = sc.nextInt();

      do{System.out.println("Please choose the operations you want to perform");
         System.out.println("1) Withdraw");
         System.out.println("2) Deposit");
         System.out.println("3) Check Balance");

         String choise = sc.next();
         switch (choise.toLowerCase()) {
             case "1":
             case "Withdraw":
             case "1)":
                 System.out.println("Please enter the amount you want to withdraw");
                 int a = sc.nextInt();
                 balance=balance-a;

                 System.out.println("The available balance is: " + (balance));
                 break;
             case "2":
             case "Deposit":
             case "2)":
                 System.out.println("Please enter the amount you want to deposit");
                 int b = sc.nextInt();
                 balance=balance+b;
                 System.out.println("The available balance is: " + (balance));

                 break;

             case "3":
             case "Check Balance":
             case "3)":
                 System.out.println("Current Balance");

                 System.out.println("The available balance is: " + (balance));
                 break;
         }
         System.out.println("Would you like to do more operations?");
         System.out.println("Press 1 for yes, Press 2 for No");
         operations= sc.next();
     } while (operations.equalsIgnoreCase("1"));

         }





    }

