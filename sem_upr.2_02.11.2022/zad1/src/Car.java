public class Car extends Vehicle implements IsLandVehicle{
    private double enginePower;
    public Car(int maxSpeed, String model, double price, double enginePower){
        super(maxSpeed,model,price);
        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }


    @Override
    public void enterLand() {
        System.out.println("Land entered");
    }

    @Override
    public double checkPromo() {
        return this.getPrice() - this.getPrice()*0.2f;
    }
}
