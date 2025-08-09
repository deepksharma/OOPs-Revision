package collectionFrameWork;

/*
======================================================
                JAVA COLLECTIONS - MASTER NOTE
======================================================
🔥 PURPOSE:
- Java Collections Framework (JCF) provides ready-to-use data structures and algorithms
- Reduces development time and avoids reinventing the wheel
- Includes interfaces, implementations, and utility classes

MAIN INTERFACES:
------------------------------------------------------
1. Collection (root)
    - List       -> ArrayList, LinkedList, Vector, Stack
    - Set        -> HashSet, LinkedHashSet, TreeSet
    - Queue      -> PriorityQueue, LinkedList, ArrayDeque
    - Deque      -> ArrayDeque, LinkedList
2. Map (not child of Collection)
    - HashMap, LinkedHashMap, TreeMap, Hashtable

======================================================
                LIST INTERFACE
======================================================
✅ Ordered collection (insertion order preserved)
✅ Allows duplicate elements
✅ Indexed access
------------------------------------------------------
1. ArrayList
    - Dynamic array
    - Fast random access (O(1)), slow inserts/removals in middle (O(n))
    - Use when more reads than modifications
------------------------------------------------------
2. LinkedList
    - Doubly linked list
    - Fast insert/remove at ends (O(1)), slow random access (O(n))
    - Implements List & Deque
------------------------------------------------------
3. Vector
    - Thread-safe ArrayList
    - Slower due to synchronization
------------------------------------------------------
4. Stack (extends Vector)
    - LIFO (Last In First Out)

======================================================
                SET INTERFACE
======================================================
✅ No duplicates
✅ No indexing
------------------------------------------------------
1. HashSet
    - Unordered, backed by HashMap
    - Null allowed (1 element)
    - O(1) average for add, remove, contains
------------------------------------------------------
2. LinkedHashSet
    - Maintains insertion order
    - Slower than HashSet
------------------------------------------------------
3. TreeSet
    - Sorted (natural/custom order)
    - No nulls (NullPointerException)
    - Backed by TreeMap (O(log n) ops)

======================================================
                MAP INTERFACE
======================================================
✅ Key-Value pairs
✅ Keys unique, values can duplicate
------------------------------------------------------
1. HashMap
    - Unordered, allows 1 null key & many null values
    - O(1) average for ops
    - Backed by array + linked list/tree
------------------------------------------------------
2. LinkedHashMap
    - Maintains insertion order
------------------------------------------------------
3. TreeMap
    - Sorted by key
    - No null keys

======================================================
                QUEUE INTERFACE
======================================================
✅ FIFO (First In First Out)
------------------------------------------------------
1. PriorityQueue
    - Elements ordered by natural order or comparator
    - No null elements
------------------------------------------------------
2. LinkedList (as Queue)
    - Allows nulls, FIFO

======================================================
                DEQUE INTERFACE
======================================================
✅ Double-Ended Queue (insert/remove from both ends)
------------------------------------------------------
1. ArrayDeque
    - Faster than Stack for LIFO
    - No nulls
------------------------------------------------------
2. LinkedList (as Deque)
    - Nulls allowed

======================================================
                STACK CLASS
======================================================
✅ LIFO behavior
- push(), pop(), peek(), search()

======================================================
COMMON METHODS:
======================================================
add(E e) / addAll(Collection c)         -> Add element(s)
remove(Object o) / removeIf(predicate)  -> Remove
contains(Object o)                      -> Search
size()                                  -> Count
isEmpty()                               -> Check empty
clear()                                 -> Remove all
iterator()                              -> Get iterator
forEach(Consumer)                       -> Iterate with lambda

======================================================
BEST PRACTICES:
======================================================
1. Prefer interfaces (List, Set, Map) for variable type, implementation on right:
    List<String> list = new ArrayList<>();
2. Use correct DS:
    - Fast lookup: HashMap
    - Sorted data: TreeMap / TreeSet
    - Maintain insertion order: LinkedHashMap / LinkedHashSet
    - LIFO: Stack / ArrayDeque
    - FIFO: Queue / LinkedList
3. For large data, avoid frequent resizing (set initial capacity)
4. Avoid using raw types — always use generics
5. Choose concurrent collections (ConcurrentHashMap, CopyOnWriteArrayList) for multi-threading
6. Be careful with null in TreeMap/TreeSet (not allowed for keys in TreeMap)

======================================================
EXAMPLE USAGE:
======================================================
import java.util.*;

public class CollectionsMasterNote {
    public static void main(String[] args) {
        // LIST
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A"); // duplicates allowed
        System.out.println(list); // [A, B, A]

        // SET
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // ignored
        System.out.println(set); // [20, 10] (unordered)

        // MAP
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("One", 11); // overrides
        System.out.println(map); // {One=11, Two=2}

        // QUEUE
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        System.out.println(queue.poll()); // First

        // DEQUE
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        System.out.println(deque); // [Front, Back]

        // STACK
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop()); // 2
    }
}
======================================================
*/

