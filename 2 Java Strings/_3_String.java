public class _3_String {
    public static void main(String[] args) {

        // ❤️ startsWith(), endsWith(), contains():
        String line = "Java is powerful";
        // Checks if the string starts with the given prefix
        System.out.println(line.startsWith("Java")); // true
        // Checks if the string ends with the given suffix
        System.out.println(line.endsWith("ful")); // true
        // Checks if the string contains a sequence
        System.out.println(line.contains("is")); // true

        // ❤️ indexOf(), lastIndexOf(), replace() -> (works for Character an well as String)
        String msg = "banana";
        // Returns the first index of the specified Character and String
        System.out.println("First index of 'a': " + msg.indexOf('a')); // 1
        // Returns the last index of the specified Character and String
        System.out.println("Last index of 'a': " + msg.lastIndexOf('a')); // 5
        // Replaces all occurrences of a Character / String with another (Doesn't recognize Regex expression)
        System.out.println("Replace 'a' with 'o': " + msg.replace('a', 'o')); // "bonono"
    }
}
