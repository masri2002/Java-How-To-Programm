import java.util.Scanner;

public class Polling {
    static Scanner in =new Scanner(System.in);
    public static void main(String[]args){
        String[] topics = { "Climate Change", "Healthcare", "Education", "Income Inequality", "Immigration" };
        int [][]response=new int[5][10];
        for (int i = 0; i < 5; i++) {
            System.out.println("Rate the following issue from 1 (least important) to 10 (most important):");
            System.out.println(topics[i]);
            int rate=in.nextInt();
            while (rate<1 || rate>10){
                System.out.println("Invalid rating. Please enter a rating from 1 to 10:");
                rate=in.nextInt();
            }
            response[i][rate-1]++;
        }
        System.out.printf("%-20s", "Topic");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-4d", i);
        }
        System.out.printf("%-10s", "Average");
        System.out.println();
        int highestPoint=0;
        int lowestPoint=Integer.MAX_VALUE;
        String highestTopic="";
        String lowestTopic="";
        for (int i=0;i<topics.length;i++){
            System.out.printf("%-20s", topics[i]);
            int totalPoints = 0;
            int totalRatings = 0;
            for (int j=0;j<10;j++){
                System.out.printf("%-4d", response[i][j]);
                totalPoints += response[i][j] * (j + 1);
                totalRatings += response[i][j];
            }
            double average = totalRatings == 0 ? 0 : (double) totalPoints / totalRatings;
            System.out.printf("%-10.2f", average);
            System.out.println();

            if (totalPoints > highestPoint) {
                highestPoint = totalPoints;
                highestTopic = topics[i];
            }
            if (totalPoints < lowestPoint) {
                lowestPoint = totalPoints;
                lowestTopic = topics[i];
            }
        }

        System.out.println("Highest Point Total: " + highestTopic + " with " + highestPoint + " points.");
        System.out.println("Lowest Point Total: " + lowestTopic + " with " + lowestPoint + " points.");

    }
    }

