package homework;

import java.util.Scanner;
//1. Ask the user how many Java exercises are you solving per day?
//2. if it's less than 3 -> print out -> You are too lazy!
//3. if it's more than or equal 3 and less than 5-> good job, but you should do better!
//4. if it's more than or equal 5 than print out -> great job! You are on the right track!

public class homework5 {
    public static void main(String[] args) {
        Scanner exercises = new Scanner(System.in);
        System.out.println("How many Java exercises are you solving per day?");
        int a =exercises.nextInt();
        if(a<3){
            System.out.println("You are too lazy!");
        }
        if(a>=3 && a<5){
            System.out.println("Good job, but you should do better!");
        }
        if(a>=5){
            System.out.println("g" +
                    "Great job! You are on the right track!");
        }

    }
}
