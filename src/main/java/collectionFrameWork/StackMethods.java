package collectionFrameWork;

/*
======================================================
                JAVA COLLECTIONS - STACK
======================================================
✅ Stack is a **Last-In-First-Out (LIFO)** data structure
✅ In Java, Stack is a **class** (extends Vector)
✅ Can store **duplicate elements**
✅ Allows **null values**
✅ Thread-safe (synchronized) — but slower than non-sync alternatives like Deque
✅ Commonly used for:
   - Undo operations
   - Expression evaluation (balanced parentheses, postfix/prefix)
   - Function call stack simulation
   - Browser history, backtracking problems

INTERNAL DETAILS:
------------------------------------------------------
- Stack in Java is built on top of **Vector** (Resizable array)
- All operations are synchronized (safe for multithreading)
- Performance penalty compared to ArrayDeque for single-threaded use

IMPORTANT METHODS:
------------------------------------------------------
1. push(E e)         -> Add element to the top of the stack
2. pop()             -> Remove and return the top element (EmptyStackException if empty)
3. peek()            -> Return the top element without removing (EmptyStackException if empty)
4. search(Object o)  -> Returns 1-based position from top (or -1 if not found)
5. empty()           -> Check if stack is empty
6. size()            -> Returns number of elements
7. clear()           -> Remove all elements (via removeAllElements())

BEST PRACTICES:
------------------------------------------------------
✅ Use Stack only if you **need thread safety**; else prefer **ArrayDeque**
✅ Always check if stack is empty before `pop()` or `peek()`
✅ Use generics for type safety: `Stack<Integer> stack = new Stack<>();`
✅ Avoid storing null unless you have a specific reason
✅ For single-threaded environments, prefer **Deque** (ArrayDeque)

EXAMPLE USAGE:
------------------------------------------------------
*/

import java.util.*;

public class StackMethods {
    public static void main(String[] args) {

        // Create a Stack of Strings
        Stack<String> stack = new Stack<>();

        // 1. Push elements
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");

        System.out.println("Initial Stack: " + stack); // [Java, Python, C++, JavaScript]

        // 2. Peek top element
        System.out.println("Top element (peek): " + stack.peek()); // JavaScript

        // 3. Pop element
        String removed = stack.pop();
        System.out.println("Popped element: " + removed); // JavaScript
        System.out.println("Stack after pop: " + stack); // [Java, Python, C++]

        // 4. Search element (1-based index from top)
        int position = stack.search("Python");
        System.out.println("Position of Python from top: " + position); // 2

        // 5. Check if empty
        System.out.println("Is stack empty? " + stack.empty()); // false

        // 6. Iterate through stack (LIFO order)
        System.out.println("Iterating stack:");
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 7. Clear stack
        stack.clear();
        System.out.println("After clear: " + stack); // []
    }
}

/*
OUTPUT:
------------------------------------------------------
Initial Stack: [Java, Python, C++, JavaScript]
Top element (peek): JavaScript
Popped element: JavaScript
Stack after pop: [Java, Python, C++]
Position of Python from top: 2
Is stack empty? false
Iterating stack:
Java
Python
C++
After clear: []
------------------------------------------------------

TIME COMPLEXITY:
------------------------------------------------------
push()         -> O(1) amortized
pop()          -> O(1)
peek()         -> O(1)
search()       -> O(n)
isEmpty()      -> O(1)
iteration      -> O(n)

ALTERNATIVES:
------------------------------------------------------
- **ArrayDeque** (non-thread-safe, faster for single-threaded)
- **LinkedList** (implements Deque)
- **Custom Stack** using LinkedList or Array

WHEN TO USE STACK:
------------------------------------------------------
✅ Need thread-safety
✅ LIFO operations are required
✅ Classic algorithm problems (DFS, parsing, backtracking)

WHEN NOT TO USE STACK:
------------------------------------------------------
❌ Single-threaded → Use ArrayDeque (better performance)
❌ Random access → Use ArrayList
*/
