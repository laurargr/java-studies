package Day3.Exc12;

import java.util.Arrays;

public class Student {
    private String studentName;
    private int studentId;
    private int[] grades;
    private int position;

    public Student() {
        this.grades = new int[5];
        this.position = 0;
    }

    public void setName(String studentName) {
        this.studentName = studentName;
    }

    public String getName() {
        return studentName;
    }

    public void setId(int studentId) {
        this.studentId = studentId;
    }

    public int getId() {
        return studentId;
    }

    public void addGrade(int grade) {
        if (position == 5) {
            System.out.println("Student " + studentName + " has all grades");
            return;
        }
        grades[position] = grade;
        position++;
    }
    public String info () {
        return studentName + studentId + Arrays.toString(grades);
    }
}