public abstract class Stocks {
    private int price;
    private int stockNumber;

    public Stocks(int price, int stockNumber){
        try{
            setPrice(price);
        } catch (PriceException e){
            System.err.println(e.getMessage());
        }

        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws PriceException {
        if (price < 0){
            throw new PriceException();
        } else {
            this.price = price;
        }
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    public abstract double checkPromo(double percent);
}
