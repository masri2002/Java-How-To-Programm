package org.Masri.SimpleRest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Instructor {
    static final String EMAIL_PATTERN =
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private String instructorId;
    private String name;
    private String email;

    public Instructor(String instructorId, String name, String email) {
        Matcher matcher =pattern.matcher(email);
        if(!matcher.matches()){
            throw new IllegalArgumentException("Email must Be As : example@email.com");
        }
        this.instructorId = instructorId;
        this.name = name;
        this.email = email;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
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
        Matcher matcher =pattern.matcher(email);
        if(!matcher.matches()){
            throw new IllegalArgumentException("Email must Be As : example@email.com");
        }
        this.email = email;
    }
}
