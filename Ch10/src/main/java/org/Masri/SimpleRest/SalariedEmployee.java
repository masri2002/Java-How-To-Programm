package org.Masri.SimpleRest;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
       if (weeklySalary<0.0){
           throw new IllegalArgumentException("weekly salary must be >0.0");
       }
        this.weeklySalary = weeklySalary;
    }

    @Override
    double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f"
        ,super.toString() , "weekly salary",
                getWeeklySalary());
    }

}
