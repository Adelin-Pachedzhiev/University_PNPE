import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {

        TVs tv = new TVs(-1200, 12, "Sony", "SDN", 120);
        TVs tv2 = new TVs(1200, 12, "Sony", "SDN", 120);
        System.out.println(tv2.getPrice());
        System.out.println("tv2 new price " + tv2.checkPromo(9));

        TVs tv3 = new TVs(1200, 12, "Sony", "SDN", -120);

        Books book1= new Books("someaaithor", "title1", 12, 1);
        System.out.println("book new price " + book1.checkPromo(15));


    }

}