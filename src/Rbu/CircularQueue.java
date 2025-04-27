package Rbu;

import java.util.Scanner;

public class CircularQueue {
    private int size;
    private int front, rear;
    private int[] queue;

    // Constructor
    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Add item to the queue
    public void enqueue(int item) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full (Overflow)!");
        } else {
            if (front == -1) { // first element
                front = 0;
            }
            rear = (rear + 1) % size;
            queue[rear] = item;
            System.out.println("Inserted: " + item);
        }
    }

    // Delete item from the queue
    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty (Underflow)!");
        } else {
            int removedItem = queue[front];
            if (front == rear) {
                // Queue has only one element
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            System.out.println("Deleted: " + removedItem);
        }
    }

    // Display the queue
    public void display() {
        if (front == -1) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Circular Queue: ");
        int size = sc.nextInt();
        CircularQueue cq = new CircularQueue(size);

        int choice;
        do {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int element = sc.nextInt();
                    cq.enqueue(element);
                    break;
                case 2:
                    cq.dequeue();
                    break;
                case 3:
                    cq.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
