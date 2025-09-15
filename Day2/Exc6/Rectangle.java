package Day2.Exc6;

public class Rectangle {
    public int length;
    public int width;
    public  Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle (Rectangle rec) {
        this(rec.length, rec.width);
    }
}
