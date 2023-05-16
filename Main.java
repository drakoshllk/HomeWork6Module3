public class Main {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue(5);
        myPriorityQueue.enQueue(1);
        myPriorityQueue.enQueue(4);
        myPriorityQueue.enQueue(15);
        myPriorityQueue.enQueue(34);
        myPriorityQueue.enQueue(45);
        myPriorityQueue.printQueue();
    }
}