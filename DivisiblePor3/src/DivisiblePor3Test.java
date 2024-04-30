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
}