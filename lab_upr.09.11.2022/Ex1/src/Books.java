public class Books extends Stocks{
    private String author;
    private String title;

    public Books(String author, String title, int price, int stockNumber){
        super(price, stockNumber);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double checkPromo(double percent) {
        return this.getPrice() - this.getPrice()/percent;
    }
}
