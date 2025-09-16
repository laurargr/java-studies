package Day3.Exc19;
import Day3.Exc19.Shape;

public class Cylinder extends Shape {
    private double radio;
    private double length;
    public Cylinder (double radio, double length){
        super();
        this.radio = radio;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("we dont draw");
    }

    @Override
    public double calculateArea() {
        return (2 * Math.PI * this.radio * this.length) + 2 * (Math.PI * this.radio * this.radio);
    }
}
