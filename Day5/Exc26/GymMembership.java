package Day5.Exc26;

public class GymMembership {
    protected String name;
    protected String type;
    protected int duration;
    protected int price;

    public GymMembership(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.type = "Normal Membership";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getType() {
        return this.type;
    }

    public void membershipFee (){
        price = 26 * duration;
        System.out.println(price);
    }
}
