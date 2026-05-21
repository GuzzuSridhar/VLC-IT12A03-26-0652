package encapsulation;

public class Student {
    private int id;
    private String name;
    private int grade;

    public Student() {
    }

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // getter and setter methods for private feilds

    public int getId() {
        // time limit per day
        // or check user privileges
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
    }

}
