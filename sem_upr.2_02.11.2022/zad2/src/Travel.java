public abstract class Travel {
    private String destination;
    private int days;
    private double price;

    public Travel(String destination, int days, double price){
        this.days = days;
        this.destination = destination;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public abstract void fixPrice();
}
