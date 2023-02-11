public class Hovercraft extends Vehicle implements IsSeaVessel, IsLandVehicle{
    private int passengers;
    public Hovercraft(int maxSpeed, String model, double price, double enginePower, int passengers){
        super(maxSpeed, model,price);
        this.passengers = passengers;

    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public double checkPromo() {
        return this.getPrice() - this.getPrice()*0.03;
    }

    @Override
    public void enterSea() {
        System.out.println("Sea entered");
    }

    @Override
    public void enterLand(){
        System.out.println("land entered");
    }
}
