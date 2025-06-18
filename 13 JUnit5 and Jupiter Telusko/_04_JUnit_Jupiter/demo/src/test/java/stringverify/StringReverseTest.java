package stringverify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringReverseTest {
    @Test
    public void shouldAnswerWithTrue() {    // This method can be default or public
        ReverseString reverseString = new ReverseString();
        String actual = reverseString.reverse("hello");
        String expected = "olleh";
        assertEquals(expected, actual);
    }
}
