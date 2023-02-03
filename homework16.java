package homework;

public class homework16 {
    public static void main(String[] args) {
        System.out.println("======Task1==========");
        // 1. Write a program to print the sum of even numbers from 1 to 10
        int sum = 0;
        int i;
        for (i = 1; i <= 10; i++) {
            if (i != 10) {
                if (i % 2 == 0) {
                    sum = sum + i;
                    System.out.print(i + "+");
                }
            } else {
                sum = sum + i;
                System.out.print(i + "=");
            }
        }
        System.out.println(sum);

        System.out.println("=======Task2==========");
        //2. Write a program to count the number of divisors of the given numbers
        // For example - Number 6 has 4 divisors & 12 has 6 divisors
        int a = 6;
        int count = 0;
        for (int b = 1; b <= a; b++) {
            if (a % b == 0) {
                count++;
                System.out.println(b);
            }
        }
        System.out.println("result is " + count);
        System.out.println("========Task3=========");
        //3. Write a program to find a magic number from 1 to 100,
        //if you divide that number by 5 you will get remainder 4
        //if you divide that number by 4 you will get remainder 3
        //if you divide that number by 3 you will get remainder 2
        //if you divide that number by 2 you will get remainder 1
        int result=0;
        for (int b=1;b<=100;b++){
            if(b % 5 ==4 && b % 4 == 3 && b % 3 ==2 && b % 2 == 1){
                result=b;
            }
        }
        System.out.println(result);
        System.out.println("========Task4=========");
     //   4.  Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
         //-3 -6 -9
        int sum1 =0;//1//3//0//4//9//3//10//18//9
        for (int n=1; n<=10;n++){
              if (n!=3 && n!=6 && n!=9){
                  sum1=sum1+n; //0+1 //1+2//0+4//4+5//3+7//10+8//9+10
              }
              else{
                 sum1 = sum1 - n; //3-3=0//9-6//18-9
            }
        }
        System.out.println(sum1);
        System.out.println("========Task5=========");
        // 5.  Java program to find sum of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5

        int sum2=0;//50
        int p=1;
        for(int o=10;o>5;o--){
            sum2=sum2+o;//44+6
            sum2=sum2+p;//50+5
            p++;//5
        }
        System.out.println(sum2);

        // 6.  Java program to find sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2
        System.out.println("========Task6=========");
        int power = 0;
        int sum3=0;//30
        for(int num1=1;num1<=5;num1++){
            //2*2
            //3*3
            //4*4
            power=num1*num1; //25
            sum3=sum3+power;//30+25
        }
        System.out.println(sum3);

    }
}
