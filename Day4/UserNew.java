package Day4;

public class UserNew {
    public String name;
    public int age;
    public String gender;

    public UserNew(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Name: " + name + " Age: " + age + " Gender: " + gender );
    }
}
