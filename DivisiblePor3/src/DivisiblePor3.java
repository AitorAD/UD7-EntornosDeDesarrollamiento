import java.math.BigInteger;

public class DivisiblePor3 {
    private static final int DIVISOR = 3;
    private static final int RESTO = 0;

    public static String esDivisible(int n) {
        String output = "SI";
        if (n == 0 || !isValidResto(n)) output = "NO";
        return output;
    }

    private static String getDividendo(int n) {
        String dividendo = "";
        for (int i = 1; i <= n; i++) {
            dividendo += i;
        }
        return dividendo;
    }

    private static boolean isValidResto(int n) {
        BigInteger dividendo = new BigInteger(getDividendo(n));
        BigInteger resto = dividendo.mod(BigInteger.valueOf(DIVISOR));
        return resto.equals(BigInteger.valueOf(RESTO));
    }
}