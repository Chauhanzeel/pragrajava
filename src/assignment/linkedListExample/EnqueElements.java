package assignment.linkedListExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EnqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter 5 integers to enqueue:");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            queue.add(num);
        }

        System.out.println("\nQueue after enqueue: " + queue);

        int queueSize = queue.size();
        for (int i = 0; i < queueSize; i++) {
            if (!queue.isEmpty()) {
                 queue.remove();
            }
        }

        System.out.println("Queue after dequeue: " + queue);
        sc.close();
    }
}
