import java.util.Arrays;

public class _4_Reverse_Sort_Search {

    public static void main(String[] args) {
        // ❤️ Reverse a String:
        String str1 = "hello";
        char[] chars1 = str1.toCharArray();
        int n = chars1.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = chars1[i];
            chars1[i] = chars1[n - 1 - i];
            chars1[n - 1 - i] = temp;
        }
        String reversed = new String(chars1);
        System.out.println("Reversed: " + reversed); // "olleh"

        // ❤️ Sort a String:
        String str2 = "zebra";
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2); // sort alphabetically
        String sorted = new String(chars2);
        System.out.println("Sorted: " + sorted); // "aberz"

        // ❤️ Search for character in a String:
        String word = "banana";
        // Find the index of character 'n'
        int index = word.indexOf('n');
        if (index != -1) {
            System.out.println("'n' is found at index: " + index);   // 2
        }
        else {
            System.out.println("'n' is not found");
        }

    }
}
