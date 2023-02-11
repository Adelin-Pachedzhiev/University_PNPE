import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product1 pr1 = new Product1("toy", 12, 1, 3);
        Product1 pr2 = new Product1("candy", 2, 2, 3);
        Product1 pr3 = new Product1("car", 5, 1, 3);

        Product2 pr4 = new Product2("chocolate", 2, 2, 5);
        Product2 pr5 = new Product2("doll", 20, 3, 5);
        Product2 pr6 = new Product2("bunny", 2, 2, 6);

        ArrayList<GetProductsTo> arrayList1 = new ArrayList<>();
        arrayList1.add(pr1);
        arrayList1.add(pr2);
        arrayList1.add(pr3);
        arrayList1.add(pr4);
        arrayList1.add(pr5);
        arrayList1.add(pr6);

        ArrayList<DeliveryAPI> arrayList2 = new ArrayList<>();
        arrayList2.add(pr1);
        arrayList2.add(pr3);
        arrayList2.add(pr5);
        arrayList2.add(pr6);
        arrayList2.add(pr2);

        PresentStore ps = new PresentStore(arrayList1, arrayList2);
        ps.filterByPrice(6);
        System.out.println();
        ps.filterByProvider(1);
    }
}