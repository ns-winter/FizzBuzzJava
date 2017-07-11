import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nigel Said on 10/07/2017.
 */
public class FizzBuzzTest {

    @Test
    public void regularNumber() {
        String answer = FizzBuzz.fizzBuzz(1);
        assertEquals("returns 1 when provided with 1", "1", answer);
    }

    @Test
    public void fizzNumber() {
        String answer = FizzBuzz.fizzBuzz(3);
        assertEquals("returns fizz when provided with 3", "fizz", answer);

    }

    @Test
    public void buzzNumber() {
        String answer = FizzBuzz.fizzBuzz(5);
        assertEquals("returns buzz when provided 5", "buzz", answer);
    }

    @Test
    public void fizzbuzzNumber() {
        String answer = FizzBuzz.fizzBuzz(15);
        assertEquals("returns fizzbuzz when provided 5", "fizzbuzz", answer);
    }

}