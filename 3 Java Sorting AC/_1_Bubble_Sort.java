// 💡 BUBBLE SORT -> Pushes the largest element to end of the array in each iteration.
// 🕛 Time Complexity:
// ● Best Case = O(n²)
// ● Worst Case = O(n²)

import java.util.Arrays;
public class _1_Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        System.out.println("ORIGINAL ARRAY: " + Arrays.toString(arr));

        for(int i=0 ; i<arr.length-1 ; i++)
        {
            for(int j=0 ; j<arr.length-1-i ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("SORTED ARRAY: " + Arrays.toString(arr));
    }
}