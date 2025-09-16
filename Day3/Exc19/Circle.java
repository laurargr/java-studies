package Day3.Exc19;
import  Day3.Exc19.Shape;

public class Circle extends Shape{
    private double radio;
    public Circle(double radio) {
        super();
        this.radio = radio;

    }

    @Override
    public void draw() {
        System.out.println("we dont draw");
    }

    @Override
    public double calculateArea() {
          return this.radio * this.radio * Math.PI;
    }
}
