package stringverify;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class StringReverseTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        ReverseString reverseString = new ReverseString();
        String actual = reverseString.reverse("hello");
        String expected = "olleh";
        assertEquals(expected, actual);
    }
}
