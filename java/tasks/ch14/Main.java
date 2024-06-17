package oop.java.tasks.ch14;

public class Main {
    public static void main(String[] args) {

        int[] arraytest = { 2,5,6, 12,-24, 25, 64, 24, 23};
        String name = "21251212351256126";
        int num = 11;

        String[] arrayStringTest2 = new String[10];

        System.out.println(MathHelper.findMax(arraytest));
        System.out.println(MathHelper.findMin(arraytest));
        System.out.println(MathHelper.findAvg(arraytest));

        System.out.println(ValidationUtils.isStringValid(name));
        System.out.println(ValidationUtils.isNumberValid(num));

        Logger log = Logger.getInstance();
        log.logMessage("fase");

        StackManager stack = StackManager.getInstance();
        try {
            stack.push("Hello");
            stack.printArray();
            stack.push("Hello");
            stack.printArray();
            stack.push("Hello");
            stack.printArray();
            stack.push("Hello");
            stack.printArray();
            stack.pop();
            stack.printArray();
            stack.pop();
            stack.printArray();
            stack.pop();
            stack.printArray();
            stack.pop();
            stack.printArray();
            stack.pop();
            stack.printArray();

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(StringUtils.reversedString("ela re perierge"));
        System.out.println(StringUtils.isPalindrome("νιψονανομηματαμημονανοψιν"));

        QueueManager.enQueue(15);
        QueueManager.enQueue(22);
        QueueManager.enQueue(24);
        QueueManager.enQueue(25);
        QueueManager.deQueue();
        QueueManager.printQueue();

    }


}
