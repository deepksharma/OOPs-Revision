package collectionFrameWork;

/*
======================================================
                JAVA COLLECTIONS - LINKEDLIST
======================================================
✅ Doubly linked list implementation of List & Deque
✅ Maintains insertion order
✅ Allows duplicates & null elements
✅ Good for frequent insertions/deletions in middle
✅ Implements List, Deque, Queue interfaces

IMPORTANT METHODS (LIST + DEQUE FEATURES):
------------------------------------------------------
1. add(E e)                 -> Add element at end
2. add(int index, E e)      -> Add at specific position
3. addFirst(E e)            -> Add at start
4. addLast(E e)             -> Add at end
5. get(int index)           -> Get element by index
6. getFirst()               -> Get first element
7. getLast()                -> Get last element
8. set(int index, E e)      -> Replace element
9. remove(int index)        -> Remove by index
10. remove(Object o)        -> Remove by value
11. removeFirst()           -> Remove first element
12. removeLast()            -> Remove last element
13. contains(Object o)      -> Check existence
14. size()                  -> Number of elements
15. isEmpty()               -> Check if list is empty
16. clear()                 -> Remove all elements
17. indexOf(Object o)       -> First occurrence index
18. lastIndexOf(Object o)   -> Last occurrence index
======================================================
*/

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        // 1️⃣ Create LinkedList
        LinkedList<String> animals = new LinkedList<>();

        /*
        ========================
        ADD METHODS
        ========================
        */
        // add(E e) - Add element at the end
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        System.out.println("After add(): " + animals); // [Dog, Cat, Elephant]

        // add(int index, E e) - Add element at specific index
        animals.add(1, "Horse");
        System.out.println("After add(index, e): " + animals); // [Dog, Horse, Cat, Elephant]

        // addFirst(E e) - Insert at start
        animals.addFirst("Tiger");
        System.out.println("After addFirst(): " + animals); // [Tiger, Dog, Horse, Cat, Elephant]

        // addLast(E e) - Insert at end
        animals.addLast("Lion");
        System.out.println("After addLast(): " + animals); // [Tiger, Dog, Horse, Cat, Elephant, Lion]

        /*
        ========================
        GET METHODS
        ========================
        */
        // get(int index) - Retrieve element by index
        System.out.println("get(2): " + animals.get(2)); // Horse

        // getFirst() - Retrieve first element
        System.out.println("getFirst(): " + animals.getFirst()); // Tiger

        // getLast() - Retrieve last element
        System.out.println("getLast(): " + animals.getLast()); // Lion

        /*
        ========================
        SET / UPDATE
        ========================
        */
        // set(int index, E e) - Replace element
        animals.set(3, "Leopard");
        System.out.println("After set(3, e): " + animals); // [Tiger, Dog, Horse, Leopard, Elephant, Lion]

        /*
        ========================
        REMOVE METHODS
        ========================
        */
        // remove(int index) - Remove element by index
        animals.remove(2);
        System.out.println("After remove(index): " + animals); // [Tiger, Dog, Leopard, Elephant, Lion]

        // remove(Object o) - Remove element by value
        animals.remove("Dog");
        System.out.println("After remove(Object): " + animals); // [Tiger, Leopard, Elephant, Lion]

        // removeFirst() - Remove first element
        animals.removeFirst();
        System.out.println("After removeFirst(): " + animals); // [Leopard, Elephant, Lion]

        // removeLast() - Remove last element
        animals.removeLast();
        System.out.println("After removeLast(): " + animals); // [Leopard, Elephant]

        /*
        ========================
        CHECK METHODS
        ========================
        */
        // contains(Object o) - Check if exists
        System.out.println("contains(\"Elephant\"): " + animals.contains("Elephant")); // true

        // size() - Number of elements
        System.out.println("size(): " + animals.size()); // 2

        // isEmpty() - Check if empty
        System.out.println("isEmpty(): " + animals.isEmpty()); // false

        /*
        ========================
        INDEX METHODS
        ========================
        */
        animals.add("Elephant");
        animals.add("Lion");
        animals.add("Tiger");
        System.out.println("List now: " + animals); // [Leopard, Elephant, Elephant, Lion, Tiger]

        // indexOf(Object o) - First occurrence
        System.out.println("indexOf(\"Elephant\"): " + animals.indexOf("Elephant")); // 1

        // lastIndexOf(Object o) - Last occurrence
        System.out.println("lastIndexOf(\"Elephant\"): " + animals.lastIndexOf("Elephant")); // 2

        /*
        ========================
        CLEAR METHOD
        ========================
        */
        animals.clear();
        System.out.println("After clear(): " + animals); // []
    }
}
