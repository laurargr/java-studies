package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class User {
    String name;
    String gender;
    String age;
    String[] userInfo = new String[3];

    public User() {

    }

    public void setInfo() {
        Scanner info = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Whats is your name?");
                this.name = info.nextLine();
                userInfo[i] = name;
            }
            if (i == 1) {
                System.out.println("How old are you?");
                this.age = info.nextLine();
                userInfo[i] = age;
            }
            if (i == 2) {
                System.out.println("Whats is your gender?");
                this.gender = info.nextLine();
                userInfo[i] = gender;
            }
        }
    }

    public void getInfo() {
        System.out.println(Arrays.toString(userInfo));
    }
}
