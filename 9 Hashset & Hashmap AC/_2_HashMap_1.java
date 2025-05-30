// 💡 HashMap:
// - It is a part of the Java Collections Framework.
// - It is a collection of key-value pairs.
// - It is implemented using a hash table.
// - It does not maintain any order.
// - It allows null keys and null values.
// - It is not synchronized.
// - It is not thread-safe.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _2_HashMap_1 {

    public static void main(String args[]) {
        // 📍 Creation
        HashMap<String, Integer> map = new HashMap<>();

        // 📍 Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println("map: " + map);

        map.put("China", 180);   //updating value of key "China"
        System.out.println(map);

        // 📍 Searching
        if (map.containsKey("Indonesia")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("China")); //key exists
        System.out.println(map.get("Indonesia")); //key doesn't exist

        // 📍 Iteration (1)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // 📍 Iteration (2)
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // 📍 Removing
        map.remove("China");
        System.out.println(map);

    }
}
