public class _1_Conversions {

    public static void main(String[] args) {
        
        // 1️⃣ String to StringBuilder:
        String text = "hello";
        StringBuilder sb1 = new StringBuilder(text);
        System.out.println(sb1);  // Output: hello

        // 2️⃣ StringBuilder to String:
        StringBuilder sb2 = new StringBuilder("world");
        String result = sb2.toString();
        System.out.println(result);  // Output: world

    }
}
