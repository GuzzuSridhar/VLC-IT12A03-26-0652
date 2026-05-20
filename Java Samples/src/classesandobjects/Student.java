package classesandobjects;

public class Student {
    // instance variables
    String name;
    String major;
    int grade;
    float mathMarks;
    float englishMarks;
    float scienceMarks;

    // static Variables (class variables)
    static String schoolName = "Some School";
    static int objCount;

    public Student(String name, String major, int grade, float mathMarks, float englishMarks, float scienceMarks) {
        this.name = name;
        this.major = major;
        this.grade = grade;
        this.mathMarks = mathMarks;
        this.englishMarks = englishMarks;
        this.scienceMarks = scienceMarks;
    }

    // instance method
    void totalMarks() {
        System.out.println("The total marks: " + (mathMarks + englishMarks + scienceMarks));
    }

    public static void main(String[] args) {
        // Student.schoolName = "Some School";
        // instance creation
        Student s1 = new Student("Johny", "Science", 7, 56.5f, 77f, 99f);
        // access the instance variable thru the instance only (in this case s1)
        System.out.println(s1.name);
        System.out.println(s1.grade);
        System.out.println(s1.major);
        s1.totalMarks();
        System.out.println(s1.schoolName);

        // System.out.println(Student.schoolName);

        // static variables do not need an instance to be accessed
        // they can be accessed with the class name
        // all instances share the same value of a static variable
        Student.objCount++;

        Student s2 = new Student("Alex", "English", 7, 66.6f, 54f, 88f);
        System.out.println(s2.name);
        System.out.println(s2.grade);
        System.out.println(s2.major);
        s2.totalMarks();
        System.out.println(s2.schoolName);
        // System.out.println(Student.schoolName);
        Student.objCount++;

        System.out.println(Student.objCount + " students added");
    }

}
