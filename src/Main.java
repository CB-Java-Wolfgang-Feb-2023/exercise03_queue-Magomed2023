public class Main {
    public static void main(String[] args) {
        // create an object of MyQueue class
        MyQueue a = new MyQueue();

        // try to delete element from the queue
        // currently queue is empty
        // so deletion is not possible
        a.dequeue();

        // insert elements to the queue
        for (int i = 1; i <= a.size; i++) {
            a.enqueue(i);
        }

        // check when queue is full
        a.enqueue(10);

        // removes element until it is empty
        a.dequeue();
        // check if queue is empty
        a.display();
    }
}
