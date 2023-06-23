package homework2;

import homework.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Prigojun", 21);
        System.out.println(employee.getId());
        System.out.println(employee.getSalary());
        System.out.println(employee.getSureName());
        
        employee = new Employee("Prigojun2");
        System.out.println(employee.getId());
        System.out.println(employee.getSalary());
        System.out.println(employee.getSureName());


    }
}
