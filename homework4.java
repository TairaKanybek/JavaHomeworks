package homework;

public class homework4 {
    public static void main(String[] args) {
        //Login Functionality
//Write a logic which would tell the user if logged in or not
//you have a username
//you have a password
//you loginLocation

//in order to be logged your userName should match steve@apple.com
//and your password should be infinityLoop1
//and you location should be california

        String username = "steve@apple.com";
        String password = "infinityLoop2";
        String loginLocation = "California";

        boolean logIn = username.equals("steve@apple.com") && password.equals("infinityLoop1") && loginLocation.equals("California");
        System.out.println(logIn);
    }
}
