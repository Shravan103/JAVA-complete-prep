// ARRAYLIST ==> ARRAY

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2_arraylist_to_array {

    public static void main(String[] args) {
        // 📍 Arraylist to Object Array (e.g., String[], Integer[]):
        ArrayList<String> list1 = new ArrayList<>(List.of("A", "B", "C"));
        // String[] arr1 = list1.toArray(new String[0]);
        String[] arr1 = list1.toArray(String[]::new);
        System.out.println(Arrays.toString(arr1));  // [A, B, C]

        ArrayList<Integer> list2 = new ArrayList<>(List.of(10, 20, 30));
        // Integer[] arr2 = list2.toArray(new Integer[0]);
        Integer[] arr2 = list2.toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr2));  // [10, 20, 30]

        
        // 📍 Arraylist to Primitive Array (like int[]):
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        // Create an int array of same size
        int[] arr3 = new int[list.size()];
        // Use for-each loop with index
        int index = 0;
        for (int num : list) {
            arr3[index++] = num;
        }
        System.out.println(Arrays.toString(arr3));

    }
}
