import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DivisiblePor3Test {
    @ParameterizedTest
    @CsvSource({
            "2, SI",
            "6, SI",
            "4, NO",
            "13, NO",
            "0, NO",
            "20, SI",
            "100, NO",
    })
    public void testsDivisiblePor3(String input, String output) {
        assertEquals(output, DivisiblePor3.esDivisible(Integer.parseInt(input)));
    }
}