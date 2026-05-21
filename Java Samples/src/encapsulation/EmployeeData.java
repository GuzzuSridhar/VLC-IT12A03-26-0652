package encapsulation;

public class EmployeeData {
    public static void main(String[] args) {
        Employee e = new Employee("Alex", 100);
        Employee e1 = new Employee("John", 100);
        Employee e2 = new Employee("Sara", 100);

        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);
    }
}
