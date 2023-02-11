public class Laptop extends Device{
    double ram;
    double hdd;

    public Laptop(double voltage, String CPUmodel, boolean power, double ram, double hdd){
        super(voltage, CPUmodel, power);
        this.ram = ram;
        this.hdd = hdd;
    }

    public double getHdd() {
        return this.hdd;
    }

    public void setHdd(double hdd) {
        this.hdd = hdd;
    }

    public double getRam() {
        return this.ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public boolean isBetter(Laptop laptop){
        return (this.ram > laptop.getRam()) && (this.hdd > laptop.getHdd());
    }

    public String toString(){
        return "CPU model: " + this.CPUmodel + " voltage: " + this.voltage +" power: " + this.power + " ram: " + this.ram + " hdd: " +this.hdd;
    }
}
