public class DivisiblePor3 {
    private static final int DIVISOR = 3;
    private static final int RESTO = 0;

    public static String esDivisible(int n) {
        String output = "NO";
        if (isValidResto(n)) output = "SI";
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
        int dividendo = Integer.parseInt(getDividendo(n));
        if (dividendo % DIVISOR == RESTO) {
            return true;
        }
        return false;
    }
}