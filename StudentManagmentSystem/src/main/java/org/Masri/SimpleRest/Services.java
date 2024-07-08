package org.Masri.SimpleRest;

import java.util.List;

public class Services {
    public static Student findStudentById(List<Student> students, String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        throw new IllegalArgumentException("There is no Student with id:"+ studentId);
    }
    public static List<Student> sortStudentsByGPA(List<Student> students) {
        students.sort((s1, s2) -> Double.compare(calculateGPA(s2), calculateGPA(s1)));
        return students;
    }
    public static double calculateGPA(Student student) {
        double totalPoints = 0;
        int totalCourses = student.getGrades().size();
        for (double grade : student.getGrades().values()) {
            totalPoints += grade;
        }
        return totalCourses == 0 ? 0 : totalPoints / totalCourses;
    }
}
