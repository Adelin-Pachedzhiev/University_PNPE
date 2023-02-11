public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addDevice(new Device("S9", "Samsung", 1500));
        service.addDevice(new Device("S10", "Apple", 1600));
        service.addDevice(new Device("S1", "Huawei", 150));
        service.printDeviceList();
        System.out.println();

        BrokenDevice bd = new BrokenDevice("S2", "Samsung", 120, "broken screen", 3);
        service.addBrokenDevice(bd);
        service.addBrokenDevice(new BrokenDevice("A3", "Apple", 1200, "broken camera", 2));
        service.addBrokenDevice(new BrokenDevice("A6", "HP", 120, "broken camera", 4));
        service.printBrokenDeviceList();

        System.out.println();
        service.repairDevice(bd);
        System.out.println();
        service.printBrokenDeviceList();
        System.out.println();
        service.printDeviceList();

        service.searchBySymptom("broken camera");

        System.out.println(service.calculateTotalPrice());
        System.out.println(service.calculateIncome(13));

    }
}