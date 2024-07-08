package org.Masri.SimpleRest;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void CalculateCreditLimit() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account number (-1 to quit): ");
            int accountNumber = input.nextInt();

            if (accountNumber == -1) {
                break;
            }

            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            int totalCharges = input.nextInt();

            System.out.print("Enter total credits: ");
            int totalCredits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + totalCharges - totalCredits;
            System.out.printf("New balance is %d%n", newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
        }
    }
}
