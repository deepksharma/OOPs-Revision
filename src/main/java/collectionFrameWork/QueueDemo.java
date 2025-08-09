package collectionFrameWork;

/*
======================================================
                JAVA COLLECTIONS - QUEUE
======================================================
✅ Interface in java.util package
✅ Follows FIFO (First-In-First-Out) principle (mostly)
✅ Implementations: LinkedList, PriorityQueue, ArrayDeque
✅ Can allow duplicates and null (depends on implementation)
✅ Used when order of processing is important (e.g., task scheduling, buffering)

------------------------------------------------------
📌 Queue Interface Key Implementations:
------------------------------------------------------
1. LinkedList    → Can work as Queue, Deque, List
2. PriorityQueue → Orders elements based on natural order or comparator
3. ArrayDeque    → Faster than LinkedList for queue operations (no capacity limit)

------------------------------------------------------
📌 IMPORTANT METHODS (Queue Interface)
------------------------------------------------------
1. boolean add(E e)      → Inserts element, throws exception if fails
2. boolean offer(E e)    → Inserts element, returns false if fails
3. E remove()            → Removes head, throws exception if empty
4. E poll()              → Removes head, returns null if empty
5. E element()           → Retrieves head, throws exception if empty
6. E peek()              → Retrieves head, returns null if empty
======================================================
*/

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        // Using LinkedList as Queue
        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("A");
        queue.add("B");
        queue.offer("C"); // Doesn't throw exception if fails

        // View head element
        System.out.println("Head: " + queue.peek()); // A

        // Remove head
        System.out.println("Removed: " + queue.poll()); // Removes A
        System.out.println("Removed: " + queue.remove()); // Removes B

        // Remaining elements
        System.out.println("Queue: " + queue);

        // PriorityQueue Example
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("PriorityQueue (natural order): " + pq);
    }
}

/*
======================================================
💡 NOTES & BEST PRACTICES:
======================================================
1️⃣ Use **offer()** instead of add() in production to avoid exceptions when capacity is full.
2️⃣ **poll()** is safer than remove() as it returns null instead of throwing exception.
3️⃣ For **thread-safe queues**, use:
   - ConcurrentLinkedQueue
   - PriorityBlockingQueue
4️⃣ **PriorityQueue** does NOT maintain insertion order, it sorts elements.
5️⃣ **Null elements** are NOT allowed in PriorityQueue.
6️⃣ **LinkedList Queue** allows null values.
======================================================
*/
