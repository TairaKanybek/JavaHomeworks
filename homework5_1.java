package homework;
//        Write a Java program that takes three positive integer numbers from the
//        user as input to calculate and output the average of those three numbers.
//        ex:
//        Input 1: 5
//        Input 2: 10
//        Input 3: 15
//        Output: 10
//        Input 1: 23
//        Input 2: 24
//        Input 3: 25
//        Output: 24

import java.sql.SQLOutput;
import java.util.Scanner;

public class homework5_1 {
    public static void main(String[] args) {
        Scanner average = new Scanner(System.in);
        System.out.println("Write down please Input1");
        int a = average.nextInt();
        System.out.println("Write down please Input2");
        int b = average.nextInt();
        System.out.println("Write down  please Input3");
        int c = average.nextInt();
        System.out.println("Output the average of those three numbers");
        int result=(a+b+c)/3;
        System.out.println("Result is "+result);


    }
}
