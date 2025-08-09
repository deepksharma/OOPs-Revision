package collectionFrameWork;

/*
======================================================
            JAVA COLLECTIONS - LINKEDHASHMAP
======================================================
✅ Implements Map interface (extends HashMap)
✅ Stores key-value pairs (unique keys, one null key, multiple null values allowed)
✅ Maintains **insertion order** (unlike HashMap which is unordered)
✅ Backed by a combination of **HashMap + Doubly Linked List** internally
✅ Slightly slower than HashMap due to ordering maintenance
✅ Useful when you need **fast lookups + predictable iteration order**

INTERNAL WORKING:
------------------------------------------------------
- Keys stored in a HashMap for O(1) lookup
- A doubly linked list maintains insertion order
- Each entry maintains references to previous and next nodes

CONSTRUCTORS:
------------------------------------------------------
1. LinkedHashMap()
   -> Creates empty LinkedHashMap (insertion-order)
2. LinkedHashMap(int initialCapacity)
   -> With custom capacity
3. LinkedHashMap(int initialCapacity, float loadFactor)
   -> With capacity + load factor
4. LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
   -> If accessOrder = true → iteration order is based on most-recently accessed
      (can be used for LRU Cache)

IMPORTANT METHODS:
------------------------------------------------------
1. put(K key, V value)
   -> Adds key-value pair (replaces value if key already exists)
2. get(Object key)
   -> Returns value for given key or null if not found
3. remove(Object key)
   -> Removes mapping for the key
4. containsKey(Object key)
   -> Returns true if key exists
5. containsValue(Object value)
   -> Returns true if value exists
6. size()
   -> Number of key-value mappings
7. isEmpty()
   -> Checks if map is empty
8. clear()
   -> Removes all mappings
9. keySet()
   -> Returns Set<K> of keys
10. values()
   -> Returns Collection<V> of values
11. entrySet()
   -> Returns Set<Map.Entry<K,V>> for iterating key-value pairs
12. forEach(BiConsumer)
   -> Iterate using lambda
13. getOrDefault(Object key, V defaultValue)
   -> Returns value if key exists else defaultValue
14. replace(K key, V value)
   -> Replaces value only if key exists
15. replace(K key, V oldValue, V newValue)
   -> Replaces value only if old value matches

USAGE EXAMPLES:
------------------------------------------------------
*/

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Create LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Adding elements
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        // Maintain insertion order
        System.out.println(map); // {A=1, B=2, C=3, D=4}

        // Access order example
        LinkedHashMap<String, Integer> accessOrderMap =
                new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put("X", 100);
        accessOrderMap.put("Y", 200);
        accessOrderMap.put("Z", 300);
        accessOrderMap.get("X"); // Accessing X moves it to the end
        System.out.println(accessOrderMap); // {Y=200, Z=300, X=100}

        // Common methods
        System.out.println(map.get("B")); // 2
        System.out.println(map.containsKey("C")); // true
        System.out.println(map.containsValue(4)); // true
        map.remove("A");
        System.out.println(map); // {B=2, C=3, D=4}

        // Iterating in insertion order
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

/*
NOTES & IMPORTANT POINTS:
------------------------------------------------------
1. LinkedHashMap is slower than HashMap for insertions due to order tracking.
2. Ideal when you need **both** fast lookup and predictable iteration order.
3. accessOrder=true is powerful for caching (e.g., LRU cache implementation).
4. Can store one null key and multiple null values.
5. Initial capacity and load factor tuning is same as HashMap.
6. Iteration over LinkedHashMap is consistent and ordered.
======================================================
*/

