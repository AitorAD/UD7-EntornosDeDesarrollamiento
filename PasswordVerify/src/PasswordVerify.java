import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerify {
    private static StringBuilder msg;
    public static IsValidPassword verifyPassword(String password) {
        msg = new StringBuilder();

        boolean isValidLength = isValidLength(password);
        boolean hasTwoDigits = hasTwoDigits(password);
        boolean hasUpperCase = hasUpperCase(password);
        boolean hasSpecialChar = hasSpecialChar(password);
        boolean isValid = isValidLength && hasTwoDigits && hasUpperCase && hasSpecialChar;

        msg.deleteCharAt(msg.lastIndexOf("\n"));
        return new IsValidPassword(isValid, msg.toString());
    }

    private static boolean isValidLength(String password) {
        if (password.length() < 8) {
            msg.append("La contrasenya ha de tenir almenys 8 caràcters\n");
            return false;
        }
        return true;
    }

    private static boolean hasTwoDigits(String password) {
        if (!isValidContent(".*[0-9].*[0-9].*", password)) {
            msg.append("La contrasenya ha de contenir almenys 2 números\n");
            return false;
        }
        return true;
    }

    private static boolean hasUpperCase(String password) {
        if (!isValidContent("[A-Z]", password)) {
            msg.append("La contrasenya ha de contenir almenys una lletra majúscula\n");
            return false;
        }
        return true;
    }

    private static boolean hasSpecialChar(String password) {
        if (!isValidContent("[^a-zA-Z0-9\\s]", password)) {
            msg.append("La contrasenya ha de contenir almenys un caràcter especial\n");
            return false;
        }
        return true;
    }

    private static boolean isValidContent(String regex, String password) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}
