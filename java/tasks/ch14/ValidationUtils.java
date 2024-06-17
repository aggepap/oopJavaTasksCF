package oop.java.tasks.ch14;

public class ValidationUtils {
    private ValidationUtils(){

    }

    /**
     * Checks in provided string is between thw acceptable length
     * (1-31 characters)
     * @param data string to be validated
     * @return true if string is between acceptable length, false otherwise
     */
    public static boolean isStringValid(String data){
       return data.length() > 0 && data.length() <= 31;
    }
    public static boolean isNumberValid(int num){
        return num > 0 && num <= 10;
    }
}
