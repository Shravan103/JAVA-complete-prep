// 💡 BUBBLE SORT:
// 🕛 Time Complexity:
// ● Best Case = O(n)
// ● Worst Case = O(n²)

import java.util.Arrays;
public class _2_Optimized_Bubble_Sort {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 8, 5};  // Partly sorted array (only 2 times loops)
        int[] arr = {1, 2, 3, 4, 5}; // Already sorted array (n-1 loops)
        System.out.println("ORIGINAL ARRAY: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("hi");
            // If no two elements were swapped in the inner loop (array is already sorted), break
            if (!swapped) {
                break;
            }
        }

        System.out.println("SORTED ARRAY: " + Arrays.toString(arr));
    }
}
