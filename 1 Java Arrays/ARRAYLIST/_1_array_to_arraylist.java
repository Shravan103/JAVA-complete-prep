// ARRAY ==> ARRAYLIST
import java.util.ArrayList;
import java.util.Arrays;

public class _1_array_to_arraylist {

    public static void main(String[] args) {
        // 📍 Object Arrays (like String[], Integer[]) to Arraylist:
        String[] arr1 = {"apple", "banana", "cherry"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        System.out.println("list1: " + list1);  // [apple, banana, cherry]

        // 📍 Primitive Arrays (like int[]) to Arraylist:
        int[] arr2 = {1, 2, 3, 4};
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int num : arr2) {
            list2.add(num);
        }
        System.out.println("list2: " + list2);

    }
}
