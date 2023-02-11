import java.util.ArrayList;

public class PresentStore {
    ArrayList<GetProductsTo> products;
    ArrayList<DeliveryAPI> devApi;

    public PresentStore(ArrayList<GetProductsTo> products, ArrayList<DeliveryAPI> devApi) {
        this.products = products;
        this.devApi = devApi;
    }

    public void filterByPrice(int price) {
        for (GetProductsTo product : products) {
            if (product.getPrice() < price) {
                System.out.println(product.getType() + " " + product.getPrice());
            }
        }
    }

    public void filterByProvider(int id) {
        for (DeliveryAPI delivery : devApi) {
            if (delivery.getIdOfProvider() == id) {
                System.out.println(delivery.getIdOfProvider() + " " + delivery.getNumber() + " " + delivery.getType());
            }
        }
    }
}

