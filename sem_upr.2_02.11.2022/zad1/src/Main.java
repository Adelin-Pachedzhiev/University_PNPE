public class Main {
    public static void main(String[] args) {
        Car car = new Car(200, "s class", 12000, 125);
        Ship ship = new Ship(100, "some ship", 120_000, 10_000, 120);
        Hovercraft hover = new Hovercraft(120, "some model", 120000, 200, 5);

        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        System.out.println(car.checkPromo());
        car.enterLand();

        System.out.println();

        System.out.println(ship.getModel());
        System.out.println(ship.checkPromo());
        System.out.println(ship.getDeadweight());
        System.out.println(ship.getMaxSpeed());
        ship.enterSea();

        System.out.println();

        System.out.println(hover.getModel());
        System.out.println(hover.checkPromo());
        System.out.println(hover.getPassengers());
        System.out.println(hover.getMaxSpeed());
        hover.enterLand();
        hover.enterSea();
    }
}