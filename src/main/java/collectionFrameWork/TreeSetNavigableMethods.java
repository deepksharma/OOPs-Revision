package collectionFrameWork;

import java.util.*;

public class TreeSetNavigableMethods {
    public static void main(String[] args) {
        // TreeSet stores elements in sorted (ascending) order by default
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        System.out.println("Original TreeSet: " + set);

        /* -------------------- NAVIGABLE METHODS -------------------- */
        // 1. lower(E e): Returns the greatest element < given element, else null
        System.out.println("lower(40): " + set.lower(40)); // 30

        // 2. floor(E e): Returns the greatest element ≤ given element, else null
        System.out.println("floor(40): " + set.floor(40)); // 40

        // 3. higher(E e): Returns the smallest element > given element, else null
        System.out.println("higher(40): " + set.higher(40)); // 50

        // 4. ceiling(E e): Returns the smallest element ≥ given element, else null
        System.out.println("ceiling(40): " + set.ceiling(40)); // 40

        // 5. pollFirst(): Removes and returns the first (lowest) element
        System.out.println("pollFirst(): " + set.pollFirst()); // 10
        System.out.println("After pollFirst(): " + set);

        // 6. pollLast(): Removes and returns the last (highest) element
        System.out.println("pollLast(): " + set.pollLast()); // 70
        System.out.println("After pollLast(): " + set);

        // 7. descendingSet(): Returns a view of the set in reverse order
        NavigableSet<Integer> descSet = set.descendingSet();
        System.out.println("Descending order view: " + descSet);

        // 8. descendingIterator(): Iterator for reverse order traversal
        System.out.print("Reverse iteration: ");
        Iterator<Integer> descItr = set.descendingIterator();
        while (descItr.hasNext()) {
            System.out.print(descItr.next() + " "); // 60 50 40 30 20
        }
        System.out.println();

        /* -------------------- RANGE METHODS -------------------- */
        TreeSet<Integer> rangeSet = new TreeSet<>(Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40));

        // 1. subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
        // Range between 15 and 35 inclusive of 15, exclusive of 35
        System.out.println("subSet(15,true,35,false): " +
                rangeSet.subSet(15, true, 35, false)); // [15, 20, 25, 30]

        // 2. headSet(E toElement): Returns all elements < toElement
        System.out.println("headSet(25): " + rangeSet.headSet(25)); // [5, 10, 15, 20]

        // 3. headSet(E toElement, boolean inclusive): Allows inclusive bound
        System.out.println("headSet(25, true): " + rangeSet.headSet(25, true)); // [5, 10, 15, 20, 25]

        // 4. tailSet(E fromElement): Returns all elements ≥ fromElement
        System.out.println("tailSet(20): " + rangeSet.tailSet(20)); // [20, 25, 30, 35, 40]

        // 5. tailSet(E fromElement, boolean inclusive): Can exclude starting element
        System.out.println("tailSet(20, false): " + rangeSet.tailSet(20, false)); // [25, 30, 35, 40]

        // Example of chaining range methods
        System.out.println("Chained range: tailSet(15).headSet(35): " +
                rangeSet.tailSet(15).headSet(35)); // [15, 20, 25, 30]
    }
}
