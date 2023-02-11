public class FloorException extends Exception{
    @Override
    public String getMessage() {
        return "Floors should be positive number";
    }
}
