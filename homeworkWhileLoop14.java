package homework;

public class homeworkWhileLoop14 {
    public static void main(String[] args) {
//Write a program that calculates the sum of all even numbers
// between 1 and a 100 using a while loop.
//2+4+6+8 … = ?
        System.out.println("====Task1=========");
        int num = 0;
        int sum = 0;
        while (num < 100) {
            num += 2;
            sum += num;
        }
        System.out.println(sum);

        System.out.println("=====Task2=====");
        //Write a program that prints all prime numbers between 1 and a 100  using a while loop.

//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
        int a = 1;
//
        while (a < 100) { //1 8
            a++;//3//5//7 9//12 13
            if (a % 2 != 0 && a % 3 != 0 && a % 5 != 0 && a % 7 != 0) { // 2%2==0
                System.out.println(a);//11//13/17//
//
            } else if (a == 3 || a == 5 || a == 7) {
                System.out.println(a);//3 //5 //7
                a++;//4//6 //8
            } else if (a == 2) {
                System.out.println(a);//2
            }

        }

    }}

