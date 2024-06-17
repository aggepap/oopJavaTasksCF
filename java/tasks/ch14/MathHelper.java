package oop.java.tasks.ch14;

public class MathHelper {

    private MathHelper(){

    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i : arr){
            if (i > max){
                max = i;
            }
        }
        return max;
    }

    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            if (i < min){
                min = i;
            }
        }
        return min;
    }

    public static int findAvg(int[] arr){
        int total = 0;

        for(int i : arr){
           total += i;
        }
        return (total / arr.length);
    }
}
