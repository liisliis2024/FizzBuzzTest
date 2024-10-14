import org.example.FizzBuzzGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGeneratorTest {

    @Test
    public void justNumber() {
        assertEquals("1", FizzBuzzGenerator.fizzBuzzOf(1));
        assertEquals("2", FizzBuzzGenerator.fizzBuzzOf(2));
    }

    @Test
    public void fizz() {
        assertEquals("Fizz", FizzBuzzGenerator.fizzBuzzOf(6));
        assertEquals("Fizz", FizzBuzzGenerator.fizzBuzzOf(9));
    }

    @Test
    public void buzz() {
        assertEquals("Buzz", FizzBuzzGenerator.fizzBuzzOf(10));
        assertEquals("Buzz", FizzBuzzGenerator.fizzBuzzOf(25));
    }

    @Test
    public void fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzGenerator.fizzBuzzOf(15));
        assertEquals("FizzBuzz", FizzBuzzGenerator.fizzBuzzOf(30));
    }
}
