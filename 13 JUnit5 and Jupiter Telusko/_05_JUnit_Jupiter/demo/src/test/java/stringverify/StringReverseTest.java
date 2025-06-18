package stringverify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringReverseTest {
    @Test
    public void reverse_one_word() {    // This method can be default or public
        ReverseString reverseString = new ReverseString();
        String actual = reverseString.reverse("hello");
        String expected = "olleh";
        assertEquals(expected, actual);
    }

    @Test
    public void reverse_two_word() {    // This method can be default or public
        ReverseString reverseString = new ReverseString();
        String actual = reverseString.reverse("hello world");
        String expected = "dlrow olleh";
        assertEquals(expected, actual);
    }
}
