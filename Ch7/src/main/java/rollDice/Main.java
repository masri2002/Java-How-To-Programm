package rollDice;

import java.security.SecureRandom;

public class Main {
    public static void main(String[]args){
        int frequency [][]=new int[6][6];
        SecureRandom random=new SecureRandom();
        for (int i=0;i<36000000;i++){
            int dice1=random.nextInt(frequency.length);
            int dice2=random.nextInt(frequency.length);
            ++frequency[dice1][dice2];
        }
        System.out.println("     1    2    3    4    5    6");
        for (int i=0;i<frequency.length;i++){
            System.out.print(i+1);
            for (int j=0;j<frequency[i].length;j++){
                System.out.print("  "+frequency[i][j]);
            }
            System.out.println();
        }
    }
}
