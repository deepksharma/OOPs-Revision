package collectionFrameWork;

/*
======================================================
            JAVA COLLECTIONS - LINKEDHASHSET
======================================================
✅ Implements Set interface (like HashSet)
✅ Stores unique elements (no duplicates)
✅ Maintains **insertion order** (unlike HashSet)
✅ Allows one null element
✅ Backed by a HashMap + LinkedList internally
✅ Useful when you need uniqueness + predictable iteration order

IMPORTANT METHODS:
------------------------------------------------------
1. add(E e)                 -> Add element (false if duplicate)
2. remove(Object o)         -> Remove element
3. contains(Object o)       -> Check if element exists
4. size()                   -> Number of elements
5. isEmpty()                -> Check if set is empty
6. clear()                  -> Remove all elements
7. iterator()               -> Iterate in insertion order
======================================================
*/

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // 1️⃣ Create LinkedHashSet
        LinkedHashSet<String> countries = new LinkedHashSet<>();

        /*
        ========================
        ADD ELEMENTS
        ========================
        */
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("Canada");
        System.out.println("After add(): " + countries);
        // Output: [India, USA, UK, Canada] → order preserved

        // Trying to add duplicate
        boolean added = countries.add("India");
        System.out.println("Adding duplicate 'India': " + added); // false
        System.out.println("After duplicate add: " + countries);
        // Output: [India, USA, UK, Canada] → unchanged

        // Adding null
        countries.add(null);
        System.out.println("After adding null: " + countries);
        // Output: [India, USA, UK, Canada, null]

        /*
        ========================
        REMOVE ELEMENTS
        ========================
        */
        countries.remove("UK");
        System.out.println("After remove(\"UK\"): " + countries);
        // Output: [India, USA, Canada, null]

        /*
        ========================
        CHECK METHODS
        ========================
        */
        System.out.println("contains(\"India\"): " + countries.contains("India")); // true
        System.out.println("contains(\"Brazil\"): " + countries.contains("Brazil")); // false
        System.out.println("size(): " + countries.size()); // 4
        System.out.println("isEmpty(): " + countries.isEmpty()); // false

        /*
        ========================
        ITERATION METHODS
        ========================
        */
        // Enhanced for-loop
        System.out.println("\nIterating using for-each loop:");
        for (String country : countries) {
            System.out.println(country);
        }

        // Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = countries.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /*
        ========================
        CLEAR METHOD
        ========================
        */
        countries.clear();
        System.out.println("After clear(): " + countries); // []
    }
}

