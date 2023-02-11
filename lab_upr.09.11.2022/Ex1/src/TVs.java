public class TVs extends Stocks implements ElectricalAppliance{
    private String manufacturer;
    private String model;
    private int power;

    public TVs(int price, int stockNumber, String manufacturer, String model, int power){
        super(price, stockNumber);
        try {
            setPower(power);
        }catch (PowerException e){
            System.err.println(e.getMessage());
        }
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) throws PowerException {
        if(power < 0 ){
            throw new PowerException();
        } else {
            this.power = power;
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public double checkPromo(double percent) {
        return this.getPrice() - this.getPrice()/percent;
    }

    @Override
    public double calcPowerCost() {
        return 0.09637* this.getPower();
    }
}
