package classesandobjects;

public class Student {
    // instance variables
    String name;
    String major;
    int grade;
    // static Variables (class variables)
    static String schoolName = "Some School";
    static int objCount;

    public Student(String name, String major, int grade) {
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public static void main(String[] args) {
        // Student.schoolName = "Some School";
        // instance creation
        Student s1 = new Student("Johny", "Science", 7);
        // access the instance variable thru the instance only (in this case s1)
        System.out.println(s1.name);
        System.out.println(s1.grade);
        System.out.println(s1.major);
        System.out.println(Student.schoolName);

        // static variables do not need an instance to be accessed
        // they can be accessed with the class name
        // all instances share the same value of a static variable
        Student.objCount++;

        Student s2 = new Student("Alex", "English", 7);
        System.out.println(s2.name);
        System.out.println(s2.grade);
        System.out.println(s2.major);
        System.out.println(Student.schoolName);
        Student.objCount++;

        System.out.println(Student.objCount + " students added");
    }

}
