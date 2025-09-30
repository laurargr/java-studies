package Day10;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private int age;
    private int n;
    Map <Integer, String> phoneBook = new HashMap<>();

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
        this.n = 1;
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


    public void setphoneNumber (String phone) {
        phoneBook.put(n, phone);
        n = n+1;
    }

    public Map<Integer, String> getPhonenumber () {
        return phoneBook;
    }

    public void print (){
        System.out.println(this.name + " " + this.age + " " + phoneBook);
    }
}
