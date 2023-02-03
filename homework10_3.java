package homework;
//3.   Create a method that takes a boolean indicating whether someone is a member
// of a loyalty program and a double representing the cost of a purchase,
// and returns a double representing the final cost of the purchase after applying a discount.
// If the customer is a loyalty customer apply 10% discount.

import java.util.Scanner;

public class homework10_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write the answer"+"\n"+"Are you a member of our loyalty program? True/False" );
        boolean answer = sc.nextBoolean();
        System.out.println("Please write your costs");
        double costs= sc.nextInt();
        getDiscount(answer,costs);
    }
    public static boolean getDiscount(boolean answer,double costs) {
        if (answer) {
            costs = (costs - (costs * 0.1));
            System.out.println("You get 10% discount "+costs);
            return true;
        }
        else {
            System.out.println("You don't get a discount " + costs);
            return false;
        }
    }

    }