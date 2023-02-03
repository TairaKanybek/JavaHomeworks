package homework;

import java.util.Scanner;


//**Write a program to get a salary, age, and loan amount from the user and
//        print how much credit card limit they can avail, based on the following criteria**
//        >
//
//        **Question Type:** Write Code.
//
//        ## Test Data:
//
//        ```java
//        Salary
//        ----------------------------------------------
//        less than 1000              Not Eligible
//        1001 to 5000                limit 10000
//        5001 to 10000               limit 20000
//        greater than 10001          limit 50000
//        ----------------------------------------------
//
//        Age should be greater than or equal to 18
//
//        Loan Amount
//        ---------------------------------
//        less than 5000           No Deduction In Limit
//        greater than 20000       Not Eligible
//        5001 to 20000            Deduct Half Of The Loan Amount From Credit Card Limit
//        ---------------------------------
//
//        Note - If Credit Limit Turns Negative, Print - You Are Not Eligibile
//        ```

public class homework7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eligibile to get credit card");
        System.out.println("Please write your age");
        int age = sc.nextInt();
        System.out.println("Please write your salary");
        int salary= sc.nextInt();
        System.out.println("Please write your loan");
        int loan= sc.nextInt();

        if (age>=18) {
            if(salary<1000){
                System.out.println("Not Eligible");
            }
            else {
                if(salary>1001 && salary<5000) {
                    System.out.println("limit 10000");
                } else if (salary>5001 && salary<10000) {
                    System.out.println("limit 20000");}
                else{System.out.println("limit 50000");}
            }
            if (loan<5000){
                System.out.println("No Deduction In Limit");
            }
            else if (loan>20000){
                System.out.println("Not Eligible");}
            else if (loan>5001 && loan <20000) {
                System.out.println("Deduct Half Of The Loan Amount From Credit Card Limit");}
             }
        else{System.out.println("You Are Not Eligibile"); }


    }
}
