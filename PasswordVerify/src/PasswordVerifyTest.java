import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    @Test
    public void testEntrada_Vacio() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial"
                );

        assertEquals(expected, PasswordVerify.verifyPassword(""));
    }

    @Test
    public void testEntrada_hola() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("hola"));
    }

    @Test
    public void testEntrada_holacaracola() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("holacaracola"));
    }

    @Test
    public void testEntrada_hola12() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("hola12"));
    }

    @Test
    public void testEntrada_holA() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("holA"));
    }

    @Test
    public void testEntrada_holaExclamacion() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("hola!"));
    }

    @Test
    public void testEntrada_holaAExclamacion() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("holaA!"));
    }

    @Test
    public void testEntrada_hola12Exclamacion() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("hola12!"));
    }

    @Test
    public void testEntrada_hola12A() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("hola12A"));
    }

    @Test
    public void testEntrada_holacaracola12() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("holacaracola12"));
    }

    @Test
    public void testEntrada_holacaracolaExclamacion() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("holacaracola!"));
    }

    @Test
    public void testEntrada_holacaracolA() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("holacaracolA"));
    }

    @Test
    public void testEntrada_ho12AExclamacion() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de tenir almenys 8 caràcters"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("ho12A!"));
    }

    @Test
    public void testEntrada_holacaracolaAExclamacion() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de contenir almenys 2 números"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("holacaracolaA!"));
    }

    @Test
    public void testEntrada_holacaracola12Exclamacion() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de contenir almenys una lletra majúscula"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("holacaracola12!"));
    }

    @Test
    public void testEntrada_holacaracola12A() {
        IsValidPassword expected = new IsValidPassword(false,
                "La contrasenya ha de contenir almenys un caràcter especial"
        );

        assertEquals(expected, PasswordVerify.verifyPassword("holacaracola12A"));
    }

    @Test
    public void testEntrada_holacaracola12AExclamacion() {
        IsValidPassword expected = new IsValidPassword(true,
                ""
        );

        assertEquals(expected, PasswordVerify.verifyPassword("holacaracola12A!"));
    }

    @Test
    public void testEntrada_AlmuP4blit0cl4v0uncl4vit0Almu() {
        IsValidPassword expected = new IsValidPassword(true,
                ""
        );

        assertEquals(expected, PasswordVerify.verifyPassword("#P4blit0cl4v0uncl4vit0#"));
    }
}