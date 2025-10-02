package StudentMiniCrud;

public class Student {
    private String name;
    private String grade;
    private String id;
    public Student(String name, String grade, String id) {
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
