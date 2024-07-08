package org.Masri.SimpleRest;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Department {
    private static final String COURSE_NAME_PATTERN = ".{5,}";

    private static final Pattern pattern = Pattern.compile(COURSE_NAME_PATTERN);
    private String departmentId;
    private String departmentName;
    private List<Course> courses;

    public Department(String departmentId, String departmentName) {
        Matcher matcher=pattern.matcher(departmentName);
        if(!matcher.matches()){
            throw  new IllegalArgumentException("The Department Name Must Be At Least 4 Character!!");
        }
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.courses=new ArrayList<>();

    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        Matcher matcher=pattern.matcher(departmentName);
        if(!matcher.matches()){
            throw  new IllegalArgumentException("The Department Name Must Be At Least 4 Character!!");
        }
        this.departmentName = departmentName;
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(Course course) {
        if(!courses.contains(course)){
            this.courses.add(course);
        }
    }
}
