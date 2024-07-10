package example;

public class PatternPrinter {
    public static void main(String[] args) {
        int n = 9; // Total number of lines
        printPattern(n, 1);
    }

    private static void printPattern(int n, int current) {
        if (current > n) {
            return;
        }

        // Print leading spaces
        for (int i = 1; i < current; i++) {
            System.out.print(" ");
        }

        // Print asterisks
        System.out.print("*");

        // Print spaces between asterisks (if not the first line)
        if (current > 1) {
            for (int i = 1; i < current; i++) {

                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println(); // New line

        // Recursive call
        printPattern(n, current + 1);
    }
}
