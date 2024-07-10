package DivideByZero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int quotient(int numerator, int denominator) throws RuntimeException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        do {
            try {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator,
                        denominator, result);
                loop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n", inputMismatchException);
                System.out.println("Input must be an integer. Please try again.");
                 scanner.next();
            } catch (RuntimeException runtimeException) {
                System.err.printf("%nException: %s%n", runtimeException);
                System.out.println("Zero is an invalid denominator. Please try again.");
            }
            finally {
                System.out.println("Finally Block");
                scanner.close();
                System.exit(4);
            }
        } while (loop);
    }
    }
