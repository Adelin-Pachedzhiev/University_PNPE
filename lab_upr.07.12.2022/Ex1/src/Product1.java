public class Product1 implements GetProductsTo, DeliveryAPI {
    private String type;
    private double price;
    private int idOfProvider;
    private int number;

    public Product1(String type, double price, int idOfProvider, int number) {
        this.type = type;
        this.price = price;
        this.idOfProvider = idOfProvider;
        this.number = number;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getIdOfProvider() {
        return idOfProvider;
    }

}
