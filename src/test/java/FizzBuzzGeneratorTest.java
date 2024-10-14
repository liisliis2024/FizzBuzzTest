import org.example.FizzBuzzGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGeneratorTest {

    @Test
    public void fizzBuzzOf_justNumber() {
        assertEquals("1", FizzBuzzGenerator.fizzBuzzOf(1));
        assertEquals("2", FizzBuzzGenerator.fizzBuzzOf(2));
    }

    @Test
    public void fizzBuzzOf_fizz() {
        assertEquals("Fizz", FizzBuzzGenerator.fizzBuzzOf(6));
        assertEquals("Fizz", FizzBuzzGenerator.fizzBuzzOf(9));
    }

    @Test
    public void fizzBuzzOf_buzz() {
        assertEquals("Buzz", FizzBuzzGenerator.fizzBuzzOf(10));
        assertEquals("Buzz", FizzBuzzGenerator.fizzBuzzOf(25));
    }

    @Test
    public void fizzBuzzOf_fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzGenerator.fizzBuzzOf(15));
        assertEquals("FizzBuzz", FizzBuzzGenerator.fizzBuzzOf(30));
    }

    @Test
    public void getFizzBuzzLoop_test() {
        List<String> result = FizzBuzzGenerator.getFizzBuzzLoop(15);
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected, result);
    }
}
