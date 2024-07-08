package GradeBook;

public class Course {
    private String courseName;

    private int [] grade;
    public Course(String courseName,  int [] grade) {
        this.courseName = courseName;
        this.grade =grade;
    }
    public String getCourseName() {
        return courseName;
    }
    public int[] getGrade() {
        return grade;
    }
    public double maxGrade(){
        double max = this.grade[0];
        for(int i=1;i<this.grade.length;i++){
            if(this.grade[i]>max){
                max = this.grade[i];

            }
        }
        return max;
    }
    public double minGrade(){
        double min = this.grade[0];
       for(int i=1;i<this.grade.length;i++){
           if(this.grade[i]<min){
               min = this.grade[i];
           }
       }
       return min;
    }
    public void printGrade(){
        for(int i=0;i<this.grade.length;i++){
            System.out.printf("Student %d  :%d%n",i+1 , this.grade[i]);
        }
    }
    public double averageGrade(){
        double sum = 0;
        for(int i=0;i<this.grade.length;i++){
            sum += this.grade[i];
        }
        return sum/this.grade.length;
    }
    public void printGradeDistribution(){
        int frequency[]=new int[11];
        for (int k : this.grade) {
            ++frequency[(k / 10)];
        }
        System.out.println("Grade Distribution");
        for (int i=0;i<frequency.length;i++){
           if(i==10){
               System.out.printf("%5d:",i*10);
           }else {
               System.out.printf("%02d-%02d:", i * 10, i * 10 + 9);
           }
            for(int j=0;j<frequency[i];j++) {
                System.out.print("*");
            }
                System.out.println();

        }
    }
}
