import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerify {
    public static IsValidPassword verifyPassword(String password) {
        StringBuilder msg = new StringBuilder();
        boolean isValid = false;

        if (password.length() < 8) msg.append("La contrasenya ha de tenir almenys 8 caràcters\n");
        if (!Pattern.compile(".*[0-9].*[0-9].*").matcher(password).matches()) msg.append("La contrasenya ha de contenir almenys 2 números\n");
        if (!isValidContent("[A-Z]", password)) msg.append("La contrasenya ha de contenir almenys una lletra majúscula\n");
        if (!isValidContent("[^a-zA-Z0-9\\s]", password)) msg.append("La contrasenya ha de contenir almenys un caràcter especial\n");


        msg.deleteCharAt(msg.lastIndexOf("\n"));
        return new IsValidPassword(isValid, msg.toString());
    }

    public static boolean isValidContent(String regex, String password) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}
