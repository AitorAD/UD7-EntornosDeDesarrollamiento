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

    @Test
    public void test_Origen_5_Destino_63_nClicls_41() {
        assertEquals(41, Zapping.cambiaCanal(5,63));
    }

    @Test
    public void test_Origen_63_Destino_5_nClicls_41() {
        assertEquals(41, Zapping.cambiaCanal(63,5));
    }

    @Test
    public void test_Origen_1_Destino_51_nClicls_49() {
        assertEquals(49, Zapping.cambiaCanal(1,51));
    }
}