package encapsulation;

public class EmployeeData {
    public static void main(String[] args) {
        // Usage of constructor
        Employee e = new Employee("Alex", 100);
        Employee e1 = new Employee("John", 100);
        Employee e2 = new Employee("Sara", 100);

        // Getter Methods
        System.out.println(e.name());
        System.out.println(e.id());

        // usage of toString()
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);
    }
}
