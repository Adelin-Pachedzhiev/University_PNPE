abstract class Computer implements Presentable,Computable, Interactable{
    double size;
    String[] peripheral;
    String brand;
    boolean canPlayGames;

    public Computer(double size, String[] peripheral, String brand, boolean canPlayGames){
        this.brand = brand;
        this.size = size;
        this.peripheral = peripheral;
        this.canPlayGames = canPlayGames;

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String[] getPeripheral() {
        return peripheral;
    }

    public void setPeripheral(String[] peripheral) {
        this.peripheral = peripheral;
    }

    public void setCanPlayGames(boolean canPlayGames) {
        this.canPlayGames = canPlayGames;
    }
    public boolean getCanPlayGames(){
        return this.canPlayGames;
    }
}
