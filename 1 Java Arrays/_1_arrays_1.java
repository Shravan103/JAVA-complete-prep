// Arrays -->(has direct functions of)--> sort(), binarySearch(), 
import java.util.Arrays;

public class _1_arrays_1 {

    public static void main(String[] args) {
        // 📍 Types of array initialization
        // Technique 1️⃣: 
        int arr1[] = {1, 2, 3, 4, 5};
        // Technique 2️⃣:
        int arr2[] = new int[]{10, 20, 30, 40, 50, 60, 70};
        // Technique 3️⃣:
        int arr3[] = new int[4];
        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 30;
        arr3[3] = 40; 

        // 📍 Length of the array (No import required): array_name.length
        System.out.println("length of arr3: " + arr3.length);
        System.out.println("Length of the array: " + arr2.length);

        // 📍 Array access (No import required): array_name[index]
        System.out.println("Access 3rd element: " + arr2[2]);

        // 📍 Array To String conversion: Arrays.toString(array_name)
        String result = Arrays.toString(arr1);
        System.out.println(result);
        System.out.println("Type: " + result.getClass().getSimpleName());  // Output: String

        // 📍 Fill all values of an array: Arrays.fill(array_name, filling_value)
        int[] arr = new int[5];
        Arrays.fill(arr, 7);
        System.out.println("array filled with 7: " + Arrays.toString(arr));  // Output: [7, 7, 7, 7, 7]

        // 📍 Sorts array in ascending order: Arrays.sort(array_name)
        int[] arrSort = {5, 3, 1, 10, 2, 15};
        System.out.println("Original array: " + Arrays.toString(arrSort));
        Arrays.sort(arrSort);
        System.out.println("After sorting array: " + Arrays.toString(arrSort));

        // 📍 Searches for a value (array must be sorted) and returns the index: Arrays.binarySearch(array_name, value_to_be_searched)
        int index = Arrays.binarySearch(arrSort, 10);
        System.out.println("10 is at index: " + index);
    }
}
// OUTPUT:
// length of arr3: 4
// Length of the array: 7
// Access 3rd element: 30
// [1, 2, 3, 4, 5]
// Type: String
// array filled with 7: [7, 7, 7, 7, 7]
// Original array: [5, 3, 1, 10, 2, 15]
// After sorting array: [1, 2, 3, 5, 10, 15]
// 10 is at index: 4