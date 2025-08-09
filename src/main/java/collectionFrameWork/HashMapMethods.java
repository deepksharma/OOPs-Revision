package collectionFrameWork;

/*
======================================================
                JAVA COLLECTIONS - HASHMAP
======================================================
✅ Implements: Map<K, V> interface
✅ Stores data in **key-value pairs**
✅ Allows **null key** (only 1) and multiple null values
✅ Keys are **unique** (no duplicates), values can be duplicate
✅ Not synchronized (not thread-safe, use ConcurrentHashMap if needed)
✅ **No guaranteed order** of keys/values
✅ Backed by an array + linked list + tree (since Java 8) for collision handling
------------------------------------------------------
🔹 Internal Working:
- HashMap uses the key's `hashCode()` to find a bucket index.
- If collision occurs, stores entries in a linked list (Java 7) or balanced tree (Java 8+ if chain length > 8).
------------------------------------------------------
📌 Common Use Cases:
- Fast lookups by key
- Caching
- Storing mapping configurations
======================================================
*/

// Import
import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {

        // ======================================================
        // 1️⃣ CREATE & ADD ELEMENTS
        // ======================================================
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");      // Adds key=1, value="Apple"
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(2, "Orange");     // Updates value for key=2
        map.put(null, "Kiwi");    // Null key allowed
        map.put(4, null);         // Null value allowed
        map.put(5, null);         // Multiple null values allowed

        System.out.println("Initial Map: " + map);

        // ======================================================
        // 2️⃣ ACCESS VALUES
        // ======================================================
        System.out.println("Value for key 2: " + map.get(2));       // Orange
        System.out.println("Value for key 10 (not exists): " + map.get(10)); // null

        // getOrDefault -> returns default value if key doesn't exist
        System.out.println("Get or Default: " + map.getOrDefault(10, "Not Found"));

        // ======================================================
        // 3️⃣ REMOVE ELEMENTS
        // ======================================================
        map.remove(3);               // Remove by key
        map.remove(4, null);         // Remove only if key-value matches
        System.out.println("After removal: " + map);

        // ======================================================
        // 4️⃣ CHECK EXISTENCE
        // ======================================================
        System.out.println("Contains Key 1? " + map.containsKey(1));
        System.out.println("Contains Value 'Banana'? " + map.containsValue("Banana"));

        // ======================================================
        // 5️⃣ SIZE & EMPTY CHECK
        // ======================================================
        System.out.println("Map size: " + map.size());
        System.out.println("Is map empty? " + map.isEmpty());

        // ======================================================
        // 6️⃣ ITERATING METHODS
        // ======================================================

        // a) Iterate over keys
        System.out.println("Keys:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // b) Iterate over values
        System.out.println("Values:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        // c) Iterate over key-value pairs
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // d) Using forEach (Java 8+)
        System.out.println("Using forEach lambda:");
        map.forEach((key, value) -> System.out.println(key + " => " + value));

        // ======================================================
        // 7️⃣ ADVANCED METHODS
        // ======================================================

        // replace() - update only if key exists
        map.replace(2, "Orange", "Mango"); // Replaces if key=2 & value=Orange
        map.replace(5, "Pineapple");       // Replaces value for key=5
        System.out.println("After replace: " + map);

        // putIfAbsent() - adds only if key not already present
        map.putIfAbsent(6, "Papaya");
        map.putIfAbsent(2, "Strawberry"); // Won't add, key exists
        System.out.println("After putIfAbsent: " + map);

        // merge() - merges values
        map.merge(1, " Juice", (oldVal, newVal) -> oldVal + newVal);
        System.out.println("After merge: " + map);

        // computeIfAbsent - computes value if key not present
        map.computeIfAbsent(7, k -> "Dragonfruit");
        System.out.println("After computeIfAbsent: " + map);

        // computeIfPresent - updates value if key present
        map.computeIfPresent(1, (k, v) -> v + " Pie");
        System.out.println("After computeIfPresent: " + map);

        // ======================================================
        // 8️⃣ CLEAR
        // ======================================================
        map.clear();
        System.out.println("After clear: " + map);
    }
}

/*
======================================================
📝 NOTES & BEST PRACTICES FOR HASHMAP
======================================================
1. Use HashMap when:
   - You need fast lookups (O(1) avg complexity).
   - Key order is NOT important.

2. Avoid HashMap when:
   - You need sorted keys (use TreeMap instead).
   - You need predictable iteration order (use LinkedHashMap).

3. Null handling:
   - Only ONE null key allowed.
   - Multiple null values allowed.

4. Thread Safety:
   - Not synchronized; use `Collections.synchronizedMap()` or `ConcurrentHashMap` in multithreaded environments.

5. Performance Tips:
   - Choose correct initial capacity if expecting large data to avoid rehashing.
   - Load factor default = 0.75 (good balance between speed & memory).

6. Java 8 Improvement:
   - Collisions are handled using balanced trees (instead of linked list) if chain length > 8, improving worst-case performance from O(n) → O(log n).
======================================================
*/
