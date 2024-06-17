package oop.java.tasks.ch14;

import java.util.Arrays;

public class StackManager {
    private static StackManager INSTANCE =null;
    private final int ARRAYSIZE = 6;
    private int indexStart;
    private String[] array;


    private StackManager(){
        array = new String[ARRAYSIZE];
        indexStart = 0;

    }
    public static StackManager getInstance(){
        if (INSTANCE == null){
            INSTANCE = new StackManager();

        }
        return INSTANCE;
    }
    public void push(String item) throws Exception {
        if(isFull()) {
            throw new Exception("Array is full");
        }
           array[indexStart] = item;
        indexStart++;
    }
    public String pop() throws Exception {
        if(isEmpty()) {
            System.out.println("Array is Empty");
            throw new Exception("Array is empty");

        }
     return  array[--indexStart] = null;
    }

    private boolean isFull() {
        return indexStart == array.length;
    }
    private boolean isEmpty() {
        return indexStart == 0;
    }
    public void printArray(){
        System.out.println(Arrays.toString(array));
    }
}
