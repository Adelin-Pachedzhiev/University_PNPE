import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static boolean validateUsername(String username){
		Pattern p = Pattern.compile("^[a-z0-9_\\-]{3,15}$");
		Matcher m = p.matcher(username);
		return m.matches();
    }
}
