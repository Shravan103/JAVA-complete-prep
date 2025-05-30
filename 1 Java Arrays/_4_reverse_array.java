// Reverse the array MANUALLY
import java.util.Arrays;

public class _4_reverse_array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("Reversed: " + Arrays.toString(arr));

    }
}
// OUTPUT:
// Reversed: [5, 4, 3, 2, 1]