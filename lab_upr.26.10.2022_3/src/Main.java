public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop(12, "core-i5", true, 16, 128);
        Laptop laptop2 = new Laptop(13, "core-i7", true, 32, 256);
        System.out.println(laptop1.toString());
        System.out.println(laptop2.toString());
        System.out.println(laptop2.isBetter(laptop1));
    }
}