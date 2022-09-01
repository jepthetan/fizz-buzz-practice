package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_countOff_given_1() {
        String expected = "1";
        FizzBuzz fizz = new FizzBuzz();

        String actual = fizz.countOff(1);

        assertEquals(expected, actual);
    }

    @Test
    void should_return_fizz_when_countOff_given_9() {
        String expected = "Fizz";
        FizzBuzz fizz = new FizzBuzz();

        String actual = fizz.countOff(9);

        assertEquals(expected, actual);
    }

    @Test
    void should_return_buzz_when_countOff_given_20() {
        String expected = "Buzz";
        FizzBuzz fizz = new FizzBuzz();

        String actual = fizz.countOff(20);

        assertEquals(expected, actual);
    }

    @Test
    void should_return_whizz_when_countOff_given_28() {
        String expected = "Whizz";
        FizzBuzz fizz = new FizzBuzz();

        String actual = fizz.countOff(28);

        assertEquals(expected, actual);
    }

    @Test
    void should_return_fizz_buzz_whizz_when_countOff_given_105() {
        String expected = "FizzBuzzWhizz";
        FizzBuzz fizz = new FizzBuzz();

        String actual = fizz.countOff(105);

        assertEquals(expected, actual);
    }
}
