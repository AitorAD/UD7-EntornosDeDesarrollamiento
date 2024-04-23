package FizzBuzz;

public class FizzBuzz {
    private static final int FIZZ = 3;
    private static final int BUZZ = 5;

    public static String juego(int input) {
        String output = String.valueOf(input);
        if (input % FIZZ == 0 && input % BUZZ == 0) output = "FizzBuzz";
        else if (input % FIZZ == 0) output = "Fizz";
        else if (input % BUZZ == 0) output = "Buzz";
        return output;
    }
}
