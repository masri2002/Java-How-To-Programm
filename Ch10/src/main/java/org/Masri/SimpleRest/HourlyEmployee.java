package org.Masri.SimpleRest;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String SSN, double wage, double hours) {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage<=0.0){
            throw new IllegalArgumentException("\"Hourly wage must be >= 0.0\"");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)){
            throw  new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }

    @Override
    double earnings() {
       if (hours<=40){
           return getHours()*getWage();
       }
        return 40*getWage() +(getHours()-40)*wage*1.5;
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(),"Hourly Wage",getWage(),
                "Hour Worked",getHours());

    }
}
