package Day1;
public class Animal {
    private String name;
    private int age;
    private String color;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal (String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        
        return name + " " + age;
    }
}
