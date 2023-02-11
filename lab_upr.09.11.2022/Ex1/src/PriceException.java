public class PriceException extends Exception{
    @Override
    public String getMessage() {
        return "Price not correct";
    }
}
