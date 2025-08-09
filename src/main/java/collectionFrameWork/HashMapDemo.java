package collectionFrameWork;

/*
======================================================
            JAVA COLLECTIONS - HASHMAP
======================================================
✅ Implements **Map<K, V>** interface
✅ Stores **key-value pairs** (like a dictionary in Python)
✅ Keys are **unique** (duplicates overwrite old values)
✅ **One null key** allowed; multiple null values allowed
✅ **Unordered** — No guarantee of iteration order
✅ Backed by a **hash table** (O(1) average operations)
✅ Not thread-safe (use ConcurrentHashMap for thread safety)

🚀 INTERNAL WORKING (Important for Interviews)
------------------------------------------------------
- HashMap uses an **array of buckets**.
- Each bucket stores entries as a **LinkedList** or **Balanced Tree (TreeNode)**.
- **Hashing**: Key's hashCode() is calculated → mapped to a bucket index.
- **Collision Handling**: Uses chaining (LinkedList) or Tree (if > 8 elements in a bucket).
- Load Factor (default 0.75): When `size >= capacity * loadFactor` → Resizes (doubles capacity).
- Average time complexity: O(1) for get/put, Worst case: O(log n) with tree buckets.

📌 WHEN TO USE HASHMAP
------------------------------------------------------
- When you need **fast lookups** and insertions (O(1) average)
- When ordering of keys is NOT important
- When keys must be **unique**
- When you need to store mappings between objects

======================================================
            COMMON METHODS
======================================================
1. put(K key, V value)        -> Insert or update a key-value pair
2. get(Object key)            -> Retrieve value for a given key
3. remove(Object key)         -> Remove key-value pair by key
4. containsKey(Object key)    -> Check if a key exists
5. containsValue(Object val)  -> Check if a value exists
6. size()                     -> Number of mappings
7. isEmpty()                  -> Check if map is empty
8. clear()                    -> Remove all mappings
9. keySet()                   -> Returns Set of all keys
10. values()                  -> Returns Collection of all values
11. entrySet()                -> Returns Set of all key-value pairs (Map.Entry<K, V>)
======================================================
*/

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        // 1️⃣ Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2️⃣ Adding elements
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Cherry");
        map.put(104, "Banana"); // Duplicate value allowed
        map.put(null, "Mango"); // Null key allowed (only one)

        // 3️⃣ Updating a value for an existing key
        map.put(102, "Blueberry"); // Overwrites Banana

        // 4️⃣ Getting a value
        System.out.println("Value for key 103: " + map.get(103));

        // 5️⃣ Removing a key
        map.remove(101);

        // 6️⃣ Checking existence
        System.out.println("Contains key 104? " + map.containsKey(104));
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));

        // 7️⃣ Iterating over keys
        System.out.println("\nIterating over keys:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // 8️⃣ Iterating over values
        System.out.println("\nIterating over values:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 9️⃣ Iterating over key-value pairs
        System.out.println("\nIterating over entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 🔟 Size & Empty check
        System.out.println("\nMap Size: " + map.size());
        System.out.println("Is map empty? " + map.isEmpty());

        // 1️⃣1️⃣ Clearing the map
        map.clear();
        System.out.println("After clear, is map empty? " + map.isEmpty());
    }
}

/*
======================================================
    IMPORTANT NOTES & INTERVIEW POINTS
======================================================
1. **Load Factor**: Default is 0.75 — balances time & space complexity.
2. **Initial Capacity**: Default is 16. Always use `new HashMap<>(expectedSize)` if size is known.
3. **Hash Collisions**:
   - Before Java 8: collisions handled by LinkedList (O(n) worst case).
   - After Java 8: switched to balanced tree (O(log n) worst case) when bucket size > 8.
4. **Null Handling**:
   - Only **one null key** allowed.
   - Multiple null values allowed.
5. **Iteration Order**: Unpredictable. If you need order → use LinkedHashMap.
6. **Thread Safety**:
   - HashMap is NOT synchronized.
   - Use `Collections.synchronizedMap()` or `ConcurrentHashMap` for multi-threaded environments.
7. **Fail-Fast Behavior**:
   - Iterators throw `ConcurrentModificationException` if modified structurally after creation.
======================================================
*/

