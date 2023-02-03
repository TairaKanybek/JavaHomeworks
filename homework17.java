package homework;

import java.util.Scanner;

public class homework17 {
    public static void main(String[] args) {
        System.out.println("=====Task1===========");
        // Write a program to find sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5
         int sum=0;

         for(int i=1; i<=5;i++){
             sum=sum+(int)Math.pow(i,i);
         }
        System.out.println(sum);

        System.out.println("=====Task2===========");
        //  2. Write a program to find sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
        //Note - Please print the sum in decimal, answer should not be zero
        double result=0;
        for(double a=1;a<=10;a++){
            result+=a/(a+1);
        }
        System.out.println(result);
        System.out.println("=====Task3===========");
//        3. Write a program to print the sum of each digit from the given number
//        Example1
//        Input - 3521
//        Output - 11
//        Example2
//        Input - 5390
//        Output - 17
        System.out.println("Please write number to find sum of every digit");
        Scanner sc=new Scanner(System.in);
         int num = sc.nextInt();
         int b= 0;
         while (num>0){
             b=num+b%10;
             num=num/10;

         }
        System.out.println("Result is "+b);
        System.out.println("=====Task4===========");
        //4.  Write a program to print the greatest digit from the given number
        //Example1
        //Input - 86545
        //Output - Greatest digit is 8
        //Example2
        //Input - 23561
        //Output - Greatest digit is 6
        System.out.println("Please enter number to find the greatest one");
        int num1= sc.nextInt();
        int greatNum=0;
        int k=0;
        while (num1>0){
            k=num1%10;
            if (k>greatNum){
                greatNum=k;
            }
            num1=num1/10;
        }
        System.out.println("Great number is "+greatNum);

        System.out.println("=====Task5===========");
        System.out.println("Please enter number to reverse number");
        //5.  Write a program to print the reverse of the given number
        //Example1
        //Input - 86545
        //Output - 54568
        //Example2
        //Input - 23561
        //Output - 16532
        int num2= sc.nextInt();
        int rev = 0;
        while (num2 >0) {
            rev = rev*10+num2%10;
            num2=num2/10;
        }
        System.out.println(rev);
    }
}
