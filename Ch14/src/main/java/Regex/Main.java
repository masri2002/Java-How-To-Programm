package Regex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter first name:");
         String firstName = scanner.nextLine();
         System.out.println("Please enter last name:");
         String lastName = scanner.nextLine();
         System.out.println("Please enter address:");
         String address = scanner.nextLine();
         System.out.println("Please enter city:");
         String city = scanner.nextLine();
         System.out.println("Please enter state:");
         String state = scanner.nextLine();
         System.out.println("Please enter zip:");
         String zip = scanner.nextLine();
         System.out.println("Please enter phone:");
         String phone = scanner.nextLine();
        System.out.println("%nValidate Result:");

         if (!Validation.validateFirstName(firstName))
             System.out.println("Invalid first name");
         else if (!Validation.validateLastName(lastName))
             System.out.println("Invalid last name");
         else if (!Validation.validateAddress(address))
             System.out.println("Invalid address");
         else if (!Validation.validateCity(city))
              System.out.println("Invalid city");
         else if (!Validation.validateState(state))
             System.out.println("Invalid state");
         else if (!Validation.validatePhoneNumber(phone))
             System.out.println("Invalid phone number");
         else
         System.out.println("Valid input. Thank you.");
    }
}
