import java.util.Arrays;

public class _2_arrays_2 {
    public static void main(String[] args) {
        // 📍 Copies array to a new length: Arrays.copyOf(array_name, length_of_new_array)
        int[] arr1 = {1, 2, 3};
        int[] newArr = Arrays.copyOf(arr1, 5);
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("New array: " + Arrays.toString(newArr));

        System.out.println("----------------------------------------------------");

        // 📍 Copies elements in a range: Arrays.copyOfRange(array_name, start_index, end_index) -> start_index TO end_index-1
        int[] arr2 = {10, 20, 30, 40, 50};
        int[] part = Arrays.copyOfRange(arr2, 1, 4);  // index 1 to 3
        System.out.println("Original array: " + Arrays.toString(arr2));
        System.out.println("New array: " + Arrays.toString(part));

        System.out.println("----------------------------------------------------");

        // 📍 Checks if two arrays are equal: Arrays.equals(array_name_1, array_name_2)
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println("array1 and array2 are equal? " + Arrays.equals(a, b));    // returns TRUE
    }
}

// OUTPTUT:
// Original array: [1, 2, 3]
// New array: [1, 2, 3, 0, 0]
// ----------------------------------------------------
// Original array: [10, 20, 30, 40, 50]
// New array: [20, 30, 40]
// ----------------------------------------------------
// array1 and array2 are equal? true

// 📍 Deep Copy vs Shallow Copy
// Shallow Copy: Copies the reference of the original array to the new array.
// Changes made to the new array WILL affect the original array (and vice versa).
// Deep Copy: Copies the actual values of the original array to the new array.
// Changes made to the new array will not affect the original array.

// 📍 Deep Copy for Primitive Arrays
//_________Method___________|__💡__Creates Deep Copy for Primitive Arrays?____|
// Arrays.copyOf()          | ✅ Yes                                          |
// Arrays.copyOfRange()     | ✅ Yes                                          |
// System.arraycopy()       | ✅ Yes (for primitives)                         |
// clone()                  | ✅ Yes (for primitives)                         |