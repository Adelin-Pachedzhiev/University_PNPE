public class Main {
    public static void main(String[] args) {

        Multiproccessor processor = new Multiproccessor(4, 8,120);
        System.out.println(processor.toString(5));
    }
}