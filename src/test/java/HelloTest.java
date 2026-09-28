import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void testGreet() {
        assertEquals("Hello from Maven Java!", Hello.greet());
    }
}