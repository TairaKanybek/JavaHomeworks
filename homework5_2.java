package homework;
//       Write a program to print a welcome message to the passenger and
//        notify them to do security checks if they are not coming from connecting flight,
//        and at the end print "enjoy your flight"
//        Example 1:
//        Welcome to the Delta Air Lines
//        Are you travelling from connecting flight(true/false)? true
//        Enjoy your flight
//        Example 2:
//        Welcome to the Delta Air Lines
//        Are you travelling from connecting flight(true/false)? false
//        Please proceed to the security check
//        Enjoy your flight

import java.sql.SQLOutput;
import java.util.Scanner;

public class homework5_2 {
    public static void main(String[] args) {
        Scanner flight = new Scanner(System.in);
        System.out.println("Welcome to the Delta Air Lines");
        System.out.println("Are you travelling from connecting flight(true/false)?");
        boolean connectingFlight = flight.nextBoolean();
        if (connectingFlight) {
            System.out.println("Enjoy your flight");
        }

//        if (connectingFlight==false){
//            System.out.println("Please proceed to the security check");
//        }
        else {
            System.out.println("Please proceed to the security check");
        }
    }
}


