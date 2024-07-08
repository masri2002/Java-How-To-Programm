package org.Masri.SimpleRest;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void salesCommission() {
        Scanner sc = new Scanner(System.in);
        double totalSeals = 0;

        int numberOfItems=sc.nextInt();
        while (numberOfItems >0) {
            System.out.println("Enter Item price for Sales");
            totalSeals +=sc.nextDouble();
            numberOfItems--;
        }
        System.out.println("Total sales commission: " + (200+(totalSeals*0.9)));
    }

}
