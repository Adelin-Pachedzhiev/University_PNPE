import java.util.Scanner;

public class BrokenDevice extends Device {
    private String symptoms;
    private int daysNeeded;

    public BrokenDevice(String model, String brand, double price, String symptoms, int daysNeeded) {
        super(model, brand, price);
        this.symptoms = symptoms;
        this.daysNeeded = daysNeeded;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getDaysNeeded() {
        return daysNeeded;
    }

    public void setDaysNeeded(int daysNeeded) {
        this.daysNeeded = daysNeeded;
    }

    @Override
    public void setValues() {
        super.setValues();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter symptoms:");
        setSymptoms(sc.next());
        System.out.println("enter days needed for service");
        setDaysNeeded(sc.nextInt());
    }

    public void printValues(){
        System.out.println("brand: " + getBrand());
        System.out.println("price: " + getPrice());
        System.out.println("model: " + getModel());
        System.out.println("symptoms: " + getSymptoms());
        System.out.println("days needed: " + getDaysNeeded());
    }
}
