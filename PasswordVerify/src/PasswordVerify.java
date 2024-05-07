import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerify {
    public static IsValidPassword verifyPassword(String password) {
        String msg = "";
        boolean isValid = false;

        if (password.length() < 8) msg += "La contrasenya ha de tenir almenys 8 caràcters\n";
        if (!password.matches("\\d.*\\d")) msg += "La contrasenya ha de contenir almenys 2 números\n";
        if (!password.contains("[^a-zA-Z0-9\\s]")) msg += "La contrasenya ha de contenir almenys una lletra majúscula\n";
        if (!password.contains("[A-Z]")) msg += "La contrasenya ha de contenir almenys un caràcter especial";

        return new IsValidPassword(isValid, msg);
    }

}
