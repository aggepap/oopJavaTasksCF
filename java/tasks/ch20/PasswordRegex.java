package oop.java.tasks.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PasswordRegex {
    public static void main(String[] args) {

        String pass = "PassW0Rd@";
        String pass2 = "PassW0Rd";

        checkPass(pass);
        checkPass(pass2);


    }

    private static boolean isValid(String password){
        Pattern pattern = Pattern.compile("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[@#$%^&*!])^.+{8,}$");
        Matcher passwordMatcher = pattern.matcher(password);
        return passwordMatcher.find();
    }
    private static void checkPass(String password){
        if(isValid(password)){
            System.out.println("Password " + password + " is valid");
        }else{
            System.out.println("Password " + password + " is invalid");
        }
    }
}
