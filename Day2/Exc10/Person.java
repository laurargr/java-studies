package Day2.Exc10;

public class Person {
    private String name;
    private int age;
    private String country;
    public Person (String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
     public void setName(String name) {
         this.name = name;
     }

    public String getName() {
       return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
