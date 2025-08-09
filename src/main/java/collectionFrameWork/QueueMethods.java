package collectionFrameWork;

/*
======================================================
                JAVA COLLECTIONS - QUEUE
======================================================
✅ Interface in java.util
✅ Follows FIFO (First-In-First-Out) order
✅ Can be implemented by classes like LinkedList, PriorityQueue, ArrayDeque
✅ Elements are added at the tail (rear) and removed from the head (front)
✅ Allows null in some implementations (LinkedList), but not in PriorityQueue/ArrayDeque
✅ Used for task scheduling, buffering, order processing

------------------------------------------------------
TYPES OF QUEUES:
------------------------------------------------------
1. LinkedList      -> General-purpose, allows nulls, no capacity limit
2. PriorityQueue  -> Orders elements by natural ordering or custom Comparator
3. ArrayDeque     -> Resizable array, faster than LinkedList, no null allowed
4. BlockingQueue  -> Thread-safe, used in concurrent programming

------------------------------------------------------
IMPORTANT METHODS:
------------------------------------------------------
🔹 Inherited from Collection:
    - add(E e)       -> Inserts element (throws exception if capacity full)
    - remove()       -> Removes head (throws NoSuchElementException if empty)
    - element()      -> Retrieves head without removing (throws exception if empty)
🔹 Queue-specific:
    - offer(E e)     -> Inserts element (returns false if capacity full)
    - poll()         -> Retrieves & removes head (returns null if empty)
    - peek()         -> Retrieves head without removing (returns null if empty)

------------------------------------------------------
WHEN TO USE:
------------------------------------------------------
✅ FIFO requirement
✅ Need predictable order of processing
✅ Scheduling, messaging systems, producer-consumer problems

======================================================
EXAMPLE 1 - Basic Queue using LinkedList
======================================================
*/
import java.util.*;

public class QueueMethods {
    public static void main(String[] args) {
        // Create a Queue
        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("A");       // throws exception if fails
        queue.offer("B");     // returns false if fails
        queue.offer("C");

        System.out.println("Queue: " + queue); // [A, B, C]

        // Access head element
        System.out.println("Peek: " + queue.peek());    // A
        System.out.println("Element: " + queue.element()); // A

        // Remove elements
        System.out.println("Poll: " + queue.poll());    // A
        System.out.println("Remove: " + queue.remove()); // B

        System.out.println("Queue after removals: " + queue); // [C]

        // Check size
        System.out.println("Size: " + queue.size());

        // Clear queue
        queue.clear();
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}

/*
======================================================
EXAMPLE 2 - PriorityQueue
======================================================
*/


 class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("PriorityQueue (Natural Order): " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll()); // removes smallest element first
        }
    }
}

/*
======================================================
BEST PRACTICES & NOTES
======================================================
1️⃣ Prefer offer(), poll(), peek() over add(), remove(), element()
   → offer/poll/peek return special values instead of throwing exceptions
2️⃣ PriorityQueue does NOT guarantee iteration order — only head is in correct priority
3️⃣ ArrayDeque is usually faster than LinkedList for queue operations
4️⃣ Avoid storing null in queues (many implementations prohibit it)
5️⃣ Use BlockingQueue for multi-threaded environments (e.g., LinkedBlockingQueue)
6️⃣ For double-ended operations, use Deque instead of Queue
======================================================
*/

