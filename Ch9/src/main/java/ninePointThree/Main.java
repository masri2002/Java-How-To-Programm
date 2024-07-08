package ninePointThree;

public class Main {
    public static void main(String []args){
        CommissionEmployee commissionEmployee =new CommissionEmployee("ahmad" , "almasri","222-222",1500,0.1);
        BasePlusCommissionEmployee employee=new BasePlusCommissionEmployee(commissionEmployee,1000);
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("Employee fullName%7s%8s%n",employee.getFirstName(),
                employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",
                employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is",
                employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is",
                employee.getCommissionRate());
        System.out.printf("%s : %.2f" ,"Salary" ,
                employee.calculateSalary());
        employee.setGrossSales(5000);
        employee.setCommissionRate(0.1);
        System.out.printf("%n%s:%n%n %n",
                employee);
        System.out.printf("%s : %.2f" ,"Salary" ,
                employee.calculateSalary());
    }
}
