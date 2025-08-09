package collectionFrameWork;

/*
======================================================
                JAVA COLLECTIONS - HASHSET
======================================================
✅ Implements Set interface
✅ Stores unique elements (no duplicates)
✅ Allows a single null element
✅ Unordered (no index) — order is NOT guaranteed
✅ Backed by a HashMap internally
✅ Best for fast search, insertion, deletion (O(1) avg.)

IMPORTANT METHODS:
------------------------------------------------------
1. add(E e)                 -> Add element (returns false if duplicate)
2. remove(Object o)         -> Remove element by value
3. contains(Object o)       -> Check if element exists
4. size()                   -> Number of elements
5. isEmpty()                -> Check if set is empty
6. clear()                  -> Remove all elements
7. iterator()               -> Get iterator for traversal
======================================================
*/

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        // 1️⃣ Create HashSet
        HashSet<String> cities = new HashSet<>();

        /*
        ========================
        ADD ELEMENTS
        ========================
        */
        // add(E e) - Adds unique elements
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");
        System.out.println("After add(): " + cities); // Order not guaranteed

        // Trying to add duplicate
        boolean added = cities.add("Delhi");
        System.out.println("Adding duplicate 'Delhi': " + added); // false
        System.out.println("After duplicate add: " + cities);

        // Adding null (allowed only once)
        cities.add(null);
        System.out.println("After adding null: " + cities);

        /*
        ========================
        REMOVE ELEMENTS
        ========================
        */
        // remove(Object o) - Remove by value
        cities.remove("Mumbai");
        System.out.println("After remove(\"Mumbai\"): " + cities);

        /*
        ========================
        CHECK METHODS
        ========================
        */
        // contains(Object o) - Check if exists
        System.out.println("contains(\"Delhi\"): " + cities.contains("Delhi")); // true
        System.out.println("contains(\"Pune\"): " + cities.contains("Pune")); // false

        // size() - Number of elements
        System.out.println("size(): " + cities.size());

        // isEmpty() - Check if empty
        System.out.println("isEmpty(): " + cities.isEmpty());

        /*
        ========================
        ITERATION METHODS
        ========================
        */
        // Enhanced for-loop
        System.out.println("\nIterating using for-each loop:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /*
        ========================
        CLEAR METHOD
        ========================
        */
        cities.clear();
        System.out.println("After clear(): " + cities); // []
    }
}

