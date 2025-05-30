
import java.util.ArrayList;

public class _4_ArrayList {

    public static void main(String[] args) {
        // 📍 size of the ArrayList:
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        System.out.println("Size: " + list1.size());

        // 📍 Check if a ArrayList contains a value or not (returns a boolean value):
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Laptop");
        System.out.println("Contains \"Laptop\"?: " + list2.contains("Laptop"));
        System.out.println("Contains \"Phone\"?: " + list2.contains("Phone"));

        // 📍 Get Index of a particular value:
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Red");
        System.out.println("Index of \"Red\": " + list.indexOf("Red"));

        // 📍 Check if two ArrayList are equal (returns Boolean value):
        ArrayList<String> list11 = new ArrayList<>();
        ArrayList<String> list12 = new ArrayList<>();
        list11.add("A");
        list12.add("A");
        System.out.println(list11.equals(list12));

    }
}
