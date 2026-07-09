// 💡 QUICK SORT:
// ● Divide and Conquer Algorithm
// ● Uses first element as pivot.

// 🕛 Time Complexity:
// ● Best Case = O(n log n)
// ● Average Case = O(n log n)
// ● Worst Case = O(n²)

import java.util.Arrays;

public class _5_Quick_Sort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        System.out.println("ORIGINAL ARRAY: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("SORTED ARRAY: " + Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);

            quickSort(arr, lb, loc - 1);
            quickSort(arr, loc + 1, ub);
        }
    }

    public static int partition(int arr[], int lb, int ub) {
        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while (start < end) {

            while (start <= ub && arr[start] <= pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;

        return end;
    }
}

// OUTPUT:
// ORIGINAL ARRAY: [7, 8, 3, 1, 2]
// SORTED ARRAY: [1, 2, 3, 7, 8]