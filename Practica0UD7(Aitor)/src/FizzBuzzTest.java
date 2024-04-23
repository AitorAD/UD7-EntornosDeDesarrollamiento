import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    /*
    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            //"4", "5", "6","7", "8", "9", "10", "11", "12", "13", "14", "15"
    })
    public void testFizzBuzz(String input, String output) {
        assertEquals(output, input);
    }
    */
    @Test
    public void test0() {
        assertEquals("FizzBuzz", FizzBuzz.juego(0));
    }

    @Test
    public void test1() {
        assertEquals("1", FizzBuzz.juego(1));
    }

    @Test
    public void test2() {
        assertEquals("2", FizzBuzz.juego(2));
    }

    @Test
    public void test3() {
        assertEquals("Fizz", FizzBuzz.juego(3));
    }

    @Test
    public void test4() {
        assertEquals("Fizz", FizzBuzz.juego(3));
    }

    @Test
    public void test5() {
        assertEquals("Fizz", FizzBuzz.juego(3));
    }

    @Test
    public void test6() {
        assertEquals("Fizz", FizzBuzz.juego(3));
    }


    @Test
    public void test7() {
        assertEquals("Fizz", FizzBuzz.juego(3));
    }

}