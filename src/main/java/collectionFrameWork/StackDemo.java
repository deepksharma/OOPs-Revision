package collectionFrameWork;

/*
======================================================
                JAVA COLLECTIONS - STACK
======================================================
✅ Class: java.util.Stack<E>
✅ Extends: Vector<E> (legacy class but still used)
✅ Implements: List<E>, Collection<E>, Iterable<E>
✅ LIFO (Last In, First Out) data structure
✅ Synchronized (thread-safe) -> Slightly slower than Deque for stack operations
✅ For modern stack operations, **ArrayDeque** is preferred
✅ Use Stack if you specifically need legacy API or synchronization

WHEN TO USE:
------------------------------------------------------
✔ Need LIFO ordering (undo operations, parsing, DFS traversal, etc.)
✔ Require thread-safety and can tolerate slightly slower performance
✔ Want classic stack method names like push(), pop(), peek()

WHEN NOT TO USE:
------------------------------------------------------
✘ High-performance single-threaded apps → Use ArrayDeque instead
✘ When you don’t need synchronization
✘ If you want primitive types → Use specialized libraries

======================================================
          IMPORTANT METHODS (STACK SPECIFIC)
======================================================
1. push(E item)              -> Push item on top of stack
2. pop()                     -> Remove and return top item (throws EmptyStackException if empty)
3. peek()                    -> View top item without removing (throws EmptyStackException if empty)
4. empty()                   -> Check if stack is empty (true/false)
5. search(Object o)          -> Returns 1-based position from top of stack (-1 if not found)

======================================================
          IMPORTANT METHODS (VECTOR INHERITED)
======================================================
- add(E e)                  -> Add to end (acts like push)
- remove(Object o)          -> Remove first occurrence of element
- remove(int index)         -> Remove at index
- get(int index)            -> Get element at index
- size()                    -> Number of elements
- contains(Object o)        -> Check if element exists
- clear()                   -> Remove all elements
- iterator()                -> Iterate in order from bottom to top

======================================================
          EXAMPLE USAGE
======================================================
*/
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // PUSH elements
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack after pushes: " + stack); // [A, B, C]

        // PEEK top element
        System.out.println("Top element (peek): " + stack.peek()); // C

        // POP element
        String popped = stack.pop();
        System.out.println("Popped element: " + popped); // C
        System.out.println("Stack after pop: " + stack); // [A, B]

        // SEARCH element
        int pos = stack.search("A"); // Position from top (1-based)
        System.out.println("'A' position from top: " + pos);

        // EMPTY check
        System.out.println("Is stack empty? " + stack.empty()); // false

        // ITERATE through stack
        System.out.print("Stack iteration (bottom to top): ");
        for (String s : stack) {
            System.out.print(s + " ");
        }
    }
}

/*
======================================================
          BEST PRACTICES
======================================================
1️⃣ Prefer Deque (ArrayDeque) over Stack in new code for better performance.
2️⃣ Only use Stack if:
    - Legacy API integration is required.
    - Thread-safety is needed without external synchronization.
3️⃣ Be careful with empty pop()/peek() → throws EmptyStackException.
4️⃣ Avoid null elements — they are allowed but can cause confusion.
5️⃣ For DFS/BFS in graphs, stacks can be useful in recursive-to-iterative conversions.
6️⃣ Use search() cautiously → It’s O(n) and not common in performance-critical code.

======================================================
          TIME COMPLEXITY
======================================================
push(E e)       -> O(1) amortized
pop()           -> O(1)
peek()          -> O(1)
search(Object)  -> O(n)
empty()         -> O(1)
======================================================
*/

