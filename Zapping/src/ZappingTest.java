import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @Test
    public void test_Origen_0_Destino_0_nClicls_0() {
        assertEquals(0, Zapping.cambiaCanal(0,0));
    }

    @Test
    public void test_Origen_1_Destino_2_nClicls_1() {
        assertEquals(1, Zapping.cambiaCanal(1,2));
    }

    @Test
    public void test_Origen_10_Destino_30_nClicls_20() {
        assertEquals(20, Zapping.cambiaCanal(10,30));
    }

    @Test
    public void test_Origen_2_Destino_99_nClicls_2() {
        assertEquals(2, Zapping.cambiaCanal(2,99));
    }
}