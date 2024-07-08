package Payable;

import java.util.Collection;
import java.util.Collections;

public class Main {
    static public void main(String []args){
        Payable payables[]=new Payable[4];
         payables[0] = new Invoice("01234", "seat", 2, 375.00);
         payables[1] = new Invoice("56789", "tire", 4, 79.95);
         payables[2] =
                 new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
         payables[3] =
                 new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);
        System.out.println(
                 "Invoices and Employees processed polymorphically:");
       for(Payable payable : payables){
           System.out.printf("%n%s %n%s: $%,.2f%n",
                   payable.toString(),
                   "Payment due",payable.getPaymentAmount());
       }

    }
}
