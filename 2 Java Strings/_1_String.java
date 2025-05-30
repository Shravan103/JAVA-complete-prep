public class _1_String{
    public static void main(String[] args) {
        // ❤️ Declaring and Printing Strings:
        String greeting = "Hello, World!";
        System.out.println("greeting = " + greeting);

        // ❤️ Concatenation:
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Concatinated String = " + fullName);

        // ❤️ String Length and Character Access
        String name = "Alice";
        System.out.println("Length: " + name.length());
        System.out.println("First character: " + name.charAt(0));

        // ❤️ String Immutability
        String s1 = "Hello";
        // s1.concat(" World"); // This won't change s1
        System.out.println(s1); // Still "Hello"
        // s1.concat(" World") creates a new string but doesn't change s1.
    }
}