import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @Test
    public void test_Origen_0_Destino_0_nClicls_0() {
        assertEquals(0, Zapping.cambiaCanal(0,0));
    }
}