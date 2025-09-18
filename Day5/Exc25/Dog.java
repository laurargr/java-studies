package Day5.Exc25;
import Day5.Exc25.Pet;

public class Dog extends Pet {
    String favoriteToy;

    public Dog(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void calculateAgeInHumanYears() {
        int dogAgeCalc = this.age * 4;
        System.out.println(dogAgeCalc);
    }

    @Override
    public void favoriteToy(String toy) {
        System.out.println(toy);
    }

}
