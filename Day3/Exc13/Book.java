package Day3.Exc13;

public class Book {
    private String title;
    private String author;
    private int price;
    private int percentage;

    public Book () {

    }
    public void setTitle(String title) {
        this.title = title;

    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void applyDiscont(int percentage) {
        this.percentage= percentage;
    }

    public String newPrice(){
        double discount = (percentage / 100.0) * price;
        double finalPrice = price - discount;
        return price + " - " + percentage + "%" + " = " + finalPrice;
    }
}
