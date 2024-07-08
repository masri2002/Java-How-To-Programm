package Composition;
import static java.lang.Math.*;
public class Main {
    public static void main(String [] args){
        Date date =new Date(1984,3,20);
        Date date1=new Date(2024,2,4);
      Employee employee=new Employee("Ahmad","AlMasri",date1,date);
        Employee employee2=new Employee("Ahmad","AlMasri",date1,date);
        Employee employee3=new Employee("Ahmad","AlMasri",date1,date);
        System.out.println(employee);
        System.out.println(employee2.getEmployeeId());
        System.out.println("the pow of 3^8 =" + pow(3,8));
    }
}
