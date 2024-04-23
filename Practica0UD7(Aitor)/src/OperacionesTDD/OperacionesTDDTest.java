package OperacionesTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    @Test
    public void test1() {
        assertEquals(0, OperacionesTDD.suma(""));
    }

    @Test
    public void test2() {
        assertEquals(1, OperacionesTDD.suma("1"));
    }

    @Test
    public void test3() {
        assertEquals(3, OperacionesTDD.suma("1,2"));
    }

    @Test
    public void test4() {
        assertEquals(4, OperacionesTDD.suma("1,1,2"));
    }

    @Test
    public void test5() {
        assertEquals(-1, OperacionesTDD.suma("1,2,"));
    }
}