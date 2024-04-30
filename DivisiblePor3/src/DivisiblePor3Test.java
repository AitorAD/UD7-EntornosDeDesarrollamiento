import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisiblePor3Test {
    @Test
    public void testEntrada_2_Salida_SI() {
        assertEquals("SI", DivisiblePor3.esDivisible(2));
    }

    @Test
    public void testEntrada_6_Salida_SI() {
        assertEquals("SI", DivisiblePor3.esDivisible(6));
    }

    @Test
    public void testEntrada_4_Salida_NO() {
        assertEquals("NO", DivisiblePor3.esDivisible(4));
    }

    @Test
    public void testEntrada_13_Salida_NO() {
        assertEquals("NO", DivisiblePor3.esDivisible(13));
    }

    @Test
    public void testEntrada_0_Salida_NO() {
        assertEquals("NO", DivisiblePor3.esDivisible(0));
    }

    @Test
    public void testEntrada_20_Salida_SI() {
        assertEquals("SI", DivisiblePor3.esDivisible(20));
    }
}