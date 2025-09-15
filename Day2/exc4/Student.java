package Day2.exc4;

public class Student {
    public int studentId;
    public String studentName;
    public int grade;

    public Student () {
        this(10, "maria", 5);
    }
    public Student (int studentId, String studentName, int grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
}
