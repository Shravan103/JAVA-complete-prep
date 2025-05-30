public class _2_String {
    public static void main(String[] args) {

        // ❤️ Common String Methods
        String str = " Java Programming ";
        System.out.println("Original: '" + str + "'");
        System.out.println("Trimmed: '" + str.trim() + "'");
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring (5-16): " + str.substring(5, 16));

        // ❤️ Comparing Strings
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b); // true (same reference)
        System.out.println(a == c); // false (different object)
        System.out.println(a.equals(c)); // true (same content)

        // ❤️ equals(), equalsIgnoreCase(), compareTo() - String Comparison:
        String a1 = "Java";
        String b1 = "java";
        // 1. Checks if strings are exactly equal (case-sensitive)
        System.out.println(a1.equals(b1)); // false
        // 2. Ignores case while comparing
        System.out.println(a1.equalsIgnoreCase(b1)); // true
        // 3. Checks strings lexicographically. Positive -> a1 > b1, Negative -> a1 < b1
        System.out.println(a1.compareTo(b1));  //-32: a1 < b1
    }
}
