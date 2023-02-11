public class WrongUserException extends Exception{
    @Override
    public String getMessage() {
        return "Wrong username";
    }
}
