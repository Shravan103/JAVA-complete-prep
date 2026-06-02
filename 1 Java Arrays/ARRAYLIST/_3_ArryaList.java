// 📍 Necessary import for ArrayList:
// ArrayList -->(has functions like)--> Collections.sort(), Collections.reverse(), Collections.binarySearch()
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
        //fruits.remove(String.valueOf("Dragon Fruit"));        //Alternative: Remove by value
        System.out.println("Removed element at index 2 using remove(index): " + fruits);

        // 📍 Remove by Value v/s Remove by Index:
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4, 9));
        System.out.println("Original ArrayList: " + list);
        // 1. remove by index
        list.remove(1); // Removes element at index 1
        System.out.println("Index removed: " + list);
        // 2. remove by value
        // list.remove(Integer.valueOf(9)); // Removes value 9 OR list.remove(list.indexOf(9)));
        System.out.println("Value removed: " + list);
        
    }
}

// OUTPUT:
// fruits ArrayList = [Apple, Banana, Cherry]
// UPDATED fruits ArrayList = [Apple, Dragon Fruit, Banana, Cherry]
// First fruit accessed using get(index): Apple
// Modified ArrayList using set(index, element): [Apple, Blueberry, Banana, Cherry]
// Removed element at index 2 using remove(index): [Apple, Blueberry, Cherry]
// Original ArrayList: [1, 2, 3, 5, 4, 9]
// Index removed: [1, 3, 5, 4, 9]
// Value removed: [1, 3, 5, 4]