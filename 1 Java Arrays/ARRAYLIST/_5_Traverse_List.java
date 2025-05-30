
import java.util.ArrayList;
import java.util.Arrays;

public class _5_Traverse_List {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Mamgo", "Banana", "Watermelon"));
        // 📍 Iterating Over ArrayList:
        // Technique 1:
        System.out.println("Using standard for loop: ");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        // Technique 2:
        System.out.println("Using for-each loop: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
