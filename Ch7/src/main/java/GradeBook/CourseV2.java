package GradeBook;

public class CourseV2 {
    private String courseName;

    private int [][] grade;
    public CourseV2(String courseName, int [][] grade) {
        this.courseName = courseName;
        this.grade =grade;
    }
    public String getCourseName() {
        return courseName;
    }
    public int[][] getGrade() {
        return grade;
    }
    public double maxGrade(){
        double max = this.grade[0][0];
        for(int i=1;i<this.grade.length;i++){
            for (int j=0;i<grade[i].length;j++) {
                if (this.grade[i][j] > max) {
                    max = this.grade[i][j];

                }
            }
        }
        return max;
    }
    public double minGrade(){
        double min = this.grade[0][0];
       for(int i=1;i<this.grade.length;i++){
           for (int j=0;j<grade[i].length;i++) {
               if (this.grade[i][j] < min) {
                   min = this.grade[i][j];
               }
           }
       }
       return min;
    }
    public void printGrade(){
        double sum=0;
        System.out.printf("%22s%11s%11s%11s%n","G1","G2","G3","Average");
        for(int i=0;i<this.grade.length;i++){
             sum=grade[i][0]+grade[i][1]+grade[i][2];
            System.out.printf("Student %d  :%10d %10d %10d %10.2f%n", i + 1, this.grade[i][0],this.grade[i][1],this.grade[i][2],sum/3);
           }
           }
    }
//    public double averageGrade(){
//        double sum = 0;
//        for(int i=0;i<this.grade.length;i++){
//            sum += this.grade[i];
//        }
//        return sum/this.grade.length;
//    }
//    public void printGradeDistribution(){
//        int frequency[]=new int[11];
//        for (int k : this.grade) {
//            ++frequency[(k / 10)];
//        }
//        System.out.println("Grade Distribution");
//        for (int i=0;i<frequency.length;i++){
//           if(i==10){
//               System.out.printf("%5d:",i*10);
//           }else {
//               System.out.printf("%02d-%02d:", i * 10, i * 10 + 9);
//           }
//            for(int j=0;j<frequency[i];j++) {
//                System.out.print("*");
//            }
//                System.out.println();
//
//        }
 //}
//}
