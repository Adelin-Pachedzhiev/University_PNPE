public class Holiday extends Travel{
    String hotelName;
    public Holiday(String destination, int days, double price, String hotelName){
        super(destination, days, price);
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public void fixPrice() {
        System.out.println("total price: " + "total price: " + this.getPrice() + this.getPrice()*0.4);
    }
}
