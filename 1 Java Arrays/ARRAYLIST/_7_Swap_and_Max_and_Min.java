import java.util.ArrayList;
import java.util.Collections;

public class _7_Swap_and_Max_and_Min {

    public static void main(String[] args) {

        // 📍 Swap elements in a ArrayList:
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println("Before Swap: " + list);
        Collections.swap(list, 0, 2);
        System.out.println("After Swap: " + list);

        // 📍 Find max and min in a ArrayList:
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(30);
        nums.add(10);
        nums.add(50);
        System.out.println("Max: " + Collections.max(nums));
        System.out.println("Min: " + Collections.min(nums));
    }
}
//OUTPUT:
// Before Swap: [One, Two, Three]
// After Swap: [Three, Two, One]
// Max: 50
// Min: 10