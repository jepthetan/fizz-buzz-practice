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
    void should_return_fizz_when_countOff_given_() {
        //given

        //when

        //then
    }
}
