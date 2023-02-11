import java.nio.file.attribute.UserPrincipal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User implements ValidatePhone {
    private String userName;
    private String password;
    private String phoneNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws WrongUserException {
        if (UsernameValidator.validateUsername(userName)) {
            this.userName = userName;
        } else {
            throw new WrongUserException();
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws WrongPasswordException {
        if (PasswordValidator.validatePassword(password)){
            this.password = password;

        } else {
            throw new WrongPasswordException();
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        if (validatePhoneNumber(phoneNumber)){
            this.phoneNumber = phoneNumber;

        } else {
            throw new WrongPhoneNumberException();
        }
    }

    public User(String userName, String password, String phoneNumber) throws WrongUserException, WrongPasswordException, WrongPhoneNumberException {
        setUserName(userName);
        setPassword(password);
        setPhoneNumber(phoneNumber);
    }

    @Override
    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern p = Pattern.compile("^[0-9]{10}$");
        Matcher m = p.matcher(phoneNumber);
        return m.matches();

    }
}
