// 💡 INSERTION SORT:
// 🕛 Time Complexity:
// ● Best Case = O(n)
// ● Worst Case = O(n²)

import java.util.Arrays;
public class _4_Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        System.out.println("ORIGINAL ARRAY: " + Arrays.toString(arr));

        for(int i=1 ; i<arr.length ; i++)
        {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        System.out.println("SORTED ARRAY: " + Arrays.toString(arr));
    }
}
