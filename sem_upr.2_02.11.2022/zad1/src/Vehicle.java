public abstract class Vehicle {
    private int maxSpeed;
    private String model;
    private double price;

    public Vehicle(int maxSpeed, String model, double price){
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.price = price;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public   abstract   double   checkPromo();
}
