package Final;

final public class  Final {
    int name;
    int student;
    private final int x;

    public Final(int x, int student, int name) {
        this.x = x;
        this.student = student;
        this.name = name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setStudent(int student) {
        this.student = student;
    }
}
