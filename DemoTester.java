import static org.junit.Assert.*;
import org.junit.*;

public class DemoTester {
    @Test
    public void dadJokeTest() {
        assertEquals("Hi Hungry, I'm dad.", Demo.dadJoke("Hungry"));
    }
}
