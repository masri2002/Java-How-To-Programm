package interfaces;

import org.w3c.dom.ls.LSOutput;

public class Main {
    static public  void main(String []a){
        Employee employee=new Employee() {
            @Override
            public void print() {
                System.out.println("hiiiiiiiiiiiiiiii");
            }
        };
           employee.print();
           EmployeeConcret concret=new EmployeeConcret();
           concret.print();
    }

}

