package OperacionesTDD;

public class OperacionesTDD {
    public static int suma(String input) {
        int output = 0;
        if (input.length() != 0) {
            String[] aux = input.split(",");
            for (String s : aux) {
                output += Integer.parseInt(s);
            }
        }
        return output;
    }
}
