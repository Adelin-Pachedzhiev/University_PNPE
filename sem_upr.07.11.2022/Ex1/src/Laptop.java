public class Laptop extends Computer implements Moveable{

    public Laptop(double size, String[] peripheral, String brand, boolean canPlayGames){
        super(size, peripheral, brand, canPlayGames);
    }

    @Override
    public void move() {
        System.out.println("Laptop moved. ");
    }

    @Override
    public void compute() {
        System.out.println("Laptop computed");
    }

    @Override
    public void present(){
        System.out.println("laptop presented");
    }

    @Override
    public void interact(){
        System.out.println("laptop interacted");
    }

}
