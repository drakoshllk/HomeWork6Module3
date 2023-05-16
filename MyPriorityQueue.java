public class MyPriorityQueue {
    private int CAPACITY;
    private int[] queue;
    private int front, rear;

    public MyPriorityQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.queue = new int[CAPACITY];
        this.front = -1;
        this.rear = -1;
    }

    public void enQueue(int element) {
        if (rear + 1 == CAPACITY) {
            System.out.println("Queue is full!");
            System.exit(1);
        }
        if (front == -1) front++;
        rear++;
        queue[rear] = element;
        for (int i = front; i < rear + 1; i++) {
            for (int j = i; j < rear + 1; j++) {
                if (queue[j] > queue[i]) {
                    int temp = queue[j];
                    queue[j] = queue[i];
                    queue[i] = temp;
                }
            }
        }
    }

    public int peek() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            System.exit(0);
        }
        return queue[front];
    }

    public void pop() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            System.exit(0);
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else front++;
    }

    public void printQueue() {
        if (front == -1) {
            System.out.println("Queue is empty!");
        }
        System.out.print("[");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + ", ");
        }
        System.out.println(queue[rear] + "]");
    }
}
