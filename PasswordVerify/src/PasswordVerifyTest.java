import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    @Test
    public void testEntrada_Vacio() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_Hola() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_holacaracola() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_hola12() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_holA() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_holaExclamacion() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_holaAExclamacion() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_hola12Exclamacion() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_hola12A() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_holacaracola12() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_holacaracolaExclamacion() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_holacaracolA() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_ho12AExclamacion() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_holacaracolaAExclamacion() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_holacaracola12Exclamacion() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_holacaracola12A() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_holacaracola12AExclamacion() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }

    @Test
    public void testEntrada_AlmuP4blit0cl4v0uncl4vit0Almu() {
        assertEquals(false, PasswordVerify.isValidPassword());
    }
}