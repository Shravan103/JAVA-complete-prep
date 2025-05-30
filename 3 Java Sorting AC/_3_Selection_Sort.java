// 💡 SELECTION SORT -> Pushes the smallest element to start of the array in each iteration.
// 🕛 Time Complexity:
// ● Best Case = O(n²)
// ● Worst Case = O(n²)

import java.util.Arrays;
public class _3_Selection_Sort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        System.out.println("ORIGINAL ARRAY: " + Arrays.toString(arr));

        for(int i=0 ; i<arr.length-1 ; i++)
        {
            int smallest = i;
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[smallest] > arr[j])
                {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("SORTED ARRAY: " + Arrays.toString(arr));
    }
}


/*

Original Array: [7, 8, 3, 1, 2]

1st Iteration (i = 0):
- Find the smallest element from index 0 to 4.
- Compare 7 with 8 → 7 is smaller.
- Compare 7 with 3 → 3 is smaller → update smallest = 2.
- Compare 3 with 1 → 1 is smaller → update smallest = 3.
- Compare 1 with 2 → 1 is smaller.
- Swap arr[0] and arr[3]:
  [1, 8, 3, 7, 2]

2nd Iteration (i = 1):
- Find the smallest element from index 1 to 4.
- Compare 8 with 3 → 3 is smaller → update smallest = 2.
- Compare 3 with 7 → 3 is smaller.
- Compare 3 with 2 → 2 is smaller → update smallest = 4.
- Swap arr[1] and arr[4]:
  [1, 2, 3, 7, 8]

3rd Iteration (i = 2):
- Find the smallest element from index 2 to 4.
- Compare 3 with 7 → 3 is smaller.
- Compare 3 with 8 → 3 is smaller.
- No swap needed as 3 is already at correct place.
  [1, 2, 3, 7, 8]

4th Iteration (i = 3):
- Find the smallest element from index 3 to 4.
- Compare 7 with 8 → 7 is smaller.
- No swap needed as 7 is already at correct place.
  [1, 2, 3, 7, 8]

Sorted Array: [1, 2, 3, 7, 8]

*/
