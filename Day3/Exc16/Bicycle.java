package Day3.Exc16;
import Day3.Exc16.Vehicle;


public class Bicycle extends Vehicle {
    public Bicycle () {
        super();
    }
    @Override
    public void speedUp (int speed) {
        this.speed = speed / 2;
        System.out.println(this.speed);
    }
}
