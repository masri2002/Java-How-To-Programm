package CommissionEmployee;

public class Main {
    public static void main(String []args){
        BasePlusCommissionEmployee employee =new BasePlusCommissionEmployee("ahmad","almasri","222-222-222",1000,0.9,1500);
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("Employee fullName%7s%8s%n",employee.getFirstName(),
                employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",
                employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is",
                employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is",
                employee.getCommissionRate());
        employee.setGrossSales(5000);
        employee.setCommissionRate(0.1);
        System.out.printf("%n%s:%n%n %n",
                employee);
        System.out.printf("%s : %.2f" , "Employee Salary is" ,employee.calculateSalary());
        BasePlusCommissionEmployee emp2 ;
        emp2=employee.clone();
        emp2=new BasePlusCommissionEmployee("ali","saleem","333-333-333",1000,0.3,2000);

        System.out.println();
        System.out.printf("%n%s:%n%n %n",
                emp2);
    }
}
