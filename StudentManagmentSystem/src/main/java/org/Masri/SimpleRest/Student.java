package org.Masri.SimpleRest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    static int count=0;
    static final String EMAIL_PATTERN =
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private String studentId;
    private String name;
    private String email;
    private List<Course> enrolledCourses;
    private Map<Course, Double> grades;

    public Student(String name, String email) {
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()){
            throw new IllegalArgumentException("Email must Be As : example@email.com");
        }
        this.studentId = generateStudentId(name);
        this.name = name;
        this.email = email;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
        }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()){
            throw new IllegalArgumentException("Email must Be As : example@email.com");
        }
        this.email = email;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(Course course) {
        if(!enrolledCourses.contains(course)){
            enrolledCourses.add(course);

        }
    }

    public Map<Course, Double> getGrades() {
        return grades;
    }

    public void setGrades(Course course ,double grade) {
        if(grade<0.0 || grade>4.0){
            throw new IllegalArgumentException("Grade must be between 0.0 and 4.0");
        }
        if(enrolledCourses.contains(course)){
            grades.put(course,grade);
        }
    }
    public static String generateStudentId(String name) {
        return name.substring(0, 3).toUpperCase() + System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", enrolledCourses=" + enrolledCourses +
                ", grades=" + grades +
                '}';
    }
}
