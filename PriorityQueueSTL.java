package Heap;

import java.util.*;

public class PriorityQueueSTL {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        System.out.println(pq); // Output: [1, 2, 8, 5] (order may vary)
        
        System.out.println(pq.peek()); // Output: 1 (smallest element)
        
        System.out.println(pq.poll()); // Output: 1 (removes the smallest element)
        System.out.println(pq); // Output: [2, 5, 8] (order may vary)
    }
}