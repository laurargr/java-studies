package Day3.Exc19;
import Day3.Exc19.Shape;

public class Square extends Shape {
    private int length;
    public Square (int length) {
        super();
        this.length = length;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.length; i++) {
            for (int a = 0; a < this.length; a++) {
                if (i == 0 || i == (this.length -1)) {
                    System.out.print("**");
                }
                else {
                    if(a == 0 || a == (this.length - 1)) {
                        System.out.print("|");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }

    @Override
    public double calculateArea() {
        return this.length * this.length;
    }
}
