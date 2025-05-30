
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _8_Declaration_and_Initialization {

    public static void main(String[] args) {

        // ❤️ Using List.of(...) — Mutable after wrapping
        ArrayList<String> listFromListOf = new ArrayList<>(List.of("A", "B", "C"));
        listFromListOf.add("D");  // ✅ Works
        System.out.println(listFromListOf);  // Output: [A, B, C, D]

        // ❤️ Using Arrays.asList(...) — Mutable after wrapping
        ArrayList<String> listFromArrays = new ArrayList<>(Arrays.asList("A", "B", "C"));
        listFromArrays.remove("B");  // ✅ Works
        System.out.println(listFromArrays);  // Output: [A, C]

        // ❤️ Manual add() using new ArrayList<>() — Fully Mutable
        ArrayList<String> manualList = new ArrayList<>();
        manualList.add("A");
        manualList.add("B");
        manualList.set(1, "Z");  // ✅ Works
        System.out.println(manualList);  // Output: [A, Z]

    }
}

// ✅ 1. Mutability:
// ◉ Arrays.asList():
// Returns a fixed-size, mutable list backed by the original array. You can modify elements, but you can't add or remove elements.
// List<String> list = Arrays.asList("a", "b");
// list.set(0, "z");      // ✅ Allowed
// list.add("c");         // ❌ Throws UnsupportedOperationException
// ====================================================================
// ◉ List.of() (Java 9+):
// Returns an immutable list. You can't modify, add, or remove elements.
// List<String> list = List.of("a", "b");
// list.set(0, "z");      // ❌ Throws UnsupportedOperationException
// list.add("c");         // ❌ Throws UnsupportedOperationException

// x------------------x--------------------x-------------------x--------------------x---------------------x-----------------x

// ✅ 2. Null Elements:
// ◉ Arrays.asList():
// ✅ Allows null elements.
// List<String> list = Arrays.asList("a", null, "b");  // ✅ Works
// ====================================================================
// ◉ List.of():
// ❌ Throws NullPointerException if any element is null.
// List<String> list = List.of("a", null, "b");  // ❌ Runtime Exception