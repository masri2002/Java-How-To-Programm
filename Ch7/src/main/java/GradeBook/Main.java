package GradeBook;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int [] grade ={100,50,78,90,93,94,80,77,66,65,40,10,9};
//        System.out.println(Arrays.stream(grade).max().getAsInt());
//        Course course=new Course("CS101" , grade);
//        course.printGrade();
//        course.printGradeDistribution();
        int[][] gradesArray = {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}};
        CourseV2 v2=new CourseV2("CS101",gradesArray);
        v2.printGrade();
    }
}
