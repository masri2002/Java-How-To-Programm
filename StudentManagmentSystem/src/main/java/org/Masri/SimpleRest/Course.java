package org.Masri.SimpleRest;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {
    private static final String COURSE_NAME_PATTERN = ".{5,}";

    private static final Pattern pattern = Pattern.compile(COURSE_NAME_PATTERN);
    private String courseId;
    private String courseName;
    private Instructor instructor;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName, Instructor instructor) {
        Matcher matcher = pattern.matcher(courseName);
        if(!matcher.matches()){
            throw new IllegalArgumentException("Course Name Must At least 4 characters");
        }
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        Matcher matcher = pattern.matcher(courseName);
        if(!matcher.matches()){
            throw new IllegalArgumentException("Course Name Must At least 4 characters");
        }
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void addNewStudents(Student student) {
        if(!enrolledStudents.contains(student)){
            enrolledStudents.add(student);
        }
    }
}
