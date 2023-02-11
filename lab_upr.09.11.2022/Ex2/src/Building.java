import java.util.Scanner;

public class Building {
    private int height;
    private double area;
    private String address;

    public Building(int height, double area, String address){
        try{
            this.address = address;
            setArea(area);
            setHeight(height);
        }catch (AreaException e){
            System.err.println(e.getMessage());
        }catch (HeightException e){
            System.err.println(e.getMessage());

        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(Scanner sc) {

        this.address = sc.next();
    }

    public void setArea(double area) throws AreaException {
        if (area < 0 ){
            throw new AreaException();
        }
        this.area = area;
    }

    public void enterArea(Scanner sc){
        try{
            setArea(area);
        }catch (AreaException e){
            System.err.println(e.getMessage());
        }
    }

    public double getArea() {
        return area;
    }

    public void setHeight(int height) throws HeightException{
        if (height < 0 || height > 1000){
            throw new HeightException();
        }
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
