package enums;

public class Employee {
    String name;
    String dept;
    Job desig;

    @Override
    public String toString() {
        return "Employee: name=" + name + ", dept=" + dept + ", desig=" + desig;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "John";
        emp.dept = "Software";
        emp.desig = Job.DEVELOPER;

        System.out.println(emp);
    }
}
