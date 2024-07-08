package org.Masri.SimpleRest;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeImpl implements IEmployee{
Scanner in = new Scanner(System.in);
        HashSet<Employee> setEmployees = new HashSet<>();
        Employee emp1 = new Employee(101, "Marin", 24, "Developer", 25000);
        Employee emp2 = new Employee(102, "Costel", 26, "Tester", 57000);
        Employee emp3 = new Employee(103, "Bob", 20, "DevOps Eng", 5000);
        Employee emp4 = new Employee(104, "Dan", 27, "System Eng", 70000);

     int id;
     String name;
     int age;
     String department;
     double salary;

     public EmployeeImpl(){
         setEmployees.add(emp1);
         setEmployees.add(emp2);
         setEmployees.add(emp3);
         setEmployees.add(emp4);
     }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void viewAllEmployees() {
      for(Employee e : setEmployees ){
          System.out.println(e);
      }
    }

    @Override
    public void viewEmployee() {
        int search =in.nextInt();
        setEmployees.stream().filter(Employee -> Employee.getId() ==search);
     }

    @Override
    public void deleteEmployee() {
         int id=in.nextInt();
         Employee e = (Employee) setEmployees.stream().filter(Employee -> Employee.getId() == id);
         setEmployees.remove(e);
    }

    @Override
    public void addEmployee() {
        System.out.println("Enter id:");
        id = in.nextInt();
        System.out.println("Enter name");
        name = in.next();
        System.out.println("Enter age");
        age = in.nextInt();
        System.out.println("Enter Department");
        department = in.next();
        System.out.println("Enter salary");
        salary=in.nextDouble();
        Employee emp = new Employee(id, name, age, department, salary);
        setEmployees.add(emp);
        System.out.println(emp);
        System.out.println("Employtee addeed successsfully");
    }
}
