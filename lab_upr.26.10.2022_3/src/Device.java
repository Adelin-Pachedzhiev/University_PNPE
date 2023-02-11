public class Device {
    double voltage;
    String CPUmodel;
    boolean power = false;

    public Device(){
        this.voltage=0;
        this.CPUmodel = "";
        this.power = false;
    }
    public Device(double voltage, String CPUmodel, boolean power){
        this.voltage = voltage;
        this.CPUmodel = CPUmodel;
        this.power = power;
    }
    public void setPowerOn(){
        this.power = true;
    }

    public void setPowerOff(){
        this.power = false;
    }
}
