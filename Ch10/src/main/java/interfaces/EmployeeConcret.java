package interfaces;

public class EmployeeConcret implements Employee {
    @Override
    public void print() {
        System.out.println(getClass().getName());
    }
}
