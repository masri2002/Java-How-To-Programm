package org.Masri.SimpleRest;

import java.security.SecureRandom;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private final static SecureRandom random = new SecureRandom();
    private enum Status {WON,COUNTINE,LOSE}
    private static final int SNAKE_EYES=2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    private static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        int bankAccount=1000;
        System.out.println("Enter Your Wager");
        int wager=in.nextInt();
        if(wager<=bankAccount) {
                String[] chatter = {"Oh,you're going for broke",
                        " huh? Aw c'mon, take a chance!",
                        "You're up big. Now's the time to cash in your chips!"};
                Status status;
                int myPoint = 0;
                int sumOfDice = rollDice();
                switch (sumOfDice) {
                    case SEVEN:
                    case YO_LEVEN:
                        status = Status.WON;
                        break;
                    case SNAKE_EYES:
                    case TREY:
                    case BOX_CARS:
                        status = Status.LOSE;
                        break;
                    default:
                        status = Status.COUNTINE;
                        myPoint = sumOfDice;
                        System.out.printf("Point is %d%n", myPoint);
                        break;
                }
                while (status == Status.COUNTINE) {
                    sumOfDice = rollDice();
                    if (sumOfDice == myPoint) {
                        status = Status.WON;
                    } else if (sumOfDice == SEVEN) {
                        status = Status.LOSE;
                    }
                    System.out.println(chatter[random.nextInt(chatter.length)]);
                }
                if (status == Status.WON) {
                    System.out.println("Player Win");
                    bankAccount+=wager;
                    System.out.printf("Your Balance now %d" ,bankAccount);
                    System.out.println("You want play Again ? 1-yes 2-no");
                    int PlayAgain=in.nextInt();
                    if(PlayAgain==1) {
                        Main.main(args);
                    }

                } else {
                    System.out.println("Player Lose" );
                    bankAccount-=wager;
                    System.out.printf("Your Balance now %d%n" ,bankAccount);
                    System.out.println("You want play Again ? 1-yes 2-no");
                    int PlayAgain=in.nextInt();
                    if(PlayAgain==1) {
                        Main.main(args);
                    }

                }
            }
        else{
            System.out.println("Please Enter Valid Wager ");
            Main.main(args);
        }
    }
    public static int rollDice(){
        int firstDice = 1+random.nextInt(6);
        int secondDice = 1+random.nextInt(6);
        System.out.printf("Player Rolled: %d + %d = %d %n", firstDice, secondDice, firstDice+secondDice);
        return firstDice + secondDice;
    }
}