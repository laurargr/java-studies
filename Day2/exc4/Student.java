package Day2.exc4;

public class Student {
    public int studentId;
    public String studentName;
    public int grade;

    public Student () {

    }
    public Student (int studentId, String studentName, int grade) {
        this();
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
}
