public class Product2 implements GetProductsTo, DeliveryAPI{
    private String type;
    private double price;
    private int idOfProvider;
    private int number;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getNumber() {
        return number;
    }

    public Product2(String type, double price, int idOfProvider, int number) {
        this.type = type;
        this.price = price;
        this.idOfProvider = idOfProvider;
        this.number = number;
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
