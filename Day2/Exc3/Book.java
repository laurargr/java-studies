package Day2.Exc3;

public class Book {
    public String title;
    public String outhor;
    public int price;
    public Book () {
        this("unknowm", "unknown", 0);
    }
    public Book (String title, String outhor) {
        this();
    }
    public Book (String title, String outhor, int price) {
        this.title = title;
        this.outhor = outhor;
        this.price = price;
    }
}
