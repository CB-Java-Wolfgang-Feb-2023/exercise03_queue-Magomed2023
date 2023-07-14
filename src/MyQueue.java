public class MyQueue {

    int size = 5;
    int items[] = new int[size];
    int front;
    int rear;

    MyQueue() {
        front = -1;
        rear = -1;
    }

    // Method to check if the queue is full
    boolean isFull() {
        if (rear == size - 1) {
            return true;
        }
        return false;
    }

    // Method to check if the queue is empty
    boolean isEmpty() {
        if (front == -1 || front > rear) {
            return true;
        }
        return false;
    }

    // Method to enqueue an element into the queue
    void enqueue(int element) {
        // If the queue is full
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            if (front == -1) {
                // When an element is inserted, set the "front" index to 0
                front = 0;
            }
            rear++;
                // Insert the element at the end
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    // Method to dequeue an element from the queue
    int dequeue() {
        int element;

        // If the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            // Delete the first element
            element = items[front];

            // If there is only one element in the queue
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                // Set the next element as the new "front"
                front++;
            }
            System.out.println(element + " deleted");
            return element;
        }
    }

    // Method to display the elements in the queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            // Display the first element
            System.out.println("\nFront Index -> " + front);

            // Display all the remaining elements in the queue
            System.out.println("Items -> ");
            for (int i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }

            // Display the last element
            System.out.println("\nRear Index -> " + rear);
        }
    }
}
