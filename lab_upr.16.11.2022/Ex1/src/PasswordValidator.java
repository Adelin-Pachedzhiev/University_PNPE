import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean validatePassword(String password){
        Pattern p = Pattern.compile("^[a-zA-Z]{11,}$");
        Matcher m = p.matcher(password);
        return m.matches();
    }
}
