// 💡 HashSet:
// - It is part of the Java Collections Framework.
// - It is a collection of unique elements.
// - It is implemented using a hash table.
// - It does not maintain any order.
// - It allows null values.
// - It is not synchronized.
// - It is not thread-safe.

import java.util.HashSet;
import java.util.Iterator;

public class _1_HashSet {

    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        //📍 Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);      // duplicate, won’t be added again

        //📍 Size
        System.out.println("size of set is : " + set.size());

        //📍 Search: contains() returns true or false
        if (set.contains(1)) {
            System.out.println("1 is present");
        }

        if (!set.contains(6)) {
            System.out.println("6 is absent");
        }

        //📍 Delete
        set.remove(1);
        System.out.println("After Deleting {1} size of set is: " + set.size());
        if (!set.contains(1)) {
            System.out.println("1 is absent");
        }

        //📍 Print all elements
        System.out.println("Print all elements: "+set);

        //📍 Iteration - HashSet does not have an order
        set.add(0);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();

        //📍 isEmpty
        if (!set.isEmpty()) {
            System.out.println("set is not empty");
        }
    }
}
