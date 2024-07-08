package org.Masri.SimpleRest;

public class Company {
    private String name;
    private Integer yearsOfWork;
    private Double fiscalValue;
    private Integer nrEmployees;
    Department department;

    public Company(String name, Integer yearsOfWork, Double fiscalValue, Integer nrEmployees, Department department) {
        this.name = name;
        this.yearsOfWork = yearsOfWork;
        this.fiscalValue = fiscalValue;
        this.nrEmployees = nrEmployees;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", yearsOfWork=" + yearsOfWork +
                ", fiscalValue=" + fiscalValue +
                ", nrEmployees=" + nrEmployees +
                ", department=" + department +
                '}';
    }
}
