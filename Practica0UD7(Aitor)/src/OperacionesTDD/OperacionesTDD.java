package OperacionesTDD;

public class OperacionesTDD {
    public static int suma(String input) {
        int output = 0;
        if (input.length() != 0) {
            String[] aux = input.split(",");
            for (String s : aux) {
                if (Integer.parseInt(s) > 1000) System.out.println("Número superior a 1000 ignorado");
                else output += Integer.parseInt(s);
            }
            if (input.contains("-")) {
                System.out.println("Número negativo no permitido");
                output = -1;
            }
            if (input.charAt(input.length() - 1) == ',') output = -1;
        }
        return output;
    }
}
