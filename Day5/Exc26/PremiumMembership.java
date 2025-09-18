package Day5.Exc26;
import Day5.Exc26.GymMembership;

public class PremiumMembership extends GymMembership {
    public PremiumMembership(String name, int duration) {
        super(name, duration);
        this.type = "Premium membership";
    }
    @Override
    public void membershipFee () {
        this.price = 39 * this.duration;
        System.out.println(price);
    }
}
