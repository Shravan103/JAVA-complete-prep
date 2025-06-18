import java.util.ArrayList;
import java.util.HashMap;

// A simple implementation of LRU Cache using HashMap and ArrayList
public class LRU_implementation {
    final private int capacity; // Maximum size of the cache
    final private HashMap<Integer, String> map; // Stores key-value pairs
    final private ArrayList<Integer> usageOrder; // Maintains the order of usage (recently used at end), stores keys

    // Constructor to initialize cache with a given capacity
    public LRU_implementation(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.usageOrder = new ArrayList<>();
    }

    // Get the value for a key and mark it as recently used
    public String get(int key) {
        if (!map.containsKey(key)) {
            return null; // Key not found in cache
        }

        // Move the key to the end to mark it as recently used
        usageOrder.remove(Integer.valueOf(key));
        usageOrder.add(key);

        return map.get(key); // Return the corresponding value
    }

    // Put a key-value pair into the cache
    public void put(int key, String value) {
        if (map.containsKey(key)) {
            // If key already exists, update value and move to recently used
            map.put(key, value);
            usageOrder.remove(Integer.valueOf(key));
            usageOrder.add(key);
            return;
        }

        // If cache is full, remove the least recently used item (at front)
        if (map.size() >= capacity) {
            int lruKey = usageOrder.remove(0); // Get and remove oldest key
            map.remove(lruKey); // Remove it from map
        }

        // Add the new key-value pair
        map.put(key, value);
        usageOrder.add(key); // Add to end to mark as recently used
    }

    // Display the current state of the cache (in LRU order)
    public void display() {
        System.out.print("Cache state: ");
        for (int key : usageOrder) {
            System.out.print(key + "=" + map.get(key) + "  ");
        }
        System.out.println();
    }

    // Main method to demonstrate how the cache works
    public static void main(String[] args) {
        // Create a cache with capacity 3
        LRU_implementation cache = new LRU_implementation(3);

        // Step 1: Add 3 items
        cache.put(1, "One");   // Cache: 1=One
        cache.put(2, "Two");   // Cache: 1=One, 2=Two
        cache.put(3, "Three"); // Cache: 1=One, 2=Two, 3=Three
        cache.display();       // Output: 1=One 2=Two 3=Three

        // Step 2: Access key 2, makes it most recently used
        cache.get(2);          // Cache order becomes: 1=One, 3=Three, 2=Two

        // Step 3: Add key 4. Since capacity is full, LRU (key 1) is removed
        cache.put(4, "Four");  // Cache: 3=Three, 2=Two, 4=Four
        cache.display();       // Output: 3=Three 2=Two 4=Four
    }
}
