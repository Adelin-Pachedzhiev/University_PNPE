import java.io.Serializable;
import java.util.Scanner;

public class Device implements Serializable {
    private String model;
    private String brand;
    private double price;

    public Device(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter brand:");
        setBrand(sc.next());
        System.out.println("enter model");
        setModel(sc.next());
        System.out.println("enter price");
        setPrice(sc.nextInt());
    }

    public void printValues(){
        System.out.println("brand: " + getBrand());
        System.out.println("price: " + getPrice());
        System.out.println("model: " + getModel());
    }

}
