package CAI;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

            while (true) {
                askQuestion();
            }
        }

        public static void askQuestion () {
            int num1 = random.nextInt(9) + 1; // generates a number between 1 and 9
            int num2 = random.nextInt(9) + 1; // generates a number between 1 and 9
            int correctAnswer = num1 * num2;
             String []correct = new String []{"Very good!","Excellent!","Nice work!","Keep up the good work!"};
             String [] wrong = new String[]{"No. Please try again.","Wrong. Try once more.","Don't give up!","No. Keep trying."};
            while (true) {
                System.out.printf("How much is %d times %d?%n", num1, num2);
                int studentAnswer = scanner.nextInt();

                if (studentAnswer == correctAnswer) {
                    System.out.println(correct[random.nextInt(correct.length)]);
                    break;
                } else {
                    System.out.println(wrong[random.nextInt(wrong.length)]);
                }
            }
        }
    }
