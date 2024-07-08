package ninePointThree;

public class BasePlusCommissionEmployee {
    private double baseSalary;
    private CommissionEmployee employee;
    public BasePlusCommissionEmployee(CommissionEmployee employee, double baseSalary) {

        if(baseSalary<0.0){
            throw new IllegalArgumentException("Base Salary must be >0.0");

        }
        this.employee=employee;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary<0.0){
            throw new IllegalArgumentException("Base Salary must be >0.0");

        }
        this.baseSalary = baseSalary;
    }
    public double calculateSalary(){
        return employee.earnings()+this.baseSalary;
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f","commission employee" ,
                employee.getFirstName(),employee.getLastName(),
                "social security number",employee.getSocialSecurityNumber(),
                "gross sales",employee.getGrossSales(),
                "Commission Rate",employee.getCommissionRate(),
                "Base Salary", baseSalary);
    }
    public String getFirstName() {
        return employee.getFirstName();
    }

    public String getLastName() {
        return employee.getLastName();
    }

    public String getSocialSecurityNumber() {
        return employee.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return employee.getGrossSales();
    }

    public void setGrossSales(double grossSales) {
        if (grossSales<=0){
            throw new IllegalArgumentException("grossSales must be >= 0.0");
        }
        employee.setGrossSales(grossSales);
    }

    public double getCommissionRate() {
        return employee.getCommissionRate();
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate>1.0 || commissionRate<=0.0){
            throw new IllegalArgumentException
                    ("commissionRate must be  0.0> commissionRate <=1.0");
        }
        employee.setCommissionRate(commissionRate);
    }


}
