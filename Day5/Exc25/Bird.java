package Day5.Exc25;
import Day5.Exc25.Pet;

public class Bird extends Pet{
    public Bird(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void calculateAgeInHumanYears() {
        int birdAgeCalc = this.age * 9;
        System.out.println(birdAgeCalc);
    }

    @Override
    public void favoriteToy(String toy) {
        System.out.println(toy);
    }
}
