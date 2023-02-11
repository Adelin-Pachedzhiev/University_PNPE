public class Ship extends Vehicle implements IsSeaVessel{
    private int deadweight;
    public Ship(int maxSpeed, String model, double price, double enginePower, int deadweight){
        super(maxSpeed,model,price);
        this.deadweight = deadweight;
    }

    public int getDeadweight() {
        return deadweight;
    }

    public void setDeadweight(int deadweight) {
        this.deadweight = deadweight;
    }

    @Override
    public double checkPromo() {
        return this.getPrice() - this.getPrice()*0.003;
    }

    @Override
    public void enterSea() {
        System.out.println("Sea entered");
    }
}
