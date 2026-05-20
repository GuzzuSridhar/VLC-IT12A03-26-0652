package classesandobjects;

import java.util.Scanner;

public class Employee {
    String empId;
    String empName;
    String dept;
    float salary;

    public Employee(String empId, String empName, String dept, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[2];
        Scanner sc = new Scanner(System.in);
        String id, name, dep;
        float sal;

        for (int i = 0; i < emp.length; i++) {
            // sc.nextLine();

            System.out.print("Eneter the Employee ID: ");
            id = sc.nextLine();

            System.out.print("Eneter the Employee Name: ");
            name = sc.nextLine();

            System.out.print("Eneter the Employee Department: ");
            dep = sc.nextLine();

            System.out.print("Eneter the Employee Salary: ");
            sal = sc.nextFloat();
            sc.nextLine();

            emp[i] = new Employee(id, name, dep, sal);
        }

        sc.close();

        for (Employee e : emp) {
            System.out.println(e.empName + " - " + e.empId + " - " + e.dept + " - " + e.salary);
        }
    }

}
