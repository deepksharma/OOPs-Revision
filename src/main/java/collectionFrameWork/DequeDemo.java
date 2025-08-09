package collectionFrameWork;

/*
======================================================
            JAVA COLLECTIONS - DEQUE
======================================================
✅ "Deque" stands for **Double-Ended Queue**
✅ Allows insertion and removal from BOTH ends
✅ Can be used as:
      • Queue (FIFO)
      • Stack (LIFO)
✅ Interface in java.util package
✅ Implementations:
      • ArrayDeque (Resizable array, faster than LinkedList)
      • LinkedList (Doubly linked list implementation)
✅ Null Elements:
      • ArrayDeque -> ❌ No null elements allowed
      • LinkedList -> ✅ Allows null elements

------------------------------------------------------
WHEN TO USE DEQUE:
------------------------------------------------------
1. Need both stack and queue operations
2. More efficient than Stack class (ArrayDeque preferred)
3. Avoid null elements when using ArrayDeque
4. Thread-safe version: Use `ConcurrentLinkedDeque` or `LinkedBlockingDeque`

======================================================
IMPORTANT METHODS (FROM BOTH ENDS)
======================================================
Insertion:
------------------------------------------------------
• addFirst(E e)   -> Add element at front (throws exception if capacity full)
• addLast(E e)    -> Add element at end (throws exception if capacity full)
• offerFirst(E e) -> Add element at front (returns false if fails)
• offerLast(E e)  -> Add element at end (returns false if fails)

Removal:
------------------------------------------------------
• removeFirst()   -> Remove element from front (throws exception if empty)
• removeLast()    -> Remove element from end (throws exception if empty)
• pollFirst()     -> Remove element from front (returns null if empty)
• pollLast()      -> Remove element from end (returns null if empty)

Access (Peek without removing):
------------------------------------------------------
• getFirst()      -> Get element from front (throws exception if empty)
• getLast()       -> Get element from end (throws exception if empty)
• peekFirst()     -> Get element from front (returns null if empty)
• peekLast()      -> Get element from end (returns null if empty)

======================================================
BASIC USAGE EXAMPLE - Using ArrayDeque
======================================================
*/

import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>(); // Or new LinkedList<>();

        // Adding elements (Front & End)
        deque.addFirst("A"); // Front -> A
        deque.addLast("B");  // Front -> A, End -> B
        deque.offerFirst("C"); // Front -> C, A, B
        deque.offerLast("D");  // Front -> C, A, B, D

        System.out.println("Deque after additions: " + deque);

        // Accessing elements without removal
        System.out.println("First Element (peekFirst): " + deque.peekFirst());
        System.out.println("Last Element (peekLast): " + deque.peekLast());

        // Removing elements from both ends
        System.out.println("Removed First: " + deque.removeFirst()); // Removes C
        System.out.println("Removed Last: " + deque.removeLast());   // Removes D

        System.out.println("Deque after removals: " + deque);

        // Poll methods (safe removal, no exceptions)
        deque.pollFirst();
        deque.pollLast();

        System.out.println("Deque after poll operations: " + deque);

        // Using as Stack (LIFO)
        deque.push("X"); // same as addFirst
        deque.push("Y");
        System.out.println("Stack mode: " + deque);
        System.out.println("Pop from stack: " + deque.pop()); // same as removeFirst

        // Clear all
        deque.clear();
        System.out.println("Is Deque empty? " + deque.isEmpty());
    }
}

/*
======================================================
BEST PRACTICES & NOTES:
======================================================
1️⃣ Use ArrayDeque instead of Stack for LIFO (faster, no sync overhead)
2️⃣ Use offer/poll/peek when you want null-safe operations (no exceptions)
3️⃣ Use add/remove/get when you want exceptions on failure
4️⃣ Avoid storing null in Deque (especially ArrayDeque)
5️⃣ For thread-safe deque operations, use ConcurrentLinkedDeque
6️⃣ Don't mix up Queue and Stack modes in same Deque without clear logic
======================================================
*/

