package Day3.Exc15;

public class Product {
    private String name;
    private int code;
    private int price;
    double percentage;
    public Product () {
        this.name = "Unknown";
        this.code = 0;
        this.price = 0;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setcode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public double applyDiscount(int percentage) {
        this.percentage = percentage;
        double discount = (percentage / 100.0) * price;
        return price - discount;
    }
}
