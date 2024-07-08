package org.Masri.SimpleRest;

public class CheckeBoardPatternofAsterisks {
    public static void print() {
        int column = 1;
        while (column <= 8) {
            int row = 1;
            while (row <= 16) {
                if (column % 2 != 0) {
                   if (row % 2 != 0) {
                       System.out.print("*");
                   }else{
                       System.out.print(" ");
                   }
                }else{
                    if (row % 2 == 0) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
           row++;
            }
            System.out.println();
            column++;
        }
    }
}
