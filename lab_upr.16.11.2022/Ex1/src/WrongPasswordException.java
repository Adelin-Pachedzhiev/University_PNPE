public class WrongPasswordException extends Exception {
    @Override
    public String getMessage() {
        return "Wrong doesn't match pattern";
    }
}
