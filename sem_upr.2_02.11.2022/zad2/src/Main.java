public class Main {
    public static void main(String[] args) {

    Trip trip = new Trip("Greece", 12, 200, 3);
    Holiday holiday = new Holiday("Turkey", 12, 1200, "ephesia");

    System.out.println(trip.getDestination());
    System.out.println(trip.getHotels());
    System.out.println(trip.calculateNights());
    trip.setHotels(4);
    System.out.println(trip.getHotels());

    System.out.println();

    System.out.println(holiday.getDestination());
    System.out.println(holiday.getHotelName());
    System.out.println(holiday.getDays());
    }
}