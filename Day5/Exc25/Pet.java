package Day5.Exc25;

public abstract class Pet {
    String name;
    String species;
    int age;
    public Pet (String name, String species, int age){
        this.age = age;
        this.name = name;
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String petDetails () {
        return "Name: " + this.name + "specie: " + this.species + "age: " + this.age;
    }
    public abstract void calculateAgeInHumanYears();
    public abstract void favoriteToy(String toy);
}
