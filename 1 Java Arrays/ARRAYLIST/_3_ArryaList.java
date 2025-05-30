// 📍 Necessary import for ArrayList:

import java.util.ArrayList;
import java.util.Arrays;

public class _3_ArryaList {

    public static void main(String[] args) {
        // 📍 Syntax:
        // ArrayList<Type> list = new ArrayList<>();

        // 📍 Simple Example:
        ArrayList<String> fruits = new ArrayList<>();

        // 📍 add elements to ArrayList:
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("fruits ArrayList = " + fruits);
        fruits.add(1, "Dragon Fruit");
        System.out.println("UPDATED fruits ArrayList = " + fruits);

        // 📍 get/access element at an index:
        System.out.println("First fruit accessed using get(index): " + fruits.get(0));  // Index starts at 0

        // 📍 Modifying existint element:
        fruits.set(1, "Blueberry");  // Replaces Dragon Fruit with Blueberry.
        System.out.println("Modified ArrayList using set(index, element): " + fruits);

        // 📍 Remove an element at any index:
        fruits.remove(2);  // Removes element at index 2
        System.out.println("Removed element at index 2 using remove(index): " + fruits);

        // 📍 Remove by Value v/s Remove by Index:
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4, 9));
        System.out.println("Original ArrayList: " + list);
        // 1. remove by index
        list.remove(1); // Removes element at index 1
        System.out.println("Index removed: " + list);
        // 2. remove by value
        list.remove(Integer.valueOf(9)); // Removes value 9
        System.out.println("Value removed: " + list);
        
    }
}
