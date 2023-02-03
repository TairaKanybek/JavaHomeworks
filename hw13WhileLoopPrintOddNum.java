package homework;

public class hw13WhileLoopPrintOddNum {
    public static void main(String[] args) {
   // Write a program that uses a while loop to print the odd numbers from 1 to 20.
  // => 1,3,5,7,9,11,13,15,17,19
        int num = 1;
        while (num<=20){
            System.out.println(num);
            num+=2;
        }
        System.out.println("=============Task2=========");
   // Write a program that uses a while loop to print
   // the sum of the numbers from 1 to 10. => 1+2+3+4+5+6+7+8+9+10.
    // result should be 55?
        int n = 0;
        int sum = 0;
        while (n<=10){
            sum=n+sum;
            n++;}
        System.out.println(sum);

        System.out.println("==========Task3=================");
   // Write a program that uses a while loop to print
   // the multiplication table for a given number.
   //Enter number to print table: 7
        //7 * 1 = 7          //7 * 2 = 14        //7 * 3 = 21
        //7 * 4 = 28         //7 * 5 = 35        //7 * 6 = 42
        //7 * 7 = 49         //7 * 8 = 56        //7 * 9 = 63
        //7 * 10 = 70
     int a = 7;
     int b = 0;
     while (b<=10){
         System.out.println(a+"*"+b+"="+(a*b)+"\n");
         b++;

     }

    }
}
