package interfaces;

public abstract class EmployeeAbstract implements Employee{
    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }
}
