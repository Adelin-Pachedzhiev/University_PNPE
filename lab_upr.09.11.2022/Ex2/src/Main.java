public class Main {
    public static void main(String[] args) {
        House house1 = new House(6, "Sami", 25, 120, "some adress");
        House house2 = new House(5, "Mani", 30, 120, "some adress");
        House house3 = new House(12, "Max", 40, 120, "some adress");

        System.out.println("printing some values: ");
        System.out.println(house1.getFloors());
        System.out.println(house1.getOwnerName());

        House biggestHouse = findBiggestHouse(new House[]{house1, house2, house3});
        System.out.println("biggest house info :");
        System.out.println(biggestHouse.getOwnerName());
        System.out.println(biggestHouse.getAddress());

        System.out.println("Exceptions:");
        House house4 = new House(-6, "Sami", 25, 120, "some adress");
        House house5 = new House(6, "Sami", -25, 120, "some adress");
        House house6 = new House(6, "Sami", 25, -120, "some adress");


    }

    public static House findBiggestHouse(House[] houses){
        House biggestHouse = houses[0];
        for (House currHouse : houses) {
            if (currHouse.getFloors() * currHouse.getArea() > biggestHouse.getFloors() * biggestHouse.getArea()) {
                biggestHouse = currHouse;
            }
        }
        return biggestHouse;
    }
}