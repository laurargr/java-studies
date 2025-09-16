package Day3.Exc16;

public class Vehicle {
    protected int speed;
    public Vehicle () {
        this.speed = 0;
    }
    public void speedUp(int speed) {
        this.speed = speed;
        System.out.println(this.speed);
    }
}
