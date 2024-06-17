package oop.java.tasks.ch14;

public class QueueManager {
    private static int[] queue = new int[100];
    private static int pivot = -1;

    private static final QueueManager INSTANCE = new QueueManager();

    private QueueManager(){

    }
    public static QueueManager getInstance(){
        return INSTANCE;
    }
    public static void enQueue(int num){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        queue[++pivot] = num;
    }

    public static int deQueue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int valueToReturn = queue[0];
        pivot--;
        shiftQueueLeft();
        return valueToReturn;
    }

    private static void shiftQueueLeft(){
        for (int i =0 ; i <=pivot ; i++)
            queue[i] = queue[i+1];
    }
    private static boolean isEmpty(){
        return pivot == -1;
    }

    private static boolean isFull(){
        return pivot == queue.length - 1;
    }
    public static void printQueue(){
        for(int i : queue){
            System.out.printf(i + ",");
        }
    }
}
