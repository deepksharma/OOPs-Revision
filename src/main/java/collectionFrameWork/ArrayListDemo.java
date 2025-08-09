package collectionFrameWork;

/*
======================================================
                JAVA COLLECTIONS - ARRAYLIST
======================================================
✅ Ordered collection (maintains insertion order)
✅ Allows duplicate elements
✅ Allows null elements
✅ Backed by a dynamic array (fast random access)

IMPORTANT METHODS:
------------------------------------------------------
1. add(E e)                 -> Add element at end
2. add(int index, E e)      -> Add at specific position
3. get(int index)           -> Get element by index
4. set(int index, E e)      -> Replace element at index
5. remove(int index)        -> Remove by index
6. remove(Object o)         -> Remove by value
7. contains(Object o)       -> Check if element exists
8. size()                   -> Number of elements
9. isEmpty()                -> Check if list is empty
10. clear()                 -> Remove all elements
11. indexOf(Object o)       -> First occurrence index
12. lastIndexOf(Object o)   -> Last occurrence index
13. sort(Comparator)        -> Sort list (using Collections.sort)
======================================================
*/

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

        // 1️⃣ Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2️⃣ add(E e) - Add elements at the end
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("After add(): " + fruits);

        // 3️⃣ add(int index, E e) - Add element at specific index
        fruits.add(1, "Mango");
        System.out.println("After add(index, e): " + fruits);

        // 4️⃣ get(int index) - Access element
        String firstFruit = fruits.get(0);
        System.out.println("get(0): " + firstFruit);

        // 5️⃣ set(int index, E e) - Replace element
        fruits.set(2, "Grapes");
        System.out.println("After set(2, e): " + fruits);

        // 6️⃣ remove(int index) - Remove element by index
        fruits.remove(3);
        System.out.println("After remove(index): " + fruits);

        // 7️⃣ remove(Object o) - Remove element by value
        fruits.remove("Apple");
        System.out.println("After remove(Object): " + fruits);

        // 8️⃣ contains(Object o) - Check if exists
        System.out.println("contains(\"Banana\"): " + fruits.contains("Banana"));

        // 9️⃣ size() - Number of elements
        System.out.println("size(): " + fruits.size());

        // 🔟 isEmpty() - Check if empty
        System.out.println("isEmpty(): " + fruits.isEmpty());

        // 1️⃣1️⃣ indexOf(Object o) - First occurrence
        fruits.add("Mango");
        fruits.add("Banana");
        System.out.println("indexOf(\"Banana\"): " + fruits.indexOf("Banana"));

        // 1️⃣2️⃣ lastIndexOf(Object o) - Last occurrence
        System.out.println("lastIndexOf(\"Banana\"): " + fruits.lastIndexOf("Banana"));

        // 1️⃣3️⃣ sort(Comparator) - Sort list
        Collections.sort(fruits);
        System.out.println("After sort(): " + fruits);

        // 1️⃣4️⃣ clear() - Remove all elements
        fruits.clear();
        System.out.println("After clear(): " + fruits);
    }
}
