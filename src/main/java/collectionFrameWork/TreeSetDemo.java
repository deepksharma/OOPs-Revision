package collectionFrameWork;

/*
======================================================
                JAVA COLLECTIONS - TREESET
======================================================
✅ Implements NavigableSet (extends SortedSet)
✅ Stores unique elements (no duplicates)
✅ Automatically stores elements in **sorted order** (natural ordering by default)
✅ Does NOT allow null (throws NullPointerException if adding null)
✅ Backed by a Red-Black Tree (log(n) time for add, remove, search)

IMPORTANT METHODS:
------------------------------------------------------
1. add(E e)                 -> Add element in sorted order
2. remove(Object o)         -> Remove element
3. contains(Object o)       -> Check if exists
4. size()                   -> Number of elements
5. isEmpty()                -> Check if set is empty
6. clear()                  -> Remove all elements
7. iterator()               -> Iterate in ascending order
8. descendingIterator()     -> Iterate in descending order
9. first()                  -> Smallest element
10. last()                  -> Largest element
11. higher(E e)             -> Element strictly greater than e
12. lower(E e)              -> Element strictly less than e
13. ceiling(E e)            -> Element >= e
14. floor(E e)              -> Element <= e
15. subSet(from, to)        -> Range of elements
16. headSet(toElement)      -> All elements < toElement
17. tailSet(fromElement)    -> All elements >= fromElement
======================================================
*/

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {
    public static void main(String[] args) {

        // 1️⃣ Create TreeSet (Strings)
        TreeSet<String> names = new TreeSet<>();

        /*
        ========================
        ADD ELEMENTS
        ========================
        */
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Daisy");
        System.out.println("After add(): " + names);
        // Output: [Alice, Bob, Daisy, John] → sorted automatically

        // Trying to add duplicate
        boolean added = names.add("Alice");
        System.out.println("Adding duplicate 'Alice': " + added); // false
        System.out.println("After duplicate add: " + names);

        /*
        ========================
        REMOVE ELEMENTS
        ========================
        */
        names.remove("Bob");
        System.out.println("After remove(\"Bob\"): " + names);
        // Output: [Alice, Daisy, John]

        /*
        ========================
        CHECK METHODS
        ========================
        */
        System.out.println("contains(\"John\"): " + names.contains("John")); // true
        System.out.println("contains(\"Bob\"): " + names.contains("Bob")); // false
        System.out.println("size(): " + names.size()); // 3
        System.out.println("isEmpty(): " + names.isEmpty()); // false

        /*
        ========================
        SORTING + ITERATION
        ========================
        */
        // Ascending order iteration
        System.out.println("\nAscending order:");
        for (String name : names) {
            System.out.println(name);
        }

        // Descending order iteration
        System.out.println("\nDescending order:");
        Iterator<String> descIt = names.descendingIterator();
        while (descIt.hasNext()) {
            System.out.println(descIt.next());
        }

        /*
        ========================
        NAVIGABLE METHODS
        ========================
        */
        System.out.println("first(): " + names.first()); // Alice
        System.out.println("last(): " + names.last()); // John
        System.out.println("higher(\"Alice\"): " + names.higher("Alice")); // Daisy
        System.out.println("lower(\"John\"): " + names.lower("John")); // Daisy
        System.out.println("ceiling(\"Daisy\"): " + names.ceiling("Daisy")); // Daisy
        System.out.println("floor(\"Daisy\"): " + names.floor("Daisy")); // Daisy

        /*
        ========================
        RANGE METHODS
        ========================
        */
        // subSet(from, to) - from inclusive, to exclusive
        System.out.println("subSet(\"Alice\", \"John\"): " + names.subSet("Alice", "John"));
        // headSet(toElement) - all elements less than given element
        System.out.println("headSet(\"John\"): " + names.headSet("John"));
        // tailSet(fromElement) - all elements >= given element
        System.out.println("tailSet(\"Daisy\"): " + names.tailSet("Daisy"));

        /*
        ========================
        CLEAR METHOD
        ========================
        */
        names.clear();
        System.out.println("After clear(): " + names); // []
    }
}
