// 💡 Null Values in HashMap:
//  - HashMap allows null keys and null values
//  - but only one null key is allowed.
//  - If you try to add a second null key, it will replace the first one.

import java.util.HashMap;

public class _2_HashMap_2 {

    public static void main(String[] args) {

        HashMap<String, String> map2 = new HashMap<>();

        map2.put(null, null);                 // ✅ null key, null value
        map2.put("key1", null);               // ✅ normal key, null value
        map2.put(null, "value1");             // ✅ replaces previous null key entry
        map2.put("key2", "value2");           // ✅ normal key, normal value

        System.out.println("map2: " + map2);
    }
}
