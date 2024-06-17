package oop.java.tasks.ch14;

public class Logger {
    private static Logger INSTANCE =null;

    private Logger(){

    }
    public static Logger getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }
    public void logMessage(String message){
        System.err.println( message + " " + (System.currentTimeMillis())/1000);
    }
}
