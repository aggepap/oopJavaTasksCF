package oop.java.tasks.ch14;

public class StringUtils {

    private StringUtils(){

    }

    public static String toUppercase(String text){
        return text.toUpperCase();
    }

    public static String reversedString(String text){
        String reversed = "";
        char ch;
        for(int i =0; i < text.length(); i++){
            ch = text.charAt(i);
            reversed = ch+reversed;
        }
        return reversed;
    }

    public static boolean isPalindrome(String text){

        return text.toLowerCase().equals(reversedString(text).toLowerCase());
    }
}
