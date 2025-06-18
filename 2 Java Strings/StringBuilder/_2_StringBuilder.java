public class _2_StringBuilder {

    public static void main(String[] args) {
        // ❤️ Create a StringBuilder with an initial string
        StringBuilder sb = new StringBuilder("Hello Bello");
        System.out.println("Original StringBuilder: " + sb);

        // ❤️ Find length of the StringBuffer:
        System.out.println("Length of original StringBuilder: " + sb.length());

        // ❤️ Get the character at particular index:
        System.out.println("Character at index 4 of original StringBuilder: " + sb.charAt(7));

        // ❤️ Append a string to the StringBuilder
        sb.append(" World");
        System.out.println("After append(): " + sb);

        // ❤️ Insert a string at a specific position
        sb.insert(5, ",");  // After "Hello"
        System.out.println("After insert(): " + sb);

        // ❤️ Delete a portion of the string (from index 6 to 11-1=10)
        sb.delete(6, 11);
        System.out.println("After delete(): " + sb);

        // ❤️ Replace a portion of the string (only first occurence replaced)
        sb.replace(0, 5, "Hi");     // (from 0 to 5-1 = 4)
        System.out.println("After replace(): " + sb);

        // ❤️ Extracts a substring from the StringBuilder:
        String subStr = sb.substring(6, 10);
        System.out.println("After substring, substr = " + subStr);

        // ❤️ Returns the index of the first occurrence of the specified substring or character
        int index = sb.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // ❤️ Convert StringBuilder to String
        String result = sb.toString();
        System.out.println(result);  // Output: Hi,o World

        // ❤️ Reverses the sequence of characters in the StringBuilder.
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.reverse();
        System.out.println("Reversed String: " + sb2);


    }
}
// OUTPUT:
// Original StringBuilder: Hello Bello
// Length of original StringBuilder: 11
// Character at index 4 of original StringBuilder: e
// After append(): Hello Bello World
// After insert(): Hello, Bello World
// After delete(): Hello,o World
// After replace(): Hi,o World
// After substring, substr = orld
// Index of 'World': 5
// Hi,o World
// Reversed String: olleH