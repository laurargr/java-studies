package Day3.Exc15;

public class Product {
    private String name;
    private int code;
    private double price;
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
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void applyDiscount(int percentage) {
        double discount = (percentage / 100.0) * price;
        double finalP = price - discount;
        this.price = finalP;
    }
}
