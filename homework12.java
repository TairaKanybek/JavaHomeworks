package homework;
//Homework 1:
//Write a method that takes a string and returns true if the string starts with “hi” and false otherwise.

import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any word");
        String hi = sc.nextLine();
        System.out.println(greeting(hi));
        System.out.println("============Task2==============");
        System.out.println("Write any word");
        String word=sc.nextLine();
        System.out.println(lastChar(word));
        System.out.println("============Task3==============");
        System.out.println("Write any word");
        String sw = sc.nextLine();
        System.out.println(swap(sw));





    }
    public static boolean greeting (String hi){
        return hi.substring(0,2).equalsIgnoreCase("hi");

            }
//Write a method that takes a string
// returns a new string made of 3 copies of the last 2 chars of the original string.
// The string length will be at least 2.
//extraEnd(“Hi”) → “HiHiHi”
//extraEnd(“Hello”) → “lololo”
//extraEnd(“ab”) → “ababab”
    public static String lastChar (String word){
       word= word.substring(word.length()-2);
       return word+word+word;
    }
//hello  5 -2=3

//Homework 3:
//Given a string of any length, return a new string where the last 2 chars,
// if present, are swapped, so “coding” yields “codign”.
//lastTwo(“coding”) → “codign”
//lastTwo(“cat”) → “cta”
//lastTwo(“ab”) → “ba”
    public static String swap (String sw){
        return sw.substring(0,sw.length()-2)+sw.charAt(sw.length()-1)+sw.charAt(sw.length()-2);
    }
}
//hello
