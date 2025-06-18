
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _6_Sorting_Reverse_Searching {

    public static void main(String[] args) {

        // 📍 Sorting:
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(30, 10, 20, 85, 11, 90));
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        // 📍 Searching: ArrayList must be sorted before binarySearch
        int index = Collections.binarySearch(numbers, 20);
        System.out.println("Index of value 20: " + index);

        // 📍 Reverse:
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

    }
}
// Output:
// Sorted: [10, 11, 20, 30, 85, 90]
// Index of value 20: 2
// Reversed: [90, 85, 30, 20, 11, 10]
