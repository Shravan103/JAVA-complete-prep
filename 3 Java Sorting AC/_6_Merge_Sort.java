// 💡 MERGE SORT:
// ● Divide and Conquer Algorithm
// ● Divides the array into two halves.
// ● Recursively sorts both halves.
// ● Merges the sorted halves.
//
// 🕛 Time Complexity:
// ● Best Case = O(n log n)
// ● Average Case = O(n log n)
// ● Worst Case = O(n log n)

import java.util.Arrays;

public class _6_Merge_Sort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        System.out.println("ORIGINAL ARRAY: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("SORTED ARRAY: " + Arrays.toString(arr));
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    public static void merge(int arr[], int low, int mid, int high) {

        int temp[] = new int[arr.length];

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }
}

// OUTPUT:
// ORIGINAL ARRAY: [7, 8, 3, 1, 2]
// SORTED ARRAY: [1, 2, 3, 7, 8]