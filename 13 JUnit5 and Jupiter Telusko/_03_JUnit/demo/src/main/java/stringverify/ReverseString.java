package stringverify;

/**
 * Hello world!
 *
 */
public class ReverseString 
{
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
