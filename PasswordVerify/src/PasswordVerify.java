import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerify {
    public static IsValidPassword verifyPassword(String password) {
        String msg = "";
        boolean isValid = false;

        if (password.length() < 8) msg += "La contrasenya ha de tenir almenys 8 caràcters\n";
        if (!password.matches("\\D*\\d{2}")) msg += "La contrasenya ha de contenir almenys 2 números\n";
        if (!isValidContent("[A-Z]", password)) msg += "La contrasenya ha de contenir almenys una lletra majúscula\n";
        if (!isValidContent("[^a-zA-Z0-9\\s]", password)) msg += "La contrasenya ha de contenir almenys un caràcter especial";

        return new IsValidPassword(isValid, msg);
    }

    public static boolean isValidContent(String regex, String password) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}
