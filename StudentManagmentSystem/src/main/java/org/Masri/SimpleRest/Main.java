package org.Masri.SimpleRest;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Create some instructors
        Instructor instructor1 = new Instructor("I001", "John Doe", "john.doe@example.com");
        Instructor instructor2 = new Instructor("I002", "Jane Smith", "jane.smith@example.com");
        Instructor instructor3 = new Instructor("I002", "Ahmad Smith", "Ahmad.smith@example.com");
        // Create some courses
        Course course1 = new Course("C001", "Introduction to Programming", instructor1);
        Course course2 = new Course("C002", "Data Structures", instructor2);
        Course course3 = new Course("CS02", "Parallel", instructor3);
        // Create a department and add courses
        Department department = new Department("D001", "Computer Science");
        department.setCourses(course1);
        department.setCourses(course2);
        department.setCourses(course3);

        // Create some students
        Student student1 = new Student("Alice", "alice@example.com");
        Student student2 = new Student( "Bob", "bob@example.com");

        // Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        student1.enrollCourse(course3);

        // Add grades for students
        student1.setGrades(course1, 1.5);
        student1.setGrades(course2, 1.0);
        student2.setGrades(course1, 2.8);
        student1.setGrades(course3,0.5);

        // Find student by ID
        Student foundStudent = Services.findStudentById(Arrays.asList(student1, student2), student1.getStudentId());
        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent.getName());
        }

        // Sort students by GPA
        List<Student> sortedStudents = Services.sortStudentsByGPA(Arrays.asList(student1, student2));
        System.out.println("Students sorted by GPA:");
        for (Student student : sortedStudents) {
            System.out.println(student.getName() + ": " + Services.calculateGPA(student));
        }
        System.out.println(
        );
        System.out.println();
        student1.getGrades().forEach((course, aDouble) -> System.out.println(aDouble));
    }
}