package org.Masri.SimpleRest;

public class Student {
    private String name;
    private double grade;
    public Student (String name , double grade){
        this.name=name;
        if (grade>=0)
            if (grade<=100)
        this.grade=grade;
    }
    public String getLatterString(){
        if(grade>=90){
            return "A";
        } else if (grade<90 && grade>=80) {
            return "B";
        } else if (grade<80 &&grade>=70) {
            return "C";
        } else if (grade<70 && grade>=60) {
            return "D";
        }else {
            return "F";
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
       if (grade>=0)
           if (grade<=100)
                this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
