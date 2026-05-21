package encapsulation;

public class StudentData {
    public static void main(String[] args) {
        // Create a student Object using the constructor
        Student student = new Student(100, "John", 5);
        Student s = new Student();
        // s.id = 10; // not allowed
        s.setId(10);
        s.setName("Alex");
        s.setGrade(5);

        // System.out.println(s.id + " " + s.grade + " " + s.name );
        System.out.println(s.getId() + " " + s.getName() + " " + s.getGrade());

        // print the Student object
        System.out.println(student); // toString()
        System.out.println(s); // toString()
    }

}
