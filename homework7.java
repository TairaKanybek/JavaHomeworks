package homework;
//> **    Write a program to find the greatest number out of three numbers using nested if statement**
//        >
//
//        **Question Type:** Write Code.
//
//        ## Test Data:
//
//        ```java
//        Example 1:
//        Input - 43, 54, 24
//        Output - 54 is the greatest
//        ```
//
//        ```java
//        Example 1:
//        Input - 53, 21, 65
//        Output - 65 is the greatest
//        ```


import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write three different numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
      if(n1>n2 && n1>n3){
          System.out.println(n1+ " is the greatest one");
      }
      else{
          if(n2>n1 && n2>n3){
              System.out.println(n2 + " is the greatest one");
          }
          else{
              System.out.println(n3 + " is the greatest one");
          }
      }

    }
}
