package Composition;

public class Employee {
    private static int employeeId=0;
    private String firstName;
    private String lastName;
    private Date hireDate;
    private Date birthDate;

    public Employee(String firstName, String lastName, Date hierDate, Date birthDate) {
        employeeId++;
        this.firstName = firstName;
        this.lastName = lastName;
        hireDate = hierDate;
        this.birthDate = birthDate;
    }

    public static int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s",
                lastName, firstName, hireDate, birthDate);
    }
}
