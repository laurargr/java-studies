package Day3.Exc16;

public class Car extends Vehicle {
    public Car () {
        super();
    }
    @Override
    public void speedUp(int speed) {
        this.speed = speed * 2;
        System.out.println(this.speed);
    }
}
