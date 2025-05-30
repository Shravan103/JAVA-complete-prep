// 💡 Insert and Remove an element in an array MANUALLY

import java.util.Arrays;

public class _5_Insert_and_Remove_element {

    public static void main(String[] args) {
        // 📍 Insert element at specific index MANUALLY
        int[] arr = {10, 20, 30, 40};
        int index = 2;
        int element = 25;

        int[] newArr = new int[arr.length + 1];

        // Copy arr elements before index and put into newArr
        System.arraycopy(arr, 0, newArr, 0, index);

        // Insert element
        newArr[index] = element;

        // Shift rest
        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);

        System.out.println("After Insert at index " + index + ": " + Arrays.toString(newArr));

        // 📍 Remove an elemnet at specific index MANUALLY
        int[] arr2 = {10, 20, 30, 40, 50};
        int removeIndex = 2;
        int[] newArr2 = new int[arr2.length - 1];

        // Copy excluding the removed index
        for (int i = 0, j = 0; i < arr2.length; i++) {
            if (i != removeIndex) {
                newArr2[j++] = arr2[i];
            }
        }
        System.out.println("After Removing index " + removeIndex + ": " + Arrays.toString(newArr2));

    }
}
