import StudentMiniCrud.FileM;

import java.util.Scanner;

public class MainStudent {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        String sc = "";
        FileM fm = new FileM();
        while (!sc.equals("5")) {
            System.out.println("1. Add student");
            System.out.println("2. Show all students");
            System.out.println("3. Search student by ID");
            System.out.println("4. Update grade by ID");
            System.out.println("5. Delete student");
            System.out.println("6. Exit");
            sc = scanner.nextLine();
            if (sc.equals("1")) {
                System.out.println("Student name: ");
                String name = scanner.nextLine();
                System.out.println("Student id: ");
                String id = scanner.nextLine();
                fm.Create(name, id);

            }
            if (sc.equals("2")) {
                fm.showAll();
            }
            if (sc.equals("3")) {
                System.out.println("Student id: ");
                String id = scanner.nextLine();
                fm.searchStudent(id);
            }
            if (sc.equals("4")) {
                System.out.println("Student id: ");
                String id = scanner.nextLine();
                System.out.println("Student grade: ");
                String grade = scanner.nextLine();
                fm.updateGrade(id, grade);
            }
            if (sc.equals("5")) {
                System.out.println("Student name: ");
                String name = scanner.nextLine();
                fm.delete(name);
            }
            if (sc.equals("6")) {
                System.exit(0);
                scanner.close();
            }
        }
    }
}
