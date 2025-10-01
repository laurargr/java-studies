import MiniCrud.FileM;
import MiniCrud.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_CYAN = "\u001B[36m";
        String option = "";

        List <Person> names = new ArrayList<>();

        while (!option.equals("5")) {
            System.out.println(ANSI_CYAN + "\n1. Add person" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "2. Show all" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "3. Update person" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "4. Delete person" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "5. Exit \n" + ANSI_RESET);

            option = scanner.nextLine();
            FileM fm = new FileM();

            if (option.equals("1")) {
                System.out.print(ANSI_BLUE + "Name: " + ANSI_RESET);
                String name = scanner.nextLine();
                Person p = new Person(name);
                names.add(p);
                fm.createFile(names);
            }
            if (option.equals("2")) {
                for (int i = 0; i < names.size(); i++) {
                    Person a = names.get(i);
                    System.out.println(a.getName());
                }
            }
            if (option.equals("3")) {
                System.out.print(ANSI_BLUE + "Name to update: " + ANSI_RESET);
                String existent = scanner.nextLine();
                System.out.print(ANSI_BLUE + "New name: " + ANSI_RESET);
                boolean found = false;
                String newName = scanner.nextLine();
                for (int i = 0; i < names.size(); i ++) {
                    Person getActual =names.get(i);
                    if (getActual.getName().equals(existent)) {
                        getActual.setName(newName);
                        names.set(i, getActual);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println(ANSI_RED + "person not found" + ANSI_RESET);
                } else {
                    System.out.println( ANSI_GREEN + "Updated successfully!" + ANSI_RESET);
                }
            }
            if (option.equals("4")) {
                System.out.print(ANSI_BLUE + "Name to delete: " + ANSI_RESET);
                String nameToRemove = scanner.nextLine();
                boolean found = false;
                for (int i = 0; i < names.size(); i++) {
                    Person getActual = names.get(i);
                    if (getActual.getName().equals(nameToRemove)) {
                        names.remove(i);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println(ANSI_RED + "person not found" + ANSI_RESET);
                } else {
                    System.out.println(ANSI_GREEN + "Updated successfully!" + ANSI_RESET);
                    fm.createFile(names);
                }
            }

        }
            if (option.equals("5")) {
                System.exit(0);
                scanner.close();
            }
    }
}

