public class Trip extends Travel implements NightCount{
    private int hotelsCount;

    public Trip(String destination, int days, double price, int hotels){
        super(destination,days,price);
        this.hotelsCount = hotels;
    }

    public void setHotels(int hotels) {
        this.hotelsCount = hotels;
    }

    public int getHotels() {
        return hotelsCount;
    }

    @Override
    public void fixPrice() {
        System.out.println("total price: " + this.getPrice() + this.getPrice()*0.1);
    }

    @Override
    public int calculateNights() {
        return getDays()+2;
    }
}
