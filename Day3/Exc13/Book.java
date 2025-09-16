package Day3.Exc13;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book () {
        this.price = 0;
        this.author = "Unknown";
        this.title = "Unknown";
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
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void applyDiscont(int percentage) {
        double discount = (percentage / 100.0) * price;
        double finalPrice = price - discount;
        this.price = finalPrice;
    }
}
