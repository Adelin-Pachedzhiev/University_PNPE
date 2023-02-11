import java.io.*;

public class Computer implements Serializable {
    private float size;
    private String[] peripheral;
    private String brand;
    private boolean canPlayGames;

    public Computer(float size, String[] peripheral, String brand, boolean canPlayGames) {
        this.size = size;
        this.peripheral = peripheral;
        this.brand = brand;
        this.canPlayGames = canPlayGames;
    }

    public Computer(int size, String[] peripheral) {
    }

    public static void serializeComputer(Computer computer){
        try(FileOutputStream fileOutput = new FileOutputStream("file.txt");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOutput);) {
            objectOut.writeObject(computer);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Computer deserializeComputer(){
        Computer result = null;
        try(FileInputStream fileOutput = new FileInputStream("file.txt");
        ObjectInputStream objectOut = new ObjectInputStream(fileOutput)){
            result = (Computer)objectOut.readObject();
        } catch (IOException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return result;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String[] getPeripheral() {
        return peripheral;
    }

    public void setPeripheral(String[] peripheral) {
        this.peripheral = peripheral;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isCanPlayGames() {
        return canPlayGames;
    }

    public void setCanPlayGames(boolean canPlayGames) {
        this.canPlayGames = canPlayGames;
    }
}
