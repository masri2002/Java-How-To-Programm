package CommissionEmployee;

public class BasePlusCommissionEmployee extends  CommissionEmployee implements Cloneable{
   private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
       if(baseSalary<0.0){
           throw new IllegalArgumentException("Base Salary must be >0.0");

       }

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
        return super.earnings()+this.baseSalary;
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f","commission employee" ,
                  super.getFirstName(),super.getLastName(),
                "social security number",super.getSocialSecurityNumber(),
                "gross sales",super.getGrossSales(),
                "Commission Rate",super.getCommissionRate(),
                "Base Salary", baseSalary);
    }

    @Override
    public BasePlusCommissionEmployee clone() {
        try {
            BasePlusCommissionEmployee clone = (BasePlusCommissionEmployee) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
