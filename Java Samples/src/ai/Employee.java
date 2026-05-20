package ai;

public class Employee {
    String name;
    float salary;
    int age;

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "John";
        emp1.salary = 50000;
        emp1.age = 30;

        System.out.println("Name: " + emp1.name);
        System.out.println("Salary: " + emp1.salary);
        System.out.println("Age: " + emp1.age);

        Employee emp2 = new Employee();
        emp2.name = "Alice";
        emp2.salary = 60000;
        emp2.age = 28;

        Employee emp3 = new Employee();
        emp3.name = "Bob";
        emp3.salary = 55000;
        emp3.age = 35;

        Employee emp4 = new Employee();
        emp4.name = "Charlie";
        emp4.salary = 45000;
        emp4.age = 24;

        Employee emp5 = new Employee();
        emp5.name = "Diana";
        emp5.salary = 70000;
        emp5.age = 32;

        Employee emp6 = new Employee();
        emp6.name = "Edward";
        emp6.salary = 48000;
        emp6.age = 29;

    }
}
